package RepasoDeFicheros2025.Ej_Intermedios.Ej4;

import java.io.*;
import java.util.Scanner;

public class Ej4_Intermedios {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        File archivoOrigen = new File(".\\src\\RepasoDeFicheros2025\\Ej_Basicos\\Ej1\\archivoNuevo.txt");
        buscarPalabra(archivoOrigen);
    }

    public static void buscarPalabra(File archivoOrigen) {
        //Introdución de palabra al usuario
        System.out.println("Introduce la palabra a buscar");
        String palabraUsuario = sc.nextLine();

        int contPalabra = 0; // Contador para cuantas veces sale esa palabra
        try (BufferedReader br = new BufferedReader(new FileReader(archivoOrigen))) {
            String linea;
            while ((linea = br.readLine()) != null) {
               if (linea.contains(palabraUsuario)) {
                   contPalabra++;
               }
            }
            System.out.println("La palabra buscada sale unas: "+ contPalabra);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
