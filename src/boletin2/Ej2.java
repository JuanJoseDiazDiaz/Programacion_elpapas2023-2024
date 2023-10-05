package boletin2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce la temperatura en grados celsius");
        double gradosCelcius = teclado.nextDouble();
        double fahreintGrados = (gradosCelcius * 9/5)+32;
        System.out.println("este sería los grados en celsius "+ gradosCelcius);
        System.out.println("este sería la temperatura en fahreint " + fahreintGrados);

    }
}
