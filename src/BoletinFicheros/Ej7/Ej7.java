package BoletinFicheros.Ej7;

import boletin4.MiEntradaSalida2;

import java.io.File;
import java.io.FilePermission;

public class Ej7 {
    public static File directorio = new File("/Users/Alumno/Desktop");
    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = MiEntradaSalidaLectora.Lectora.leerEnteroDeRango("Elige una opcion", 5,1 );
            switch (opcion) {
                case 1:
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        } while (opcion != 5);
    }

    public static void menu() {
        System.out.println("2. Listar directorio y buscar ficheros que comiencen por una palabra");
        System.out.println("3. Listar archivos con cierta extensión de un directorio:");
        System.out.println("4. Buscar un archivo en un directorio:");
        System.out.println("5. Buscar recursivamente un archivo en un directorio: ");
        System.out.println("6. salir");
    }


    public static void listarPorComienzo() {
        File archivoNuevo = new File(".\\src\\BoletinFicheros\\Ej7");
        String palabraBuscada = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("Elija la palabra por la que quiere filtrar el fichero ");
    }
}
