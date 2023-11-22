package boletin_Matrices;

public class ej14 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("MATRIZ ORIGINAL: ");
        imprimirPorPantalla(matriz);

        System.out.println("MATRIZ TRANSFORMADA: ");
        transformarMatriz(matriz);
        imprimirPorPantalla(matriz);


    }
    public static void  transformarMatriz(int [][] matriz){
        int n = matriz[0].length;
        for (int i = 0; i < n + 1; i++){
            for (int j = i + 1 ; j < n ; j++){
                int acum = matriz[i][j];
                matriz[i][j]= matriz[j][i];
                matriz[j][i] = acum;
            }
        }
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
