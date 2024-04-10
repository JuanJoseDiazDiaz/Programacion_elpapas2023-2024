package BoletinFicheros.Ej3;

import java.io.*;

public class Ej3 {
    public static void main(String[] args) {
        try ( BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
              PrintWriter outputStream = new PrintWriter(new FileWriter(".\\src\\BoletinFicheros\\salidaEj3.txt", true ));){
            String l;
            while (!(l = inputStream.readLine()).equals("fin")) {
                outputStream.println(l);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
