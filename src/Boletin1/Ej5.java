package Boletin1;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 , num2, num3 , num4;
        do{
            System.out.println("introduce el primer numero");
             num1 = Integer.parseInt(teclado.nextLine());
            System.out.println("introduce el segundo numero");
             num2 = Integer.parseInt(teclado.nextLine());
            System.out.println("introduce el tercer numero");
             num3 = Integer.parseInt(teclado.nextLine());
            System.out.println("introduce el cuatro numero");
             num4 = Integer.parseInt(teclado.nextLine());
             if (num1 <0 || num2 < 0 || num3 < 0 || num4 <0){
                 System.out.println("ADIOS AMIGO");
                 break;
             }
        } while(num1 < 0 );
        double Resultado = CalcularMedia(num1, num2, num3, num4);
    }
    public static double CalcularMedia(int a , int b, int c , int d){
        double resultado = a + b + c + d / 4 ;
        System.out.println("este sería la media de estos numeros: " + resultado);
       if (a >= resultado || b >= resultado || c >= resultado || d >= resultado){
           System.out.println("este sería la media de estos numeros, pero tambien muestro el numero mayor: "+ a +" "+ b +" "+ c +" "+ d + " esta sería la media: "+ resultado );
       }
        return resultado;
    }
}
