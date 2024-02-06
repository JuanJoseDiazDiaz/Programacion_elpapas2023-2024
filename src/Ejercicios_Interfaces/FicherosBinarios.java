package Ejercicios_Interfaces;

import java.time.LocalDate;

public class FicherosBinarios extends Fichero{
    private Byte [] ficheroByte;


    public FicherosBinarios(String nombre, int tamano, LocalDate fecha, Byte [] ficheroByte) {
        super(nombre, tamano, fecha);
        this.ficheroByte = ficheroByte;
    }

    public Byte[] getFicheroByte() {
        return ficheroByte;
    }
}
