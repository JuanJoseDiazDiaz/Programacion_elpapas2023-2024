package BoletinCadenasDeCaracter;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String cadena = teclado.nextLine().toLowerCase();
        System.out.printf("el total de la suma de los numeros comprendidos en la frase es de %d ", contarCaracteres(cadena));
    }
    public static int contarCaracteres (String cadena) {
        int cont = 0;
        int numeroActual = 0;
        for (int i = 0; i < cadena.length(); i++){ // RECORRE LA FRASE
            if (Character.isDigit(cadena.charAt(i))){ //LOCALIZA UN PRIMER DIGITO
                numeroActual = numeroActual * 10 + Integer.parseInt(cadena.charAt(i)+ "");
            }else {
                if (numeroActual > 0 ){
                    cont += numeroActual;
                    numeroActual = 0;
                }
            }
        }
        return cont + numeroActual;
    }
}
