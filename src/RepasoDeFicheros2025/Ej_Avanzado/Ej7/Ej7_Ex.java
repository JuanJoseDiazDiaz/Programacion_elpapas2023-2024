package RepasoDeFicheros2025.Ej_Avanzado.Ej7;

import java.io.*;
import java.util.Scanner;

public class Ej7_Ex {
    public static void main(String[] args) {
        File contactosControl = new File(".\\src\\RepasoDeFicheros2025\\Ej_Avanzado\\Ej7\\Prueba\\contactos.txt");
//        agregarContacto(contactosControl);
//        borrarLinea(contactosControl);
//        buscarContacto(contactosControl);

    }
    public static void agregarContacto(File contacto) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a agregar Contacto:");
        System.out.println("Introduzca el nombre del contacto a agregar: ");
        String nombreContacto = sc.nextLine();
        System.out.println("Introduzca el numero del contacto a agregar: ");
        String numeroContacto = sc.nextLine();
        System.out.println("Introduzca el correo electronico del contacto a agregar: ");
        String correoElectronicoContacto = sc.nextLine();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(contacto, true))) {
            bw.write(nombreContacto + " ");
            bw.write(numeroContacto+ " ");
            bw.write(correoElectronicoContacto + " ");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void borrarLinea(File archivo) {
        Scanner sc = new Scanner(System.in);

        StringBuilder contenido = new StringBuilder();
        System.out.println("Bienvenido a eliminar Contacto:");
        System.out.println("Introduce el nombre del contacto a eliminar: ");
        String nombreEliminado = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.contains(nombreEliminado)) { // No copiar la línea que queremos borrar
                    contenido.append(linea).append("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al leer el archivo: " + e.getMessage());
        }

        // Sobrescribir el archivo con el nuevo contenido (sin la línea eliminada)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(contenido.toString());
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    public static void buscarContacto(File archivo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a buscar Contacto:");
        System.out.println("Introduce el nombre del contacto a buscar: ");
        String nombreContacto = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(nombreContacto)) {
                    System.out.println("Este es el contacto que busca: "+ linea);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
