package boletin1Arrays;

import java.util.Random;

public class pruebaEj4 {
    public static void main(String[] args) {
        int numN = 6000; // Cambia esta constante para ajustar la cantidad de números generados.
        int[] randomNumbers = new int[numN];

        // Generar números aleatorios y almacenarlos en el array.
        Random rand = new Random();
        for (int i = 0; i < numN; i++) {
            randomNumbers[i] = rand.nextInt(101);
        }

        // Calcular la media de los números leídos.
        int sum = 0;
        for (int num : randomNumbers) {
            sum += num;
        }
        double media = (double) sum / numN;

        // Inicializar contadores para cada dígito.
        int[] digitCount = new int[10];

        // Contar cuántos números terminan en cada dígito.
        for (int num : randomNumbers) {
            int lastDigit = num % 10;
            digitCount[lastDigit]++;
        }

        // Calcular el dígito en el que más números terminan.
        int maxCount = 0;
        int mostFrequentDigit = -1;
        for (int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] > maxCount) {
                maxCount = digitCount[i];
                mostFrequentDigit = i;
            }
        }

        // Calcular en qué dígitos no ha terminado ningún número.
        System.out.print("Dígitos que no han terminado ningún número: ");
        for (int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Calcular el porcentaje para cada dígito y la suma total de porcentajes.
        double totalPercentage = 0.0;
        for (int i = 0; i < digitCount.length; i++) {
            double percentage = (double) digitCount[i] / numN * 100;
            totalPercentage += percentage;
            System.out.printf("El nº %d se ha repetido %d veces. Esto equivale a un %.2f%%\n", i, digitCount[i], percentage);
        }

        // Calcular la media de porcentajes.
        double averagePercentage = totalPercentage / digitCount.length;

        System.out.printf("La suma de todos los porcentajes es equivalente al 100.00%%. El %% medio para cada contador es de %.2f%%\n", averagePercentage);
    }
}
