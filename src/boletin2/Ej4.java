package boletin2;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas,minutos, seg;
        System.out.println("introduce la distancia de donde quieres ir ");
        double kilometros = teclado.nextDouble();
        System.out.println("introduce la velocidad que irias ");
        double velocidad = teclado.nextDouble();
        double tiempoDeLlegada = kilometros/velocidad;
        horas = (int) tiempoDeLlegada;
        minutos = (int) (tiempoDeLlegada - horas)*60;



        System.out.println("el tiempo que tardarías es de : " + tiempoDeLlegada);
        System.out.printf("%d:%d", horas, minutos);

    }
}
