package boletin_Matrices;

public class ej2 {
    public static void main(String[] args) {
        int[][] matriz ={{1,3,5}, {0,2,7}};
        System.out.println(sumaMatriz(matriz));
    }
    public static int sumaMatriz(int [][] m){
        int suma = 0;
        for (int i = 0; i< m.length; i++){
            for (int j=0; j < m[i].length; j++){
               suma += m[i][j];
            }
        }
        return suma;
    }
}
