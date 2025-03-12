package RepasoDeFicheros2025.PosibleExamen.Ejercicios;

import RepasoDeFicheros2025.PosibleExamen.Excepciones.PosibleExamenErrorException;

import java.io.*;

public class Ej1 {
    public static void main(String[] args) {
        File archivos = new File(".\\src\\RepasoDeFicheros2025\\PosibleExamen\\ficheros\\datos.txt");

        try {
            leerMostrar(archivos);
        } catch (PosibleExamenErrorException e) {
            System.out.println("Fatal error: " + e.getMessage());
        }
    }

    public static void leerMostrar(File archivo) throws PosibleExamenErrorException {
       if (archivo.exists()){
           try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
               String linea;
               while((linea = br.readLine()) != null){
                   System.out.println(linea);
               }
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }else{
           throw new PosibleExamenErrorException("Error, archivo no existe");
       }
    }
}
