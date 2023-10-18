package boletin4;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce dos nummeros: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int mcd = MiEntradaSalida2.MiEntradaSalida.EuclideanAlgorithm(num1, num2);
        System.out.println("El MCD de " + num1 + " y " + num2 + " es " + mcd);
    }
}
