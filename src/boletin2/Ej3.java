package boletin2;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce las siguientes notas: ");
        System.out.println("introduce la nota de mates : ");
        double notaMat = teclado.nextDouble();
        System.out.println("introduce la nota de lengua : ");
        double notaLeng = teclado.nextDouble();
        System.out.println("introduce la nota de programacion : ");
        double notaProg = teclado.nextDouble();

        double media = notaMat + notaLeng + notaProg /10;
        System.out.println("Tu promedio es: " + media);

    }

}
