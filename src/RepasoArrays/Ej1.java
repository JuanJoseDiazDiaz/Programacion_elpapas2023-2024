package RepasoArrays;

public class Ej1 {
    public static void main(String[] args) {
        int[] arrayEnteros = {1, 3, 4, 5, 6, 7, 7, 2, 3, 4};
        System.out.println(SumaFor(arrayEnteros));
    }

    public static int SumaFor(int[] arraEntero) {
        int suma = 0;
        for (int i = 0; i < arraEntero.length; i++) {
            if (i % 2 == 0) {
                suma += arraEntero[i];
            }
        }
        return suma;
    }
}
