package Boletin3;

import java.util.Scanner;

public class Ej2Parte2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int f1 = 0;
        int f2 = 1;
        int f3;
        do {
            System.out.println("introduce un numero positivo: ");
            num1 = Integer.parseInt(teclado.nextLine());
        } while (num1 < 0);



    }
}
