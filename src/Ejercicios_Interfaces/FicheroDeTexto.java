package Ejercicios_Interfaces;

import java.time.LocalDate;

public abstract class FicheroDeTexto extends Fichero {

    private String[] matriz;


    public FicheroDeTexto(String nombre, byte tamano, LocalDate fecha, String[] matriz) {
        super(nombre, tamano, fecha);
        this.matriz = matriz;
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
