package Ej7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ej7HechoEnCasa {
    public static File directorio = new File("/Users/Alumno/Desktop");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = MiEntradaSalida.Lectora.leerEnteroDeRango("Elige una opcion", 6, 0);
            switch (opcion) {
                case 1:
                    listarPorComienzo();
                    break;
                case 2:
                    listarPorExtension();
                    break;
                case 3:
                    buscarArchivo();
                    break;
                case 4:
                    buscarArchivoRecursivo();
                    break;
                case 5:
                    System.out.println("Adioss!");
                    break;
            }
        } while (opcion != 5);
    }

    public static void menu() {
        System.out.println("1. Listar directorio y buscar ficheros que comiencen por una palabra");
        System.out.println("2. Listar archivos con cierta extensión de un directorio:");
        System.out.println("3. Buscar un archivo en un directorio: ");
        System.out.println("4. Buscar recursivamente un archivo en un directorio: ");
        System.out.println("5. salir");
    }


    public static void listarPorComienzo() {
        String palabraBuscada = MiEntradaSalida.Lectora.solicitarCadena("Elija la palabra por la que quiere filtrar el fichero ");
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
        String palabraFiltrada = MiEntradaSalida.Lectora.solicitarCadena("Escriba la extension del fichero que quiere filtrar ");
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

    public static void buscarArchivo() {
        String archivoBuscado = MiEntradaSalida.Lectora.solicitarCadena("¿Qué archivo quieres buscar? ");
        Path directorio = Paths.get(".\\src\\Ej7");
        try (Stream<Path> fichero = Files.list(directorio)) {
            fichero.filter(archivo -> archivo.getFileName().toString().equals(archivoBuscado))
                    .filter(Files::isRegularFile)
                    .forEach(a -> {
                        try {
                            System.out.println(a.getFileName() + "  " + Files.size(a) / 1024 + " KB");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void buscarArchivoRecursivo() {
        String palabraBuscada = MiEntradaSalida.Lectora.solicitarCadena("Introduce la palabra: ");
        if (directorio.isDirectory() || directorio.exists()) {
            System.out.println("El directorio especificado no es válido o no existe.");
            return;
        }
        Path directorio = Paths.get(".\\src\\Ej7");
        try (Stream<Path> ficheros = Files.list(directorio)){
            if (ficheros.equals(palabraBuscada)){
                System.out.println("Archivo encontrado: " + directorio.getFileName());
            }else{
                System.out.println("Error!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

