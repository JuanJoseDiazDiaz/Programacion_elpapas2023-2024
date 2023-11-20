package boletin_Matrices;

public class ej1 {
    public static void main(String[] args) {
        int[][] matriz ={{1,3,5}, {0,2,7}};

        if (comprobarNumNeg(matriz)){
            System.out.println("hay numeros negativos");
        }else {
            System.out.println("no hay numero negativos");
        }
    }
    public static boolean comprobarNumNeg(int [][] m){
        boolean comprobar = false;
        System.out.println("salida es: ");
        for (int i = 0; i< m.length && !comprobar; i++){
            for (int j=0; j < m[i].length && !comprobar; j++){
               if (m[i][j] < 0 ){
                   comprobar = true;
               }
            }
        }
        System.out.println();
        return comprobar;
    }
}
