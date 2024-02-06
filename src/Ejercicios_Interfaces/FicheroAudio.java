package Ejercicios_Interfaces;

import java.sql.Time;
import java.time.LocalDate;

public class FicheroAudio extends Fichero{
    private byte [] contenido;
    private Time duracion;

    public FicheroAudio(String nombre, int tamano, LocalDate fecha, Time duracion, byte[] contenido) {
        super(nombre, tamano, fecha);
        this.contenido = contenido;
        this.duracion = duracion;
    }
}
