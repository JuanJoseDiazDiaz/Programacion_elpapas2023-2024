package Ejercicios_Interfaces;

import java.sql.Time;
import java.time.LocalDate;

public class FicheroVideos extends Fichero{
    private byte [] contenido;
    private Time duracion;

    public FicheroVideos(String nombre, byte tamano, LocalDate fecha, byte[] contenido, Time duracion) {
        super(nombre, tamano, fecha);
        this.contenido= contenido;
        this.duracion = duracion;
    }
    @Override
    public byte getTamano() {
        return super.getTamano();
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
