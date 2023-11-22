package boletin_Matrices;

public class ej13 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Matriz Reflejada: ");
        imprimeMatrices(matriz, reflejlarDiagonal(matriz));

    }
    public static int [][] reflejlarDiagonal(int [][] m){
        int[][] invertida = new int[m.length][m[0].length];
        if(m.length == m[0].length) {

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {

                    invertida[i][j] = m[m.length - 1 - j][m.length - 1 - i];
                }
            }
        }
        else {
            System.out.println("No se invierte la matriz por no ser cuadrada");
        }

        return invertida;
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
    public static void imprimeMatrices(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.printf("%2d ", m1[i][j]);
            }

            System.out.print("     ");
            for (int j = 0; j < m2[i].length; j++) {
                System.out.printf("%2d ", m2[i][j]);
            }


            System.out.println();
        }
    }

}

