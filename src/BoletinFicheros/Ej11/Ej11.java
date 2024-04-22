package BoletinFicheros.Ej11;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class Ej11 {
    public static void main(String[] args) {
        Path fichero = Paths.get(".\\src\\BoletinFicheros\\Ej11\\ficheroEj11.txt");
        Pattern patron = Pattern.compile("(\\p{Lu}{2,})\\s(\\p{Lu}{2,})\\s(\\p{Lu}{2,})\\s([^\\\\/:\"\\*\\?|<>])");
    }
}
