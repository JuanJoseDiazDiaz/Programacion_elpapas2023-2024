package boletinObjetos.Aviones;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Avion {
    private static final int NUM_REVISIONES = 10;
    private String marca;
    private String modelo;
    private double consumo;

    private Deposito deposito;
    private Revision[] revisions;

    public Avion(String modelo, String marca, Deposito deposito, double depositoCombustible) {
        this.modelo = modelo;
        this.marca = marca;
        this.deposito = deposito;
        this.consumo = depositoCombustible;
        this.revisions = new Revision[10];
    }

    public void addRevision(Revision revision) {
        for (int i = 0; i < NUM_REVISIONES; i++) {
            if (revisions[i] == null) {
                this.revisions[i] = revision;
                break;
            }
        }
    }
    public Revision getUltimaRevision(){
        for (int i = NUM_REVISIONES -1; i >= 0;i--){
            if (revisions[i] != null){
                return revisions[i];
            }
        }
        return null;
    }
    public boolean puedeVolar(long distancia){
        Revision ultimaRevision = getUltimaRevision();
        double distanciaAlcanzable = deposito.getEstadoActual()/ consumo;
        if (distanciaAlcanzable < distancia && ultimaRevision.isEstadoAvion() && ultimaRevision.getFecha().plusMonths(ultimaRevision.getPeridoDeValidez()).isAfter(LocalDateTime.now())){
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "El avion de la marca " + marca + " con el modelo "
                + modelo+" tiene un consumo de "+ consumo
                + " litros por kilometros "+ deposito
                + ". Su ultima revision fue " + getUltimaRevision();
    }
}
