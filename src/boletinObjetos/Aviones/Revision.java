package boletinObjetos.Aviones;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Revision {
    private  boolean estadoAvion;
    private  LocalDateTime fecha;
    // Se mide en meses
    private  int peridoDeValidez;


    public Revision( LocalDateTime fecha, boolean estadoAvion, int peridoDeValidez) {
        if (fecha.isBefore(LocalDateTime.now())){
            this.fecha = fecha;
        }
        this.estadoAvion = estadoAvion;

        if (peridoDeValidez > 0){
            this.peridoDeValidez = peridoDeValidez;
        }

    }

    public boolean isEstadoAvion() {
        return estadoAvion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getPeridoDeValidez() {
        return peridoDeValidez;
    }
 //TODO ESTO SERÍA UNA TERNARIA
    @Override
    public String toString() {
        DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fecha.format(formateo) + " con resultado " + (estadoAvion ? "satisfactorio con una validez de "+ peridoDeValidez + " meses" : "No satisfactorio");
    }
}

