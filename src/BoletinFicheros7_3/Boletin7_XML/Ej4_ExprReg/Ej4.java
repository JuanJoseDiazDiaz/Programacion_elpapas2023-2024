package BoletinFicheros7_3.Boletin7_XML.Ej4_ExprReg;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ej4 {
    public static void main(String[] args) {
        File fichero = new File(".\\src\\BoletinFicheros7_3\\Boletin7_XML\\Ej4_ExprReg\\quijote.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))){
            String linea;
            String patronRazon = "\\braz[oó]n\\b";
            Pattern newPattern = Pattern.compile(patronRazon,Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CASE);
           // int cont = 0;
            AtomicInteger cont = new AtomicInteger();
            while ((linea = br.readLine())!= null){
                Matcher matcher = newPattern.matcher(linea);
                 Stream.of(matcher).forEach(a ->{
                    while (a.find()){
                        cont.getAndIncrement();
                    }
                });

               /* while (matcher.find()){
                    cont++;
                }

                */
            }
            System.out.println(cont);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
