package Boletin3;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipoProductos;
        double precioOriginal;

        do {
            System.out.println("introduce el precio original del producto: ");
            precioOriginal = Double.parseDouble(teclado.nextLine());
        } while (precioOriginal <= 0);


        do {
           System.out.println("introduzca el tipo de producto que es: (A, B, C)");
             tipoProductos = teclado.nextLine().toUpperCase();
       }while (!tipoProductos.equals("A") && !tipoProductos.equals("B") && !tipoProductos.equals("C"));


        if (tipoProductos.equals("A")) {
            double resultado = precioOriginal * 7 / 100;
            System.out.println("se le aplicará en un 7% a la cantidad: " + (precioOriginal- resultado));

        } else if (tipoProductos.equals("C") || precioOriginal < 500) {
            double resultado = precioOriginal * 12 / 100;
            System.out.println("se le aplicará en un 12% a la cantidad: " + (precioOriginal- resultado));

        }else {
            double resultado = precioOriginal * 9 / 100;
            System.out.println("se le aplicará en un 9% a la cantidad: " + ( precioOriginal- resultado));
        }


    }

}
