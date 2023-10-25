package boletin1Arrays;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numEnteros = 0;
        System.out.println("introduce las posiciones que tendrá el array: ");
        int numIntroducido = Integer.parseInt(teclado.nextLine());
        int[] miArray = new int[numIntroducido];
        for (int i = 0; i < miArray.length; i++){
            numEnteros++;
        }
        System.out.println("Introduzca el número 1: ");
        int num1 = Integer.parseInt(teclado.nextLine());
        miArray[1] = num1;
        System.out.println("Introduzca el número 2: ");
        int num2 = Integer.parseInt(teclado.nextLine());
        miArray[2] = num2;
        System.out.println("Introduzca el número 3: ");
        int num3 = Integer.parseInt(teclado.nextLine());
        miArray[3] = num3;
        System.out.println("Introduzca el número 4: ");
        int num4 = Integer.parseInt(teclado.nextLine());
        miArray[4] = num4;
        System.out.println("Introduzca el número 5: ");
        int num5 = Integer.parseInt(teclado.nextLine());
        miArray[5] = num5;

        System.out.println("en el array hay estos numeros: "+ numEnteros);
    }
    public static int [] numMaximo (int [] miArray, int num){
        int max = Integer.MIN_VALUE;
        int acum = 0;
        for (int i = 0; i < miArray.length; i++){
            if (num >= max){
                if (num == max){
                    System.out.println("el numero maximo es: " + max);
                }
            }

            if (num == num){
                acum++;
                System.out.println("se ha repetido: "+ acum);
            }
        }
        return miArray;
    }
    public static int [] numMinimo (int [] miArray, int num){
        int min = Integer.MAX_VALUE;
        int acum = 0;
        for (int j = 0; j < miArray.length; j++){
            if (num >= min){
                if (num == min){
                    System.out.println("el numero minimo es: " + min);
                }
            }
            if (num == num){
                acum++;
                System.out.println("se ha repetido: "+ acum);
            }
        }

        return miArray;
    }
}
