package boletin4;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base;
        int exponente;



            System.out.println("introduce base: ");
            base = teclado.nextInt();
            System.out.println("introduce el exponente: ");
            exponente = teclado.nextInt();


       int resultado = CalcularElevado(base, exponente);
        System.out.println(resultado);

    }
    public static int CalcularElevado (int a , int b){
        int resultado = a ^ b;
        System.out.println("Este sería el resultado de estos dos: "+ resultado);
        return resultado;
    }
}
