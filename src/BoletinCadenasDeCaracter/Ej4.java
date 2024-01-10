package BoletinCadenasDeCaracter;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce la frase");
        String cadena = teclado.nextLine();
        System.out.println("introduce la palabra escondida: ");
        String palabraEscondida = teclado.nextLine();
        if (encuentraPalabras(cadena, palabraEscondida)){
            System.out.println("encontrada");
        }else {
            System.out.println("No encontrada");
        }



    }
    public static boolean encuentraPalabras(String cadena , String palabraEscondida){
        int contPalabraEncontrada = 0;
        cadena = cadena.toLowerCase();
        palabraEscondida = palabraEscondida.toLowerCase();
        for (int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == palabraEscondida.charAt(contPalabraEncontrada)){
                contPalabraEncontrada++;

            }
            if (contPalabraEncontrada == palabraEscondida.length()){
                break;
            }
        }
        return contPalabraEncontrada == palabraEscondida.length();
    }
}
