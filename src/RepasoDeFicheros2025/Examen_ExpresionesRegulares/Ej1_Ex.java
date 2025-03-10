package RepasoDeFicheros2025.Examen_ExpresionesRegulares;

import java.io.*;
import java.nio.file.Files;

public class Ej1_Ex {
    public static void main(String[] args) {
        File archivosRuta = new File(".\\src\\RepasoDeFicheros2025\\Examen_ExpresionesRegulares\\prueba1\\rutas.txt");
        // Todo -> Metodo Principal
        comprobaciones(archivosRuta);
    }

    // Metodo Auxiliar ->
    public static void comprobaciones(File archivo) {
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
             if (linea.contains("\\b[a-zA-Z]")){
                 //Primera Opcion ->
                 if (linea.contains("\\?")){
                     String ruta = linea.replace("\\?", " ");
                     if (ruta.contains("\\,") || ruta.contains("\\|")){
                         String rutaLimpia = linea.replace("\\,", " ").replace("\\|", " ");
                         File newFile = new File(rutaLimpia);
                         if (!newFile.exists()){
                             System.out.println("Error, No existe este directorio o archivo");
                         }
                     }
                 }

                 // Segunda Opcion ->
                 if (linea.contains("\\*")){
                    String ruta = linea.replace("\\*", " ");
                     if (ruta.contains("\\,") || ruta.contains("\\|")){
                         String rutaLimpia = linea.replace("\\,", " ").replace("\\|", " ");
                        File newFile = new File(rutaLimpia);
                        for(File file : newFile.listFiles()){
                            if (Files.isRegularFile(file.toPath())){
                                System.out.println("Este es el peso del archivo o del directorio: " + file.length() / 1000 + " KB ");
                                String extFile = Files.probeContentType(file.toPath());
                                if (extFile == ".txt"){
                                    System.out.println("Esta es la linea limpia: "+ rutaLimpia);
                                }
                            }
                        }
                    }
                 }

                 // Tercera Opcion ->
                 if (linea.contains("\\$")){
                    String ruta = linea.replace("\\$", " ");
                    if (ruta.contains("\\,") || ruta.contains("\\|")){
                        String rutaLimpia = linea.replace("\\,", " ").replace("\\|", " ");
                        File newFile = new File(rutaLimpia);
                        if (newFile.isDirectory()){
                            String ext = Files.probeContentType(newFile.toPath());
                            if (!ext.equals("\\.")){
                                System.out.println("Error, extensión no valida");
                            }
                        }
                    }
                 }

                 // Cuarta Opcion ->
                 if (linea.contains("\\#")){
                     String ruta = linea.replace("\\#", " ");
                     System.out.println("Este es texto del comentario: "+ruta);
                 }

             }else {
                 throw new ErrorExpresionesRegularesException("Error, Caracter inicial no valido");
             }
            }
        } catch (IOException | ErrorExpresionesRegularesException e) {
            throw new RuntimeException(e);
        }
    }
}
