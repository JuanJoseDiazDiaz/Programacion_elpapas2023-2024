package Ejercicios_Interfaces;

import java.time.LocalDate;

public class FicheroPlano extends Fichero{

    public FicheroPlano(String nombre, byte tamano, LocalDate fecha) {
        super(nombre, tamano, fecha);
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
