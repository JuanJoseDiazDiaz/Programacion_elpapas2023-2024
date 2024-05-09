package Repaso;

import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComplexRegexGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el contenido
        System.out.println("Ingresa el contenido para generar la expresión regular:");
        String contenido = scanner.nextLine();

        // Generar la expresión regular basada en el contenido ingresado
        String regex = generarExpresionRegular(contenido);
        System.out.println("La expresión regular generada es: " + regex);

        scanner.close();
    }

    public static String generarExpresionRegular(String contenido) {
        StringBuilder regexBuilder = new StringBuilder();

        // Dividir el contenido en palabras para analizar patrones comunes
        String[] palabras = contenido.split("\\s+");

        // Construir la expresión regular basada en las palabras
        for (String palabra : palabras) {
            // Agregar una expresión regular para cada palabra
            regexBuilder.append(generarExpresionRegularPalabra(palabra)).append("\\s+");
        }

        // Eliminar el espacio en blanco adicional al final
        regexBuilder.deleteCharAt(regexBuilder.length() - 1);

        return regexBuilder.toString();
    }

    public static String generarExpresionRegularPalabra(String palabra) {
        StringBuilder regexBuilder = new StringBuilder();

        // Agregar un patrón para cada letra en la palabra
        for (char c : palabra.toCharArray()) {
            // Usar un grupo de caracteres para representar letras similares
            if (Character.isLetter(c)) {
                regexBuilder.append("[A-Za-z]");
            }
            // Usar un grupo de caracteres para representar dígitos similares
            else if (Character.isDigit(c)) {
                regexBuilder.append("\\d");
            }
            // Escapar otros caracteres especiales
            else {
                regexBuilder.append("\\").append(c);
            }
        }

        return regexBuilder.toString();
    }
}

