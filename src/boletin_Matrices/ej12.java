package boletin_Matrices;

public class ej12 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Matriz Original: ");
        imprimirPorPantalla(matriz);

        reflejlarDiagonal(matriz);

        System.out.println("Matriz Reflejada: ");
        imprimirPorPantalla(matriz);

    }
    public static void reflejlarDiagonal(int [][] matriz){
        int n = matriz.length;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int acum = matriz[i][j];
                matriz[i][j]= matriz[j][i];
                matriz[i][j] = acum;
            }
        }
        if (matriz.length != matriz[0].length){
            System.out.println("la matriz no es cuadrada");
        }else{
            System.out.println("la matriz es cuadrada");
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
