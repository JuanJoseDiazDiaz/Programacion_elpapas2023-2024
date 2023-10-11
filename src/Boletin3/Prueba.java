package Boletin3;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        saluda(" JUAN");
    }

    public static void saluda(String nombre) {
        System.out.println("HOLA" + nombre);

    }

    public static class MiEntradaSalida {
        public static Scanner teclado = new Scanner(System.in);

        /**
         * lee un entero comprendido entre el minimo y el max (INCLUIDOS)
         * @param min valor min
         * @param max valor max
         * @return el numero leido
         */
        public static int leerEntero( int min , int max){
            if (min >= max){
                // TODO: Hacer cuando conozcamos las excepeciones
            }
            int numLeido;
            do {
                numLeido = Integer.parseInt(teclado.nextLine());
                if (numLeido < min || numLeido > max){
                    System.out.println("INTRODUCE UN VALOR ENTRE LAS DOS UNIDADES");
                }

            }while (numLeido < min || numLeido > max);

            return numLeido;
        }


    }
}
