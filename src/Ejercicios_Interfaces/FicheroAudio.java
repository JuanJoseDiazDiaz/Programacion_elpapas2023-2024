package Ejercicios_Interfaces;

import java.sql.Time;
import java.time.LocalDate;

public class FicheroAudio extends Fichero{
    private byte [] contenido;
    private Time duracion;


    public FicheroAudio(String nombre, byte tamano, LocalDate fecha, byte[] contenido, Time duracion) {
        super(nombre, tamano, fecha);
        this.contenido = contenido;
        this.duracion = duracion;
    }

    @Override
    public long getSize() {
        return super.getSize();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
