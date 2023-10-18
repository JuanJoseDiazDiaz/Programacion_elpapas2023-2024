package boletin4;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce los tres valores de la ecuacion: ");
        int valorA = teclado.nextInt();
        int valorB = teclado.nextInt();
        int valorC = teclado.nextInt();

        int resultado = comprobacionEcu(valorA, valorB, valorC);
        System.out.println(resultado);
    }
    public static int comprobacionEcu (int a , int b , int c ){
        // TODO : AQUI HARA LA ECUACION PERO LAS SIGUIENTES OPCIONES DE RESPUESTA ES
        int discrimante = b^2 + 4 * a * c;
        if (discrimante > 0){
            System.out.println("hay dos soluciones reales distintas");
        } else if (discrimante == 0) {
            System.out.println("hay dos soluciones reales iguales");
        } else if (discrimante < 0 ) {
            System.out.println("no hay soluciones reales (hay dos soluciones complejas distintas)");
        }
        return discrimante;
    }
}
