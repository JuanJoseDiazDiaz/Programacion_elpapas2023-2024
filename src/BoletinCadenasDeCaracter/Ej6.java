package BoletinCadenasDeCaracter;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase o una palabra: ");
        String frase = teclado.nextLine();

        System.out.printf("En la palabra %s hay %d vocales diferentes", frase, contarVocalesDiferentes(frase));

    }

    public static int palabrasDiferentes(String frase) {
        int contadorPalabras = 0;
        frase = frase.toLowerCase();
        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;

        for (int j = 0; j < frase.length(); j++) {

            switch (frase.charAt(j)) {
                case 'a':
                    a = true;
                    break;
                case 'e':
                    e = true;
                    break;
                case 'i':
                    i = true;
                    break;
                case 'o':
                    o = true;
                    break;
                case 'u':
                    u = true;
                    break;
            }
        }
        if (a) contadorPalabras++;
        if (e) contadorPalabras++;
        if (i) contadorPalabras++;
        if (o) contadorPalabras++;
        if (u) contadorPalabras++;

        return contadorPalabras;
    }

    public static int contarVocalesDiferentes(String frase) {
        frase = frase.toLowerCase();
        int cont = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (char v : vocales) {
            if (frase.contains(v + "")) cont++;
        }
        return cont;
    }
}
