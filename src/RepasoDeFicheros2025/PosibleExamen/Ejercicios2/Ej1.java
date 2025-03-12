package RepasoDeFicheros2025.PosibleExamen.Ejercicios2;

import java.io.*;

public class Ej1 {
    public static void main(String[] args) {
        File archivo = new File(".\\src\\RepasoDeFicheros2025\\PosibleExamen\\ficheros\\texto.txt");
        Ap1(archivo);
    }

    public static void Ap1(File archivo) {
        int contadorPalabras = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains("\\b[a-zA-Z]")){
                    System.out.println("Este es numero de palabras: "+ contadorPalabras);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
