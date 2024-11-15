package RepasoArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario cuántos elementos tendrá el array
        System.out.print("Introduzca las posiciones que tendrá el array: ");
        int n = scanner.nextInt();

        // Crear el array
        int[] numeros = new int[n];

        // Llenar el array con valores introducidos por el usuario
        for (int i = 0; i < n; i++) {
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Variables para cálculos
        int mayor = numeros[0];
        int menor = numeros[0];
        int suma = 0;
        int repeticionesMayor = 0;
        int repeticionesMenor = 0;

        // Encontrar el mayor, el menor y sumar los números
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            suma += numero;
        }

        // Calcular las repeticiones del mayor y el menor
        for (int numero : numeros) {
            if (numero == mayor) {
                repeticionesMayor++;
            }
            if (numero == menor) {
                repeticionesMenor++;
            }
        }

        // Calcular la media
        double media = (double) suma / n;

        // Mostrar resultados
        System.out.println("El mayor número introducido es " + mayor +
                " (se repite " + repeticionesMayor + " veces)");
        System.out.println("El menor número introducido es " + menor +
                " (se repite " + repeticionesMenor + " veces)");
        System.out.println("La media de los números introducidos es: " + media);

        scanner.close();
    }
}



