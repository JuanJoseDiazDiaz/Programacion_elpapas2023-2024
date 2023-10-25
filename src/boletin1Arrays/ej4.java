package boletin1Arrays;

import java.util.Random;

public class ej4 {
    private static final int NUM_REPETICIONES = 6000;
    private static final int MIN_RANDOM = 0;
    private static final int MAX_RANDOM = 100;
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] terminaciones = new int[10];
        double suma = 0;

       for (int i = 1; i < NUM_REPETICIONES; i++){
           int numAleatorio = rnd.nextInt(MAX_RANDOM);
           suma += numAleatorio;
           terminaciones[numAleatorio % 10]++;
       }
       int posMax = 0;
       int maxValor = Integer.MIN_VALUE;
       for (int j = 0 ; j < terminaciones.length; j++){
           if (terminaciones[j] > maxValor){
               maxValor = terminaciones[j];
               posMax =j;
           }

       }

       int posMin = 0;
       int minValor = Integer.MAX_VALUE;
       for (int i = 0 ; i < terminaciones.length; i++){
           if (terminaciones[i]> minValor){
               minValor = terminaciones[i];
               posMin = i;
           }
       }

        System.out.println("la media de los numeros es: " + (double)suma/NUM_REPETICIONES);
    }
}
