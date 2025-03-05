package RepasoDeFicheros2025.Ej_Basicos.Ej3;

import java.io.*;

import java.io.*;

public class Ej3_Basicos {
    public static void main(String[] args) {
        File archivoOrigen = new File(".\\src\\RepasoDeFicheros2025\\Ej_Basicos\\Ej1\\archivoNuevo.txt");
        File archivoDestino = new File(".\\src\\RepasoDeFicheros2025\\Ej_Basicos\\Ej3\\archivoCopia.txt");

        String contenido = leerLineas(archivoOrigen);
        escribirArchivo(archivoDestino, contenido);
    }

    public static String leerLineas(File archivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");  // Guardamos todas las líneas con saltos de línea
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al leer el archivo: " + e.getMessage());
        }
        return contenido.toString();
    }

    public static void escribirArchivo(File archivo, String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(contenido);  // Escribimos el contenido en el archivo destino
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir el archivo: " + e.getMessage());
        }
    }
}

