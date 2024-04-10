package BoletinFicheros.Ej5;

import boletin4.MiEntradaSalida2;

import java.io.*;
import java.nio.file.Files;

public class Ej5 {
    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = MiEntradaSalidaLectora.Lectora.leerEnteroDeRango("Elige una opcion", 5, 0);
            switch (opcion) {
                case 1:
                    crearDirectorio();
                    break;
                case 2:
                    crearArchivoDeTexto();
                    break;
                case 3:
                    borrarFichero();
                    break;
            }
        } while (opcion != 5);
    }

    public static void menu() {
        System.out.println(" 1. Crear directorio ");
        System.out.println("2. Crear fichero Texto");
        System.out.println("3. Borrar Fichero de texto");
        System.out.println("4. Mostar los ficheros que contiene una carpeta");
        System.out.println("5. salir");
    }

    public static void crearDirectorio() {
        String nombreDirectorio = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("introduce el nombre");
        File directorio = new File(".\\src\\BoletinFicheros\\Ej5 " + nombreDirectorio);
        if (directorio.exists()) {
            System.out.println("El directorio ya existe");
        } else {
            if (directorio.mkdir()) {
                System.out.println("Se ha creado correctamente");
            }
        }
    }

    public static void crearArchivoDeTexto() {
        String nombreArchivo = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("introduce el nombre");
        File archivoDeTexto = new File(".\\src\\BoletinFicheros\\Ej5 " + nombreArchivo);
        boolean append = true;
        if (archivoDeTexto.exists()) {
            if (archivoDeTexto.isFile()) {
                append = MiEntradaSalidaLectora.Lectora.leerCaracterSN("Quieres añadir el contenido al final del fichero?") == 'S';
            } else {
                System.out.println("No se ha creado el fichero porque ya hay un directorio con el mismo nombre");
                return;
            }
        }
        String cadena = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("Escriba la cadena que estará en el fichero");
        try (PrintWriter pr = new PrintWriter(new FileWriter(archivoDeTexto, append))) {
            pr.println(cadena);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void borrarFichero() {
        String nombreArchivo = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("introduce el nombre");
        File archivoBorrar = new File(".\\src\\BoletinFicheros\\Ej5 " + nombreArchivo);
        if (archivoBorrar.exists()){
            if (archivoBorrar.isFile()){
                System.out.println("No se ha borrado el fichero porque ya hay un directorio con el mismo nombre");
            }
        }
        if (archivoBorrar.delete()) {
            System.out.println("Se ha borrado, el fichero o directorio: " + archivoBorrar.getName());
        }
    }
    public static void mostrarTodosLosFichero() {
        String nombreArchivo = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("introduce el nombre");
        File archivo = new File(".\\src\\BoletinFicheros\\Ej5 " + nombreArchivo);

    }
}
