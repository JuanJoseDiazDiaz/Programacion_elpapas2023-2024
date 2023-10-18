package boletin4;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numeroSecreto = 30;
        int vida = 5;

        do {
            System.out.println("introduce un numero entre 1 - 100: ");
             numero = Integer.parseInt(teclado.nextLine());
            System.out.println("estas son las vidas que te quedan "+ --vida);


        System.out.println("Empieza el juego: ");
        MiEntradaSalida2.MiEntradaSalida.numerosaleatorios(numero);

        if (numero == numeroSecreto){
            System.out.println("Se ha terminado el juego");
            System.out.println("HAS GANADO!!");
            break;
        } else if (numero < numeroSecreto) {

            System.out.println("el numero secreto es mayor, asi que sube el rango campeon");

        } else if (numero > numeroSecreto) {
            System.out.println("el numero secreto es menor, asi que baja el rango campeon");
        }
        if (vida == 0 ){
            System.out.println("has perdido has malgastado todas las vidas");
            break;
        }
        }while (vida != 0);

    }
}
