package boletin5;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("los siguientes son salidas esperadas para las entradas: ");
        System.out.println("introduce hora base: ");
        int horaBase = teclado.nextInt();
        System.out.println("introduce los minutos base: ");
        int minBase = teclado.nextInt();
        System.out.println("introduce los segundos base: ");
        int segBase = teclado.nextInt();
        System.out.println("¿Cuántas horas quieres sumar?");
        int horasSumar = teclado.nextInt();
        System.out.println("¿Cuántos minutos quieres sumar?");
        int minSumar = teclado.nextInt();
        System.out.println("¿Cuántos segundos quieres sumar?");
        int segSumar = teclado.nextInt();

        horaBase = horaBase + horasSumar;
        minBase = minSumar + minBase;
        segBase = segBase + segSumar;
        while(segBase <59){
            minBase = minBase + 1;
            segBase = segBase -60;
        }
        while (minBase <59){
            horaBase = horaBase +1;
            minBase = minBase -60;
        }
        if (horaBase > 23){
            while (horaBase > 23){
                horaBase = horaBase -24;
            }
        }

        System.out.println("La hora resultante es: "+ (horaBase+horasSumar) + ":" + (minBase+minSumar)+ ":" + (segBase+segSumar));
    }
}
