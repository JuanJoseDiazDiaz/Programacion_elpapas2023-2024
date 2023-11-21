package boletin_Matrices;

public class ej7 {
    public static void main(String[] args) {
        int[][] matriz ={{1,3,5}, {0,2,7}};
        int[][] matriz2 ={{4,3,5}, {6,8,9}};
        mostrarMatrices(matriz, matriz2);

    }
    public static void mostrarMatrices(int [][] m , int [][] m2){
        System.out.println("Salida es: ");
        for (int i = 0; i< m.length; i++){
            for (int j=0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i< m2.length; i++){
            for (int j=0; j < m2[i].length; j++){
                System.out.print(m2[i][j] + " ");
            }
        }
        System.out.println();
        if (m == m2){
            System.out.println("son iguales las dos matrices");
        }else {
            System.out.println("no son iguales ");
        }
    }
}
