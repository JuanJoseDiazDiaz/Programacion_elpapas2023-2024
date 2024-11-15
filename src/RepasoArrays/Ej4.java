package RepasoArrays;

import java.util.Random;

public class Ej4 {
    public static void main(String[] args) {
            final int TOTAL_NUMEROS = 6000;
            final int LIMITE_NUMEROS = 100;

            Random random = new Random();
            int[] numeros = new int[TOTAL_NUMEROS];
            int[] contadorDigitos = new int[10];
            int sumaTotal = 0;

            // Generar números aleatorios y contar dígitos finales
            for (int i = 0; i < TOTAL_NUMEROS; i++) {
                numeros[i] = random.nextInt(LIMITE_NUMEROS + 1);
                int digitoFinal = numeros[i] % 10;
                contadorDigitos[digitoFinal]++;
                sumaTotal += numeros[i];
            }

            // Calcular estadísticas
            double media = (double) sumaTotal / TOTAL_NUMEROS;
            int maxRepeticiones = 0;
            int digitoMasRepetido = 0;
            double sumaPorcentajes = 0;

            System.out.println("Estadísticas:");
            for (int i = 0; i < contadorDigitos.length; i++) {
                int repeticiones = contadorDigitos[i];
                double porcentaje = (double) repeticiones * 100 / TOTAL_NUMEROS;

                sumaPorcentajes += porcentaje;

                if (repeticiones > maxRepeticiones) {
                    maxRepeticiones = repeticiones;
                    digitoMasRepetido = i;
                }

                System.out.printf("El nº %d se ha repetido %d veces. Esto equivale a un %.2f%%\n", i, repeticiones, porcentaje);
            }

            // Identificar dígitos que no aparecen
            System.out.println("\nDígitos que no han aparecido:");
            boolean algunFaltante = false;
            for (int i = 0; i < contadorDigitos.length; i++) {
                if (contadorDigitos[i] == 0) {
                    System.out.println("Dígito " + i);
                    algunFaltante = true;
                }
            }
            if (!algunFaltante) {
                System.out.println("Todos los dígitos aparecen al menos una vez.");
            }

            // Media de porcentajes para los primeros 6 valores (0 a 5)
            double sumaPorcentajesPrimerosSeis = 0;
            for (int i = 0; i <= 5; i++) {
                sumaPorcentajesPrimerosSeis += (double) contadorDigitos[i] * 100 / TOTAL_NUMEROS;
            }
            double mediaPorcentajesPrimerosSeis = sumaPorcentajesPrimerosSeis / 6;

            // Resultados finales
            System.out.println("\nResultados finales:");
            System.out.printf("La media de los números generados es: %.2f\n", media);
            System.out.printf("El dígito en el que más números terminan es el %d, con %d repeticiones.\n", digitoMasRepetido, maxRepeticiones);
            System.out.printf("La suma de todos los porcentajes es: %.2f%%\n", sumaPorcentajes);
            System.out.printf("La media de porcentajes de los primeros 6 dígitos es: %.2f%%\n", mediaPorcentajesPrimerosSeis);

    }
}
