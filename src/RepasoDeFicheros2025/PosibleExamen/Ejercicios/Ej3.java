package RepasoDeFicheros2025.PosibleExamen.Ejercicios;

import java.io.*;

public class Ej3 {
    public static void main(String[] args) {
        File archivoOrigen = new File(".\\src\\RepasoDeFicheros2025\\PosibleExamen\\ficheros\\origen.txt");
        File archivoDestino = new File(".\\src\\RepasoDeFicheros2025\\PosibleExamen\\ficheros\\destino.txt");

        leerContenido(archivoOrigen, archivoDestino);
    }

    public static void leerContenido(File archivo, File archivoDestino) {
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = br.readLine()) != null) {
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino, true))) {
                    bw.write(linea);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
