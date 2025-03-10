package RepasoDeFicheros2025.Examen_ExpresionesRegulares;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ej1_Ex {
    public static void main(String[] args) {
        File archivoRuta = new File(".\\src\\RepasoDeFicheros2025\\Examen_ExpresionesRegulares\\prueba1\\rutas.txt");
        procesarArchivo(archivoRuta);
    }

    public static void procesarArchivo(File archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                // Manejo de comentarios
                if (linea.startsWith("#")) {
                    System.out.println(linea.substring(1).trim());
                    continue;
                }

                // Verificar primer carácter
                if (linea.isEmpty() || (!linea.startsWith("?") && !linea.startsWith("*") && !linea.startsWith("$"))) {
                    throw new ErrorExpresionesRegularesException("Error, carácter inicial no válido: " + linea);
                }

                // Separar la línea en rutas y filtros (si existen)
                String[] partes = linea.substring(1).split("\\|");
                String[] rutas = partes[0].split(",");
                /**
                 * es una asignación con un operador ternario
                 * (? :) que se usa para dividir una cadena en partes y manejar posibles casos donde no haya filtros.
                 *
                 *
                 */

                String[] filtros = (partes.length > 1) ? partes[1].split(",") : new String[0];

                switch (linea.charAt(0)) {
                    case '?':
                        verificarExistencia(rutas);
                        break;
                    case '*':
                        listarArchivos(rutas);
                        break;
                    case '$':
                        filtrarPorExtension(rutas, filtros);
                        break;
                }
            }
        } catch (IOException | ErrorExpresionesRegularesException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Verifica si las rutas existen
    public static void verificarExistencia(String[] rutas) {
        for (String ruta : rutas) {
            File file = new File(ruta.trim());
            if (file.exists()) {
                System.out.println("Existe: " + ruta);
            } else {
                System.out.println("No existe: " + ruta);
            }
        }
    }

    // Lista archivos en la ruta sin recursión y muestra tamaño si es un archivo
    public static void listarArchivos(String[] rutas) {
        for (String ruta : rutas) {
            File dir = new File(ruta.trim());
            if (dir.isDirectory()) {
                File[] archivos = dir.listFiles();
                if (archivos != null) {
                    for (File archivo : archivos) {
                        if (archivo.isFile()) {
                            System.out.println(archivo.getName() + " - " + (archivo.length() / 1024) + " KB");
                            if (archivo.getName().endsWith(".txt")) {
                                mostrarPrimeraLinea(archivo);
                            }
                        }
                    }
                }
            } else {
                System.out.println("No es un directorio válido: " + ruta);
            }
        }
    }

    // Filtra archivos por extensión
    /**
     * Este metodo filtra archivos dentro de directorios específicos según sus extensiones.
     * Si la ruta dada es un directorio válido, solo mostrará los archivos que coincidan con las extensiones dadas
     * en el array filtros.
     * */
    public static void filtrarPorExtension(String[] rutas, String[] filtros) {
        for (String ruta : rutas) {
            File dir = new File(ruta.trim());
            if (dir.isDirectory()) {
                File[] archivos = dir.listFiles((dir1, name) -> {
                    for (String filtro : filtros) {
                        if (filtro.startsWith(".") && name.endsWith(filtro.trim())) {
                            return true;
                        }
                    }
                    return false;
                });

                if (archivos != null) {
                    for (File archivo : archivos) {
                        System.out.println("Archivo filtrado: " + archivo.getName());
                    }
                }
            } else {
                System.out.println("No es un directorio válido: " + ruta);
            }
        }
    }

    // Muestra la primera línea de un archivo .txt
    public static void mostrarPrimeraLinea(File archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String primeraLinea = br.readLine();
            if (primeraLinea != null) {
                System.out.println("Sinopsis: " + primeraLinea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer archivo: " + archivo.getName());
        }
    }
}

