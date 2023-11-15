package boletin1Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ej9 {

    public static int [] borraLosDuplicados (int [] miarray){
        return Arrays.stream(miarray).distinct().toArray();
    }
    public static void main(String[] args) {
        int [] miArray = {1,2,1,4,5,2};
        int [] SinRepetir = borraLosDuplicados(miArray);
        System.out.println(Arrays.toString(SinRepetir));


    }
}
