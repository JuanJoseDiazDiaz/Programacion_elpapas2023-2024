package Ejercicios_Interfaces;

import java.time.LocalDate;

public class FicheroPlano extends FicheroDeTexto{

    public FicheroPlano(String nombre, byte tamano, LocalDate fecha, String [] matriz) {
        super(nombre, tamano, fecha, matriz);
    }
    @Override
    public byte getSize() {
        return super.getSize();
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public static void imprimirFicheroPlano(){

    }
}
