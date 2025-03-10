package RepasoDeFicheros2025.Examenes_Ficheros.Examen_Parte1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Ej1_Ex {
    public static void main(String[] args) {
        File directorio1 = new File(".\\src\\RepasoDeFicheros2025\\Examenes_Ficheros\\Examen_Parte1\\directorio1");
        File directorio2 = new File(".\\src\\RepasoDeFicheros2025\\Examenes_Ficheros\\Examen_Parte1\\directorio2");

        try {
            accionesDirectorio(directorio1, directorio2);
        } catch (ExamenFicherosRecuperacionExpection | IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void accionesDirectorio(File directorio1, File directorio2) throws ExamenFicherosRecuperacionExpection, IOException {
        comprobacionDirectorios(directorio1, directorio2);

        File[] archivos = directorio1.listFiles();
        if (archivos == null) {
            throw new ExamenFicherosRecuperacionExpection("Error: No se puede acceder al directorio de origen");
        }
        for (File archivo : archivos) {
            if (archivo.isFile()) {
                copiarSegundoDirectorio(archivo, directorio2);
            }
        }
    }
    public static void comprobacionDirectorios(File directorio1, File directorio2) throws ExamenFicherosRecuperacionExpection {
        if (!directorio1.isDirectory() || !directorio2.isDirectory()) {
            throw new ExamenFicherosRecuperacionExpection("Error: Uno o ambos no son directorios");
        }
        if (!directorio1.canRead()) {
            throw new ExamenFicherosRecuperacionExpection("Error: El directorio de origen no tiene permisos de lectura");
        }
        if (!directorio2.canWrite()) {
            throw new ExamenFicherosRecuperacionExpection("Error: El directorio de destino no tiene permisos de escritura");
        }
    }
    public static void copiarSegundoDirectorio(File archivo, File directorio2) throws IOException {
        if (archivo.length() > 1024 &&
                archivo.isFile() &&
                archivo.getName().toLowerCase().endsWith(".txt") &&
                primeraPalabraEsCopiar(archivo)) {

            File destino = new File(directorio2, archivo.getName());
            Files.copy(archivo.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo copiado: " + archivo.getName());
        }
    }
    public static boolean primeraPalabraEsCopiar(File archivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String primeraLinea = br.readLine();
            if (primeraLinea != null) {
                String[] palabras = primeraLinea.split("\\s+");
                return palabras.length > 0 && palabras[0].equalsIgnoreCase("COPIAR");
            }
        }
        return false;
    }
}

