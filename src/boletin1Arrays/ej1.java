package boletin1Arrays;

public class ej1 {
    public static void main(String[] args) {
        int [] miArray = {2,34,4,45,55,66,74,5,423};
        int suma = 0;

        for (int i = 0; i < miArray.length; i++){
            if (i % 2 == 0){
                suma += miArray[i];
            }
        }
        System.out.println("la suma de las posicines pares es: "+ suma);
    }

}
