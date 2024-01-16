package Avion;

import java.time.LocalDateTime;
import java.util.Arrays;

public class avion {
    private static final int NUM_REVISIONES = 10;
    private String marca;
    private String modelo;
    private double consumo;
    private depositoCombustible deposito;
    private registroRevisiones [] registro;

    public avion(String marca, String modelo, double consumo, depositoCombustible combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.deposito = combustible;
        this.registro = new registroRevisiones[10];
    }
    public void addRevision(registroRevisiones revision) {
        for (int i = 0; i < NUM_REVISIONES; i++) {
            if (registro[i] == null) {
                this.registro[i] = revision;
                break;
            }
        }
    }
    public registroRevisiones getUltimaRevision(){
        for (int i = NUM_REVISIONES -1; i >= 0;i--){
            if (registro[i] != null){
                return registro[i];
            }
        }
        return null;
    }
    public boolean puedeVolar(long distancia){
        registroRevisiones ultimaRevision = getUltimaRevision();
        double distanciaAlcanzable = deposito.getEstadoActual()/ consumo;
        if (distanciaAlcanzable < distancia && ultimaRevision.isEstadoAvion() && ultimaRevision.getFecha().plusMonths(ultimaRevision.getPeridoDeValidez()).isAfter(LocalDateTime.now())){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                ", deposito=" + deposito +
                ", registro=" + Arrays.toString(registro) +
                '}';
    }
}
