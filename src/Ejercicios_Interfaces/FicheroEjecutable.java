package Ejercicios_Interfaces;

import java.time.LocalDate;

public class FicheroEjecutable extends Fichero{
    private Byte[] contenido;
    private int permiso;


    public FicheroEjecutable(String nombre, byte tamano, LocalDate fecha, Byte[] contenido, int permiso) {
        super(nombre, tamano, fecha);
        this.contenido = contenido;
        this.permiso = permiso;
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
