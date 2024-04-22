package BoletinFicheros.Ej10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ej10 {
    public static void main(String[] args) {
        Path origin = Paths.get(".\\src\\BoletinFicheros\\Ej10\\fichero.txt");
        Path destiny = Paths.get(".\\src\\BoletinFicheros\\");
        Pattern patron = Pattern.compile("^F\\s(\\p{L}{3}\\.\\p{L}{3})$");
        AtomicBoolean correcto = new AtomicBoolean(true);

        try (Stream<String> lineas = Files.lines(origin)) {
            lineas.forEach(linea -> {
                Matcher matcher = patron.matcher(linea);
                if (matcher.matches()) {
                    try {
                        Files.createFile(destiny.resolve(matcher.group(1)));
                        System.out.println("Se ha creado el fichero " + matcher.group(1));
                    } catch (FileAlreadyExistsException e) {
                        System.out.println("Ya existe el fichero " + matcher.group(1));
                    } catch (IOException e) {
                        System.out.println("No se puede crear el fichero " + matcher.group(1));
                    }
                }else {
                    correcto.set(false);
                }

            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (correcto.get()){
            System.out.println("El fichero es correcto ");
        }else {
            System.out.println("una linea del fichero no es corresta");
        }
    }


}
