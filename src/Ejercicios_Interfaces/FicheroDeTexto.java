package Ejercicios_Interfaces;

import java.time.LocalDate;

public class FicheroDeTexto extends Fichero{

    private String [] matriz;


    public FicheroDeTexto(String nombre, byte tamano, LocalDate fecha, String [] matriz) {
        super(nombre, tamano, fecha);
        this.matriz = matriz;
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
