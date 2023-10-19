package boletin5;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce una cadena de numeros: ");
        int num = Integer.parseInt(teclado.nextLine());
        int inverso = 0;
        int resultado = numeroInverso(num, inverso);
        System.out.println(resultado);

        if (num == resultado){
            System.out.println("el numero es capicúa");
        }else {
            System.out.println("el numero no es capicúa");
        }


    }
    public static int numeroInverso (int num, int inverso){
        while (num != 0 ){
            inverso = inverso * 10 + num % 10;
            num /= 10;
        }
        return inverso;
    }
}
