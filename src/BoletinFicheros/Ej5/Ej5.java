package BoletinFicheros.Ej5;

import boletin4.MiEntradaSalida2;

import java.io.File;
import java.nio.file.Files;

public class Ej5 {
    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = MiEntradaSalidaLectora.Lectora.leerEnteroDeRango("Elige una opcion", 5, 1);
            switch (opcion) {
                case 1:
                    crearDirectorio();
                    break;
                case 2:

            }
        } while (opcion < 5);
    }

    public static void menu() {
        System.out.println(" 1. Crear directorio ");
        System.out.println("2. Crear fichero Texto");
        System.out.println("3. Borrar Fichero de texto");
        System.out.println("4. Mostar los ficheros que contiene una carpeta");
        System.out.println("5. salir");
    }
    public static void crearDirectorio(){
        String nombreDirectorio = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("introduce el nombre");
        File directorio = new File(".\\src\\BoletinFicheros\\Ej5"+ nombreDirectorio);
        if (directorio.exists()){
            System.out.println("El directorio ya existe");
        }else {
            if (directorio.mkdir()){
                System.out.println("Se ha creado correctamente");
            }
        }

    }
}
