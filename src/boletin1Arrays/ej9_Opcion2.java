package boletin1Arrays;

public class ej9_Opcion2 {
    public static void main(String[] args) {
        int[] miarray = {1, 2, 5, 6, 7, 2, 1};
        int[] arrayAux = new int[miarray.length];
        int noRepetidos = 0;

        for (int i = 0; i < miarray.length; i++) {
            boolean numRepetidos = false;

            // Verificar si el elemento ya existe en arrayAux
            for (int j = 0; j < noRepetidos; j++) {
                if (miarray[i] == arrayAux[j]) {
                    numRepetidos = true;
                    break;
                }
            }

            // Si el elemento no está repetido, agregarlo a arrayAux
            if (!numRepetidos) {
                arrayAux[noRepetidos++] = miarray[i];
            }
        }

        // Imprimir los elementos únicos en arrayAux
        System.out.print("Elementos únicos: ");
        for (int k = 0; k < noRepetidos; k++) {
            System.out.print(arrayAux[k] + " ");
        }
    }

}
