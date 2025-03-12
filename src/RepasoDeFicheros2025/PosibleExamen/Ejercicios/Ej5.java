package RepasoDeFicheros2025.PosibleExamen.Ejercicios;

import RecuperacionFicheros2024.ErrorExamenException;
import RepasoDeFicheros2025.PosibleExamen.Excepciones.PosibleExamenErrorException;

import java.io.File;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
//        ".\\src\\RepasoDeFicheros2025\\PosibleExamen\\ficheros" -> Ruta donde estan los archivos
        try {
            listarContenido();
        } catch (PosibleExamenErrorException e) {
            System.out.println("Fatal error: "+e.getMessage());
        }
    }

    public static void listarContenido() throws PosibleExamenErrorException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Listado de Contenido");
        System.out.println("Introduce la ruta del directorio a listar: ");
        String ruta = sc.nextLine();
        File directorio = new File(ruta);
        if (directorio.isDirectory()) {
            for (File file : directorio.listFiles()) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        }else{
            throw new PosibleExamenErrorException("Error, no puedes acceder a su directorios");
        }
    }
}
