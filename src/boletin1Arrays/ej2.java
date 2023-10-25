package boletin1Arrays;

public class ej2 {
    public static void main(String[] args) {
        int [] miArray = {3, 45 ,5,56,74,43,47, -1};
        int numNegativo = 0;
        for (int i = 0; i < miArray.length; i++){
            if (miArray[i] < 0){
                numNegativo++;
            }

        }
        System.out.println("hay un numero negativo");
    }
}
