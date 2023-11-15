package boletin1Arrays;

public class ordenamientoBurbuja {
    public static void main(String[] args) {
        int[] miArray = {2, 4, 3, 5, 7, 6, 8};
        int[] arrayOrdenado = ordenBurbuja(miArray);

        // Print the sorted array
        System.out.println("Array ordenado:");
        for (int i : arrayOrdenado) {
            System.out.print(i + " ");
        }
    }

    public static int[] ordenBurbuja(int[] array) {
        int n = array.length;
        boolean huboIntercambio;

        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    huboIntercambio = true;
                }
            }

            // If no two elements were swapped, the array is already sorted
            if (!huboIntercambio) {
                System.out.println("El array ya está ordenado.");
                break;
            }
        }

        return array;
    }
}
