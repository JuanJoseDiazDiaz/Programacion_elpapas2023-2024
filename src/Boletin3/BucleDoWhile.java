package Boletin3;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String password;
        do {
            System.out.println("introduce la contraseña");
            password = teclado.nextLine();
        } while (password.length() <= 8);
        System.out.println("La contraseña es correcta");
        teclado.close();
    }

}
