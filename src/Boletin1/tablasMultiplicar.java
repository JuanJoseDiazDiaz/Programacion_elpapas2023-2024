package Boletin1;

import java.util.Scanner;

public class tablasMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        do {
            System.out.println("introduce un numero");
            num1  = Integer.parseInt(teclado.nextLine());
        }while (num1 < 0 || num1 > 10);;
        teclado.close();

        for (int i = 0 ; i <= 10; i++){
            System.out.println(num1 + "*" + i + "=" + num1 * i);
        }

    }
}
