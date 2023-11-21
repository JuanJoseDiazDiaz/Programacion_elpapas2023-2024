package boletin_Matrices;

public class ej11 {
    public static void main(String[] args) {
        int[][] matriz ={
                {1,3,5},
                {0,2,7}
        };
        int[][] matriz2 ={
                {1,3,5},
                {0,2,7}
        };
        comprobacionInversa(matriz,matriz2);

    }
    public static void comprobacionInversa(int [][] matriz, int [][] matriz2){
            System.out.println("Matriz invertida: ");
            for (int i = matriz.length - 1; i >= 0; i--) {
                for (int j = matriz[i].length - 1; j >= 0; j--) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        System.out.println();
        System.out.println("Matriz orginal: ");
        for (int i = 0;i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
        }
        System.out.println();
            if (matriz == matriz2){
                System.out.println("tienen los mismos valores a la inversa");
            }else {
                System.out.println("No tiene mismos valores a la inversas");
            }

    }
}
