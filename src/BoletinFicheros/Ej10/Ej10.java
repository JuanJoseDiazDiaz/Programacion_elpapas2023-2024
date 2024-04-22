package BoletinFicheros.Ej10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ej10 {
    public static void main(String[] args) {
        Path origin = Paths.get(".\\src\\BoletinFicheros\\Ej10\\fichero.txt");
        Path destiny = Paths.get(".\\src\\BoletinFicheros\\Ej10\\");
        Pattern patron = Pattern.compile("^F\\s(\\p{L}){3}\\.\\p{L}{3}");

        try (Stream<String> lineas = Files.lines(origin, StandardCharsets.UTF_8)) {
            lineas
                    .map(patron::matcher)
                    .filter(Matcher::matches)
                    .forEach(matcher -> {
                        try {
                            Files.createFile(destiny.resolve(matcher.group(1)));
                        } catch (FileAlreadyExistsException e) {
                            System.out.println("Ya existe el fichero "+ matcher.group(1));
                        }
                    });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
