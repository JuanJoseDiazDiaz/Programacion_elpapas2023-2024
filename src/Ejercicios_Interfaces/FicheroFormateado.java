package Ejercicios_Interfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FicheroFormateado extends Fichero implements Analizable{
    private String tipoFuente;
    private int tamanoFuente;
    private String colorFuente;

    public FicheroFormateado(String nombre) {
        super(nombre);
    }
    @Override
    public long getSize() {
        return 0;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String analizable() {
        return "Analizando: "+ getNombre();
    }
}
