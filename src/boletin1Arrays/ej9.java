package boletin1Arrays;

import java.util.Arrays;

public class ej9 {

    public static int[] borraLosDuplicados (int [] miarray){
        return Arrays.stream(miarray).distinct().toArray();
    }
    public static boolean numerosIguales(int [] array1, int[] array2){
        return Arrays.stream(array1).equals(array2);
    }
    public static void main(String[] args) {
        int [] miArray = {1,2,1,4,5,2};
        int [] SinRepetir = borraLosDuplicados(miArray);
        System.out.println(Arrays.toString(SinRepetir));


    }
}
