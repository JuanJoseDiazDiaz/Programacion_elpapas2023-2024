package Ejercicios_Interfaces;

import java.time.LocalDate;

public class FicheroEjecutable extends Fichero{
    private byte [] contenido;
    private int permiso;

    public FicheroEjecutable(String nombre, int tamano, LocalDate fecha, byte[] contenido, int permiso) {
        super(nombre, tamano, fecha);
        this.contenido= contenido;
        this.permiso = permiso;
    }
}
