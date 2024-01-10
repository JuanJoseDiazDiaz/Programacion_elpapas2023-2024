package BoletinCadenasDeCaracter;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una frase original: ");
        String frase = teclado.nextLine();
        System.out.println("Introduzca texto a buscar: ");
        String palabra1 = teclado.nextLine();
        System.out.println("Introduzca texto a reemplazar: ");
        String palabra2 = teclado.nextLine();
        System.out.println("\n"+ reemplazarPalabra(frase, palabra1, palabra2));
    }
    private static String reemplazarPalabra (String frase, String reemplazado, String reemplazador){
        for(int i = frase.indexOf(reemplazado);i  != -1; i += reemplazado.length()){

        }
        return frase;
    }
}
