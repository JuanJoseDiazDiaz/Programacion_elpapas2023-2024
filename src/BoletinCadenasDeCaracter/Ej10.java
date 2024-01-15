package BoletinCadenasDeCaracter;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el link de una pagina ");
        String frase = teclado.nextLine();
        System.out.println(esDireccionValida(frase));
    }
    public static boolean esDireccionValida(String direccion){
        String comienzoCorrecto = "https://www";
        String [] finalCorrecto = direccion.split("\\.");

       if (finalCorrecto.length != 3){
           return false;
       }
        if (!comienzoCorrecto.equals(finalCorrecto[0])){
           return false;
       }
       if (finalCorrecto[1].contains(" ")){
           return false;
       }
       if (Character.isDigit(finalCorrecto[1].charAt(0))){
           return false;
       }
       if (!finalCorrecto[2].equals("es") && !finalCorrecto[2].equals("com")){
           return false;
       }
       return true;
    }
}
