package boletin1Arrays;

import java.util.Arrays;

public class ej9 {

    public static int[] borraLosDuplicados (int [] miarray){
        return Arrays.stream(miarray).distinct().toArray();
    }
    public static void main(String[] args) {
        int [] miArray = {4,5,6,7,8,9,6,7,4};
        int [] SinRepetir = borraLosDuplicados(miArray);
        System.out.println(Arrays.toString(SinRepetir));


    }
}
