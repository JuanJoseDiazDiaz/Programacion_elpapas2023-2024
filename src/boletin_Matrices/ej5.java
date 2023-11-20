package boletin_Matrices;

public class ej5 {
    public static void main(String[] args) {
        int[][] matriz ={{1,3,5}, {0,2,7}};
        mostrarPorColumnas(matriz);

    }
    public static void mostrarPorColumnas (int [][] m){
        System.out.println(" salida es: ");
        for (int j = 0; j < m[0].length; j++){
            for (int i = 0; i < m.length; i++){
                System.out.print(m[i][j] + " ");
            }
        }
        System.out.println();
    }
}
