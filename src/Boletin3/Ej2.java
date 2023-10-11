package Boletin3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej2 {
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

        for (int i = 0; i < num1; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.println("la suceccion de numeros es: " + f1);
        }

    }
}


