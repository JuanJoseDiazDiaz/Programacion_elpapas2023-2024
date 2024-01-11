package BoletinCadenasDeCaracter;

import java.io.FileReader;
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
        StringBuilder str = new StringBuilder(frase);
        for(int i = 0;i  != -1; i += reemplazador.length()){
                i = str.indexOf(reemplazado, i);
                if (i != -1){
                    str.delete(i, i +reemplazado.length());
                    str.insert(i, reemplazador);
                }else {
                   // i = -1 ;
                    break;
                }
        }
        return String.valueOf(str);
    }
}
