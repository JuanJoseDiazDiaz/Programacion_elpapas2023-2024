package RepasoDeFicheros2025.Ej_Intermedios.Ej6;

import java.io.*;

public class Ej6_Intermedios {
    public static void main(String[] args) {
        File archivoOrigen = new File(".\\src\\RepasoDeFicheros2025\\Ej_Basicos\\Ej1\\archivoNuevo.txt");
        File archivoDestino = new File(".\\src\\RepasoDeFicheros2025\\Ej_Intermedios\\Ej6\\archivoCopia.txt");
        String contenido = eleminarLineasVacia(archivoOrigen);
        escribirArchivo(archivoDestino,contenido);

    }

    public static String eleminarLineasVacia(File archivoOrigen) {
        StringBuilder cadena;
        try(BufferedReader br = new BufferedReader(new FileReader(archivoOrigen))) {
            String linea;
            cadena = new StringBuilder();
            while ((linea = br.readLine()) != null) {
               if (!linea.isEmpty()) {
                   cadena.append(linea).append("\n");
               }else {
                   cadena.trimToSize();
               }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cadena.toString();
    }
    public static void escribirArchivo(File archivo, String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(contenido);  // Escribimos el contenido en el archivo destino
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
