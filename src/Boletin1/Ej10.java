package Boletin1;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        long factorial;

        do {
            System.out.print("Ingresa un número entero positivo o cero: ");
            numero = scanner.nextInt();
        } while (numero < 0);

        factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
    }
