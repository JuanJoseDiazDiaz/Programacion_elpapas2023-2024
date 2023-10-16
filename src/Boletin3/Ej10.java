package Boletin3;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un caracter: ");
        String operadorCaracter  = teclado.nextLine();

        System.out.println("introduce dos numeros: ");
        int num1 = Integer.parseInt(teclado.nextLine());
        int num2 = Integer.parseInt(teclado.nextLine());

        switch (operadorCaracter){
            case "+":
                System.out.println("esta es la suma de los dos numeros: "+ (num1 + num2));
             break;
            case "-":
                System.out.println("esta es la resta de los dos numeros: "+ (num1 - num2));
                break;
            case "*":
                System.out.println("esta es la multiplicacion de los dos numeros: "+ (num1 * num2));
                break;
            case "/":
                if (num2 != 0 || num1 != 0){
                    System.out.println("esta es la multiplicacion de los dos numeros: "+ ((double) num1 / num2));
                }else {
                    System.out.println("no se puede dividir enrtre 0 ");
                }
                break;
                default:
                System.out.println("Error al introducir el caracter");
        }
    }
}
