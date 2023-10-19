package boletin5;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int inverso = 0;
        System.out.println("introduce una cadena de numeros: ");
        num = Integer.parseInt(teclado.nextLine());
        while (num != 0 ){
            inverso = inverso * 10 + num % 10;
            num /= 10;
        }
        System.out.println(inverso);
    }
}
