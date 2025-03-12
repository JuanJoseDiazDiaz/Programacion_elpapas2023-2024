package RepasoDeFicheros2025.PosibleExamen.Ejercicios;

import java.io.*;

public class Ej2 {
    public static void main(String[] args) {
        File archivos = new File(".\\src\\RepasoDeFicheros2025\\PosibleExamen\\ficheros\\datos.txt");
        contarLineas(archivos);
    }
    public static void contarLineas(File archivos) {
        int contadorLineas = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(archivos))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contadorLineas++;
            }
            System.out.println("Este es el numero total de lineas: "+contadorLineas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
