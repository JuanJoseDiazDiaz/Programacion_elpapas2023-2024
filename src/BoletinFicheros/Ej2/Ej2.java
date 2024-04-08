package BoletinFicheros.Ej2;

import java.io.*;

public class Ej2 {
    public static void main(String[] args){
        File archivoNuevo = new File(".\\src\\BoletinFicheros\\FicheroNuevo.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(archivoNuevo))) {
            while (br.readLine() != null){

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
