package BoletinCadenasDeCaracter;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce una frase: ");
        String cadena = teclado.nextLine();
        desordenarCadena(cadena);
    }

    public static void desordenarCadena(String cadena) {
        cadena = cadena.toLowerCase();
        StringBuilder cadenaVocales = new StringBuilder();
        StringBuilder cadenaConsonantes = new StringBuilder();

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cadenaVocales.append(cadena.charAt(i));
                    break;
                default:
                    cadenaConsonantes.append(cadena.charAt(i));
            }
        }
        System.out.println(cadenaConsonantes.append(cadenaVocales));
    }
    public static String desordenarCadena2(String cadena){
        StringBuilder frase = new StringBuilder(cadena.replaceAll("\\s+", ""));
        int cont = 0;
        for (int i = 0; i < frase.length(); i++){
            switch (frase.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    frase.append(cadena.charAt(i));
                    frase.deleteCharAt(i);
                    i--;
                    break;
            }
            cont++;
        }
        return frase.toString();
    }
}
