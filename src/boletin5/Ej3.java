package boletin5;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero romano: ");
        String numeroRomanos = teclado.nextLine();
        switch (numeroRomanos){
            case "M":
                System.out.println(1000);
                break;
            case "D":
                System.out.println(500);
                break;
            case "C":
                System.out.println(100);
                break;
            case "L":
                System.out.println(50);
                break;
            case "X":
                System.out.println(10);
                break;
            case "V":
                System.out.println(5);
                break;
            case "I":
                System.out.println(1);
                break;
        }

    }

}
