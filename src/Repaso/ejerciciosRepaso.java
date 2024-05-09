package Repaso;

import java.io.*;

public class ejerciciosRepaso {
    public static void main(String[] args) {

        final String nomFichero = ".\\src\\Repaso\\ficheroDatos";
        try (FileReader fr = new FileReader(nomFichero)) {

            int valor = fr.read();
            while (valor != -1) {
                //Si el caracter es un espacio no lo escribe
                if (valor != 32) {
                    System.out.print((char) valor);
                }
                valor = fr.read();
            }
        } catch (IOException e) {
            System.out.println("Problemas con el E/S " + e);
        }
    }
}
