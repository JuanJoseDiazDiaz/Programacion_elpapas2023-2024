package Boletin1;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas, min, seg;
        int horas2, min2, seg2;
        do {
            System.out.println("RElOJ 1: ");

            System.out.println("introduce las horas: ");
            horas = Integer.parseInt(teclado.nextLine());
            System.out.println("introduce los minutos: ");
            min = Integer.parseInt(teclado.nextLine());
            System.out.println("introduce los segundos: ");
            seg = Integer.parseInt(teclado.nextLine());
            System.out.println("esta es tu hora actual: " + horas + ":" + min + ":" + seg);


            System.out.println("RELOJ 2: ");
            System.out.println("ahora introduce la hora de otro reloj ");
            horas2 = Integer.parseInt(teclado.nextLine());
            System.out.println("introduce los minutos: ");
            min2 = Integer.parseInt(teclado.nextLine());
            System.out.println("introduce los segundos: ");
            seg2 = Integer.parseInt(teclado.nextLine());
            System.out.println("esta es tu hora actual: " + horas2 + ":" + min2 + ":" + seg2);
        } while (horas > 0);
        if (horas > horas2) {
            System.out.println("esta es tu hora actual" + horas + ":" + min + ":" + seg + ", que es mayor que: " + horas2 + ":" + min2 + ":" + seg2);
        } else if (horas2 > horas) {
            System.out.println("esta es tu hora actual" + horas2 + ":" + min2 + ":" + seg2 + ", que es mayor que: " + horas + ":" + min + ":" + seg);
        }
        if (min > min2) {
            System.out.println("esta es tu hora actual" + horas + ":" + min + ":" + seg + ", que es mayor que: " + horas2 + ":" + min2 + ":" + seg2);
        } else if (min2 > min) {
            System.out.println("esta es tu hora actual" + horas2 + ":" + min2 + ":" + seg2 + ", que es mayor que: " + horas + ":" + min + ":" + seg);
        } else if (seg > seg2) {
            System.out.println("esta es tu hora actual" + horas + ":" + min + ":" + seg + ", que es mayor que: " + horas2 + ":" + min2 + ":" + seg2);
        } else if (seg2 > seg) {
            System.out.println("esta es tu hora actual" + horas2 + ":" + min2 + ":" + seg2 + ", que es mayor que: " + horas + ":" + min + ":" + seg);
        }
    }
}