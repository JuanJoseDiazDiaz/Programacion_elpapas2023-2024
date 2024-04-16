package Ej8;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej8 {
    public static void main(String[] args) {
        buscarYVerificarFormato();
    }
    public static void buscarYVerificarFormato() {
        System.out.println("Ingrese el nombre del archivo de texto: ");
        File archivo = new File(".\\src\\Ej8\\archivo.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String nombreApellidoPattern = "[a-zA-Z]{2,}";
            String edadPattern = "[1-9][0-9]?";
            Pattern patron = Pattern.compile("^" + nombreApellidoPattern + " " + nombreApellidoPattern + " " + edadPattern + "$");
            int numeroLinea = 0;

            String linea;
            while ((linea = br.readLine()) != null) {
                numeroLinea++;
                Matcher matcher = patron.matcher(linea);
                System.out.println("La línea " + numeroLinea + (matcher.matches() ? " cumple con el formato." : " no cumple con el formato."));
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}





