package boletin_Matrices;

public class Ej6 {
    public static void main(String[] args) {
        int[][] matriz ={{1,3,5}, {0,2,7}};
        mostrarPorColumnasInverso(matriz);
    }
    public static void mostrarPorColumnasInverso (int [][] m){
        System.out.println(" salida es: ");
        for (int j = m[0].length -1 ; j >= 0 ; j--){
            for (int i = m.length- 1; i >= 0 ; i--){
                System.out.print(m[i][j] + " ");
            }
        }
        System.out.println();
    }
}
