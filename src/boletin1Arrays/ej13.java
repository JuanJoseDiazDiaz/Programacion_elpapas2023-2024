package boletin1Arrays;

import java.util.Arrays;

public class ej13 {

        public static void main(String[] args) {
            int[] arrayOriginal = {1, 2, 4, 5, 6, 7, 6, 8, 9, 10};
            int[] miArray = new int[arrayOriginal.length];

            int noRepetidos = apilarNumeros(arrayOriginal, miArray);
            System.out.println("Número de elementos después de apilar: " + noRepetidos);

            int noRepetidosDesapilar = desapilarNumeros(miArray);
            System.out.println("Número de elementos después de desapilar: " + noRepetidosDesapilar);
            mostrar(miArray);
        }

        public static int apilarNumeros(int[] arrayOriginal, int[] miArray) {
            int noRepetidos = 0;

            for (int i = 0; i < arrayOriginal.length; i++) {
                boolean repetidos = false;

                for (int j = 0; j < noRepetidos && !repetidos; j++) {
                    if (arrayOriginal[i] == miArray[j]) {
                        repetidos = true;
                    }
                }

                if (!repetidos) {
                    miArray[noRepetidos++] = arrayOriginal[i];

                }
            }

            return noRepetidos;
        }

        public static int desapilarNumeros(int[] miArray) {
            int noRepetidos = miArray.length;

            for (int i = 0; i < noRepetidos; i++) {
                for (int j = i + 1; j < noRepetidos; j++) {
                    if (miArray[i] == miArray[j]) {
                        // Eliminar elemento repetido
                        for (int k = j; k < noRepetidos - 1; k++) {
                            miArray[k] = miArray[k + 1];
                        }
                        noRepetidos--;
                        j--;

                    }
                }
            }

            return noRepetidos;
        }
        public static void mostrar(int [] array){
            System.out.println(Arrays.toString(array));
        }
    }

