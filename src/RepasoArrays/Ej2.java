package RepasoArrays;

public class Ej2 {
    public static void main(String[] args) {
        int[] arrayEnteros = {-1, 3, -4, 5, -6, 7, -7, 2, -3, 4};
        System.out.println(DectetaNeg(arrayEnteros));
    }
    public static int DectetaNeg(int[] arraEntero) {
       int cont = 0;
        for (int i = 0; i < arraEntero.length; i++) {
            if (arraEntero[i] < 0) {
                cont ++;
            }
        }
       return cont;
    }
}
