package BoletinFicheros7_3.Boletin7_XML.Ej4_ExprReg;

import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ej4 {
    public static void main(String[] args) {
        File fichero = new File(".\\src\\BoletinFicheros7_3\\Boletin7_XML\\Ej4_ExprReg\\quijote.txt");
        File fichero2 = new File(".\\src\\BoletinFicheros7_3\\Boletin7_XML\\Ej4_ExprReg\\quijote2.txt");
        File fichero3 = new File(".\\src\\BoletinFicheros7_3\\Boletin7_XML\\Ej4_ExprReg\\quijote3.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(fichero)); PrintWriter pr = new PrintWriter(fichero2)) {
            //TODO: Encuentra cuántas veces aparece la palabra razón (con o sin tilde)
            String linea;
            String patronRazon = "\\braz[oó]n\\b";
            Pattern newPattern = Pattern.compile(patronRazon, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            AtomicInteger cont = new AtomicInteger();


            String patronTildes = "[áéíóúñ]";
            Pattern nuevoPatron = Pattern.compile(patronTildes, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            int contTildes = 0;

            String patronNum = "(\\p{L})[0-9]";
            Pattern nuevoPatron2 = Pattern.compile(patronNum, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);


            String patronMas8 = "(\\p{LD}{13,})";
            Pattern nuevoPatron3 = Pattern.compile(patronMas8, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);


            while ((linea = br.readLine()) != null) {
                //APARTADO 1:
                Matcher matcher = newPattern.matcher(linea);
                Stream.of(matcher).forEach(a -> {
                    while (a.find()) {
                        cont.getAndIncrement();
                    }
                });

               /* while (matcher.find()){
                    cont++;
                }

                */
                //APARTADO 2:
                Matcher matcher2 = nuevoPatron.matcher(linea);
                while (matcher2.find()) {
                    contTildes++;
                }

                //Apartado 3:
                Matcher matcher3 = nuevoPatron2.matcher(linea);
                pr.println(matcher3.replaceAll("$1"));

                //Apartado 4:
                Matcher matcher4 = nuevoPatron3.matcher(linea);
                while (matcher4.find()){
                    System.out.println(matcher4.group());
                }
            }
            System.out.println("La palabra razon se ha encontrado " + cont + " veces");
            System.out.println("Se ha encontrado " + contTildes + " en eñes y tildes");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br3 = new BufferedReader(new FileReader(fichero)); PrintWriter pr = new PrintWriter(fichero3)) {
            String linea;
            String patronMayus = "(\\b\\p{L})(\\p{L}*\\b)";
            Pattern nuevoPatron = Pattern.compile(patronMayus, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            while ((linea = br3.readLine()) != null) {
                Matcher matcher = nuevoPatron.matcher(linea);
                pr.println(matcher.replaceAll(matchResult -> {
                    return matchResult.group(1).toUpperCase() + matchResult.group(2);
                }));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
