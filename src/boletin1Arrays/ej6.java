package boletin1Arrays;

import java.util.Scanner;

public class ej6 {
    public static boolean verificarArray(int[] array, int valorABuscar) {
        // Verificar si el valor está presente en el array
        for (int elemento : array) {
            if (elemento == valorABuscar) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir al usuario el tamaño del array
        System.out.print("Introduce el tamaño del array: ");
        int tamano = teclado.nextInt();

        // Pedir al usuario los elementos del array
        int[] elementos = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            elementos[i] = teclado.nextInt();
        }

        // Pedir al usuario el valor a buscar
        System.out.print("Introduce el valor a buscar: ");
        int valorABuscar = teclado.nextInt();

        // Verificar si el valor está presente en el array
        if (verificarArray(elementos, valorABuscar)) {
            System.out.println("El valor " + valorABuscar + " está presente en el array.");
        } else {
            System.out.println("El valor " + valorABuscar + " no está presente en el array.");
        }
    }
}
