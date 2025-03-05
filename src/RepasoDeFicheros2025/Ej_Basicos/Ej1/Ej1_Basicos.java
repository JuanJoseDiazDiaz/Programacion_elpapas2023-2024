package RepasoDeFicheros2025.Ej_Basicos.Ej1;

import java.io.*;

public class Ej1_Basicos {
    public static void main(String[] args) {
        File archivoNuevo = new File(".\\src\\RepasoDeFicheros2025\\Ej_Basicos\\archivoNuevo.txt"); // Debe ser un archivo

        if (!archivoNuevo.exists()) {
            System.out.println("El archivo no existe: " + archivoNuevo.getAbsolutePath());
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivoNuevo))) {
            String linea;
            while ((linea = br.readLine()) != null) { // Leer correctamente línea por línea
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
