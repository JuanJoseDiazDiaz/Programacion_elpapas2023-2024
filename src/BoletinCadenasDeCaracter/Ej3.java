package BoletinCadenasDeCaracter;

import java.util.Locale;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce una frase");
        String cadena = teclado.nextLine();
        if (esPalindromo(cadena)){
            System.out.println("lo es ");
        }else {
            System.out.println("No lo es ");
        }
    }
    public static boolean esPalindromo(String cadena){
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();
        for (int i = 0; i < cadena.length() /2; i++){
            if (cadena.charAt(i) != cadena.charAt(cadena.length()-i -1 )){
                return false;
            }
        }
        return true;
    }
}
