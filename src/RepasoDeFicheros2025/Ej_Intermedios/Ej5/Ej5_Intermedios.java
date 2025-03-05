package RepasoDeFicheros2025.Ej_Intermedios.Ej5;

import java.io.*;

public class Ej5_Intermedios {
    public static void main(String[] args) {
        File archivoOrigen = new File(".\\src\\RepasoDeFicheros2025\\Ej_Basicos\\Ej1\\archivoNuevo.txt");
        mostradoInvertido(archivoOrigen);
    }
    public static void mostradoInvertido(File archivoOrigen) {
        try(BufferedReader br = new BufferedReader(new FileReader(archivoOrigen))) {
            String linea;
            StringBuilder cadena = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                cadena.append(linea).append("\n");
            }
            System.out.println(cadena.reverse());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
