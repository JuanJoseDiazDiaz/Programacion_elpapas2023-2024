package boletin_Matrices;

public class ej16 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };


        System.out.println("MATRIZ ORIGINAL: ");
        imprimirPorPantalla(matriz);

        System.out.println("Resultado de la matriz: ");
        casillasADya(matriz);
        imprimirPorPantalla(matriz);
    }
    public static void casillasADya(int [][] matriz){
        int fila = matriz.length;
        int columna = matriz[0].length;

        for (int i = 0; i < fila; i++){
            for (int j = 0; j < columna; j++){
                int numAdPares;
            }
        }
    }
    public static int contarADPares (int [][] matriz, int fila, int columna){
         fila = matriz.length;
        columna = matriz[0].length;

        int adyPares = 0 ;

        for (int i = fila -1; i <= fila +1; i++){
            for (int j = columna-1; j <= columna +1 ; j++){
                if (i >= 0 && i < fila && j >= 0 &&  j < columna) {
                    if (matriz[i][j] % 2 == 0){
                        adyPares++;
                    }
                }
            }
        }
        if (matriz[fila][columna] % 2 == 0){
            adyPares --;
        }
        return adyPares;
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
