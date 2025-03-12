package RepasoDeFicheros2025.PosibleExamen.Ejercicios;

import java.io.*;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        File contactos = new File(".\\src\\RepasoDeFicheros2025\\Ej_Avanzado\\Ej7\\Prueba\\contactos.txt");
        borrarLinea(contactos);
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
}
