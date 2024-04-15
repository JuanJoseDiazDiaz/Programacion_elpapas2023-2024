package BoletinFicheros.Ej6;

import boletin4.MiEntradaSalida2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ej6 {
    public static void main(String[] args) {
        listarFicherosYpeso();
    }

    public static void listarFicherosYpeso() {
        File[] archivos = new File[]{new File(".\\src\\BoletinFicheros\\Ej6")};
        String nombreArchivo = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("Introduce el nombre del archivo: ");
        double pesoArchivo = Double.parseDouble(MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("Introduce el peso del archivo: "));
        double resultadoPeso = pesoArchivo / 1024;
        System.out.println(resultadoPeso);
        System.out.println(nombreArchivo);
    }

}
