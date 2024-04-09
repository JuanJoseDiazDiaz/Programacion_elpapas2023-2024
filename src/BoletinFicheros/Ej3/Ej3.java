package Ej3;

import java.io.*;

public class Ej3 {
    public static void main(String[] args) {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(".\\src\\BoletinFicheros\\fichero.txt"));
            outputStream = new PrintWriter(new FileWriter(".\\src\\BoletinFicheros\\salidaEj3.txt"));
            String l;
            while (!(l = inputStream.readLine()).equals("fin") && (l = inputStream.readLine()) != null ) {
                System.out.println(l);
                outputStream.println(l);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
