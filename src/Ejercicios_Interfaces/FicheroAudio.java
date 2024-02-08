package Ejercicios_Interfaces;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FicheroAudio extends Fichero implements Reproducible{
    private byte [] contenido;
    private int duracion;


    public FicheroAudio(String nombre, byte[] contenido) {
        super(nombre);
        this.contenido = contenido;
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
    public String reproducir() {
        return "Reproduciendo: " + getNombre();
    }
}
