package ejemploPrueba;

import java.util.Arrays;

public class recorridoArray {
    public static void main(String[] args) {
        int [] miArray = new int[5];
        int [] miArray2 = {1,2,3,4,5,6};


arrayInverso(miArray2);
arrayNormal(miArray2);


    }
    public static int [] arrayNormal(int[] miArray2){
        for (int i = 0 ; i < miArray2.length; i++){
            System.out.println(i);
        }
        return miArray2;
    }
    public static int [] arrayInverso(int [] miArray2 ){
        for (int i = miArray2.length -1;  i >=0; i--){
            System.out.println(miArray2[i]);
        }
        return miArray2;
    }

}
