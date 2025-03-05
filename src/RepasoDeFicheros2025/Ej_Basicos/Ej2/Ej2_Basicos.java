package RepasoDeFicheros2025.Ej_Basicos.Ej2;

import java.io.*;

public class Ej2_Basicos {
    public static void main(String[] args) {
        File archivoContar = new File(".\\src\\RepasoDeFicheros2025\\Ej_Basicos\\Ej1\\archivoNuevo.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(archivoContar))) {
            int cont = 0;
            while ((br.readLine()) != null) {
                cont++;
            }
            System.out.println("Su fichero tiene todas estas lineas: " + cont);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
