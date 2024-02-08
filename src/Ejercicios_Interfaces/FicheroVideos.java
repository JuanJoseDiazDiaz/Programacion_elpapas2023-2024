package Ejercicios_Interfaces;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FicheroVideos extends Fichero implements Reproducible{
    private byte [] contenido;
    private Time duracion;

    public FicheroVideos(String nombre, byte[] contenido) {
        super(nombre);
        this.contenido= contenido;
    }
    @Override
    public long getSize() {
        return super.getSize();
    }
    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public String reproducir() {
        return "Reproduciendo: "+ getNombre();
    }
}
