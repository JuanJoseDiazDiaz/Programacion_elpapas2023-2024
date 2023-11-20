package boletin_Matrices;

public class ej4 {
    public static void main(String[] args) {
        int[][] matriz  ={{1,3,5}, {0,2,7}};
        ordenaPorFilasInverso(matriz);

    }
    public static void ordenaPorFilasInverso(int [][] m){
        System.out.println("salida es: ");
        for (int i = m.length - 1; i >= 0; i--){
            for (int j = m[i].length - 1; j >= 0; j--){
                System.out.print(m[i][j] + " ");
            }
        }

    }
}
