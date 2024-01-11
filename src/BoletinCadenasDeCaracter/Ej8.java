package BoletinCadenasDeCaracter;

import java.util.Arrays;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String cadena = teclado.nextLine();
        System.out.println(cuentaPalabras(cadena));
    }
    public static int cuentaPalabras (String cadena){
        return cadena.trim().split("\\s+").length;
    }
}
