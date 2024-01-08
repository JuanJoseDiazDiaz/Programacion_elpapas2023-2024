package BoletinCadenasDeCaracter;

import java.util.Scanner;

public class Ej2 {
    private String cadena;
    private int mayus, minus, numeros;

    public Ej2(String cadena) {
        this.cadena = cadena;
    }

    public int getMayus() {
        return mayus;
    }

    public int getMinus() {
        return minus;
    }

    public int getNumeros() {
        return numeros;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce una frase en minuscula o en mayuscula");
        String cadena = teclado.nextLine();
        Ej2 caracter = new Ej2(cadena);
        caracter.cuentaCaracteres();
        System.out.println("En la frase cadena hay minusculas "+caracter.getMinus()+" y  mayusculas unas "+ caracter.getMayus());
    }
    private void cuentaCaracteres(){
        for (int i = 0; i < cadena.length(); i++){
            if (Character.isUpperCase(cadena.charAt(i))){
                mayus++;
            }
            else if (Character.isLowerCase(cadena.charAt(i))){
                minus++;
            }
            else if (Character.isDigit(cadena.charAt(i))){
                numeros++;
            }
        }
    }
}
