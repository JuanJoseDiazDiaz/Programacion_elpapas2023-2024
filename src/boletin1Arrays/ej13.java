package boletin1Arrays;

public class ej13 {
    public static void main(String[] args) {
        int [] arrayOriginal ={1,2,4,5,6,7,6,8,9,10};
        int[] miArray = new int[arrayOriginal.length];
        System.out.println(apilar_Numeros(miArray));
        System.out.println(desapilarNumeros(miArray));

    }
    public static int apilar_Numeros(int [] array){
        int[] miArray = new int[array.length];
        int noRepetidos = 0;
        for (int i = 0; i < array.length; i++){
            boolean repetidos = false;
            for (int j = 0; j < noRepetidos && !repetidos ;j++){
                if (array[i] == miArray[j]){
                    repetidos = true;
                    break;
                }
            }
            if (!repetidos) {
                miArray[noRepetidos++] = array[i];
            }
        }
        return noRepetidos;
    }
    public static int desapilarNumeros(int [] array){
        int [] miArray = new int[array.length];
        int noRepetidos = 0;
        for (int i = 0; i < array.length; i++){
            boolean repetidos = false;
            for(int k = 0; k < noRepetidos && !repetidos; k++){
                if (array[i] == miArray[k]){
                    repetidos = true;
                    break;
                }
            }
            if (!repetidos){
                int resultados = miArray[noRepetidos++] - array[i];
            }
        }
        return noRepetidos;
    }
}
