package boletin2;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("introduce las monedas que tienes: ");
        int monedasObtenidas = teclado.nextInt();
        teclado.nextLine();
        System.out.println("introduce tu arma principal: ");
        String arma = teclado.nextLine();
        System.out.println("introduce tu nivel de experiencia: ");
        int nivelExp = teclado.nextInt();
        System.out.println("introduce tu salud actual:" );
        double saludActual = teclado.nextDouble();

        System.out.println("ingresa el daño recibido en la partida: ");
        double dañoRecibido = teclado.nextDouble();
        System.out.println(restarVida(saludActual, dañoRecibido));

    }

    public static double restarVida (double saludActual, double dañoRecibido){
        double daño = dañoRecibido;
        double salud = saludActual;
        double resultado = saludActual - dañoRecibido;
        return resultado;
    }
}
