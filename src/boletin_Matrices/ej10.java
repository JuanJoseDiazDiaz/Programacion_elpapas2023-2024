package boletin_Matrices;

public class ej10 {
    public static void main(String[] args) {
        int[][] matriz ={
                {1,3,5},
                {0,2,7}};
        int[][] matriz2 ={
                {4,3,5},
                {6,8,9}};
        System.out.println("MATRIZ 1: ");
        System.out.println(esSimetricaY(matriz));
        System.out.println("MATRIZ 2: ");
        System.out.println(esSimetricaY(matriz2));
    }
    public static boolean esSimetricaY(int [][] matriz){
        boolean simetrica = true;
        int filas = matriz.length;
        int columnas = matriz[0].length;


        for (int j = 0;simetrica && j < columnas /2 ; j++){
            for (int i = 0;simetrica && i < filas; i++){
                if (matriz[i][j] != matriz[i][columnas -1 -j]){
                    simetrica = false;
                }
            }
        }
        return simetrica;
    }
}
