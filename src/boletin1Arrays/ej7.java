package boletin1Arrays;

public class ej7 {
    public static boolean contieneElemento(int[] array, int elementoABuscar) {
        // Verificar si el elemento está presente en el array
        for (int elemento : array) {
            if (elemento == elementoABuscar) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] miArray = {1, 2, 3, 4, 5};
        int elementoBuscado = 3;

        // Llamada al método contieneElemento
        boolean resultado = contieneElemento(miArray, elementoBuscado);

        // Mostrar el resultado
        if (resultado) {
            System.out.println("El elemento " + elementoBuscado + " está presente en el array.");
        } else {
            System.out.println("El elemento " + elementoBuscado + " no está presente en el array.");
        }
    }
}
