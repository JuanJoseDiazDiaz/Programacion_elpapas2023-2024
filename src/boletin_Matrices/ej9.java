package boletin_Matrices;

public class ej9 {
    public static void main(String[] args) {
        int[][] matriz ={
                {1,3,5},
                {0,2,7}};
        int[][] matriz2 ={
                {4,3,5},
                {6,8,9}};
        System.out.println("MATRIZ 1: ");
        System.out.println(esSimetrica(matriz));
        System.out.println("MATRIZ 2:");
        System.out.println(esSimetrica(matriz2));
    }
    public static boolean esSimetrica(int[][] matriz){
        int fila = matriz.length;
        int columnas = matriz[0].length;
        if (fila != columnas){
            return false;
        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != matriz[fila -1 -i][j]){
                    System.out.println("Las filas  son iguales, la matriz  es simétrica");
                    return true;

                }else {
                    System.out.println("Las filas no son iguales, la matriz no es simétrica");
                }
            }
        }
        return false;
    }
}
