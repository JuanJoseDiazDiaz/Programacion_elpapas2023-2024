package boletin_Matrices;

public class ej8 {
    public static void main(String[] args) {
        int[][] matriz ={{1,3,5}, {0,2,7}};
        int[][] matriz2 ={{4,3,5}, {6,8,9}};

        int[][] resultado = sumarMatrices(matriz, matriz2);
        System.out.println("Matriz 1:");
        imprimirPorPantalla(matriz);
        System.out.println("Matriz 2:");
        imprimirPorPantalla(matriz2);
        System.out.println("Resultado de la suma:");
        imprimirPorPantalla(resultado);

    }
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        if (filas != matriz2.length || columnas != matriz2[0].length) {
            System.out.println("Las matrices deben ser de igual tamaño");
        }

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }
    public static void imprimirPorPantalla(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
