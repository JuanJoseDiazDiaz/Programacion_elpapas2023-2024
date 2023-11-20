package boletin_Matrices;

public class ej3 {
    public static void main(String[] args) {
        int matriz [] [] ={{1,3,5}, {0,2,7}};
        ordenaPorFilas(matriz);

    }
    public static void ordenaPorFilas(int [][] m){
        System.out.println("salida es: ");
        for (int i = 0; i< m.length; i++){
            for (int j=0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
        }
        System.out.println();
    }
}
