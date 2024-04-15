package BoletinFicheros.Ej7;

import boletin4.MiEntradaSalida2;

import java.io.File;
import java.io.FilePermission;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ej7 {
    public static File directorio = new File("/Users/Alumno/Desktop");

    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = MiEntradaSalidaLectora.Lectora.leerEnteroDeRango("Elige una opcion", 6, 0);
            switch (opcion) {
                case 1:
                    listarPorComienzo();
                    break;
                case 2:
                    listarPorExtension();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (opcion != 5);
    }

    public static void menu() {
        System.out.println("1. Listar directorio y buscar ficheros que comiencen por una palabra");
        System.out.println("2. Listar archivos con cierta extensión de un directorio:");
        System.out.println("3. Buscar un archivo en un directorio:");
        System.out.println("4. Buscar recursivamente un archivo en un directorio: ");
        System.out.println("5. salir");
    }


    public static void listarPorComienzo() {
        String palabraBuscada = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("Elija la palabra por la que quiere filtrar el fichero ");
        File[] files = directorio.listFiles(((dir, name) -> name.startsWith(palabraBuscada)));
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(file.getName() + "(Directorio)");
            } else {
                System.out.println(file.getName() + " - " + file.length() / 1024 + "KB");
            }
        }
    }

    public static void listarPorExtension() {
        String palabraFiltrada = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("Escriba la extension del fichero que quiere filtrar ");
        Path directorio = Paths.get("/Users/Alumno/Desktop");
        try (Stream<Path> ficheros = Files.list(directorio)) {
            ficheros.filter(Files::isRegularFile)
                    .filter(archivo -> archivo.toString().endsWith("." + palabraFiltrada))
                    .forEach(a -> {
                        try {
                            System.out.println(a.getFileName().toString() + "  " + Files.size(a) / 1024 + " KB ");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            System.out.println("Ocurrio un error al acceder al fichero");
        }

    }
}
