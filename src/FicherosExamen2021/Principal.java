package FicherosExamen2021;

import Ejercicios_Interfaces.FicherosBinarios;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) {
        FicherosBinarios ficherosBinarios = new FicherosBinarios("ficheroBinari", 3, LocalDateTime.of(1923, Month.APRIL, 23, 5, 5), new Byte[]{5, 6, 7, 7, 8, 8});
        FicheroTexto ficheroTexto = new FicheroTexto("ficheroBinari", (byte) 3, LocalDateTime.of(1923, Month.APRIL, 23, 5, 5), new String[][]{});
        FicheroTextoPlano ficheroTextoPlano = new FicheroTextoPlano("archivo.txt", (byte) 5, LocalDateTime.of(1923, Month.APRIL, 23, 5, 5), new String[][]{});
        FicheroTextoFormateado ficheroTextoFormateado = new FicheroTextoFormateado("word.docs", (byte) 13, LocalDateTime.of(1923, Month.APRIL, 23, 5, 5), new String[][]{}, TipoDeFuentes.ITALICA, 12.5, ColorFuente.NEGRO);
        FicherosDeAudio ficherosDeAudio = new FicherosDeAudio("Latana.soundcloud", (byte) 7, LocalDateTime.of(1923, Month.APRIL, 23, 5, 5), new Byte[]{6, 7, 8, 8, 9}, 3000);
        FicheroImagen ficheroImagen = new FicheroImagen("foto playera", (byte) 5, LocalDateTime.of(1923, Month.APRIL, 23, 5, 5), new Byte[]{6, 6, 7, 4, 3, 2, 6, 5}, FormatoImagen.PNG);
        FicheroVideo ficheroVideo = new FicheroVideo("video playero", (byte) 6, LocalDateTime.of(1923, Month.APRIL, 23, 5, 5), new Byte[]{5, 6, 7, 7, 8, 4}, 4000);
        FicheroEjecutable ficheroEjecutable = null;
        try {
            ficheroEjecutable = new FicheroEjecutable("script.cmd", (byte) 8, LocalDateTime.of(1923, Month.APRIL, 23, 5, 5), new Byte[]{4, 5, 4, 4, 3}, 6);
        } catch (FicheroException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(ficherosBinarios);
        System.out.println(ficheroTexto);
        System.out.println(ficheroTextoPlano);
        System.out.println(ficheroTextoFormateado);
        System.out.println(ficherosDeAudio);
        System.out.println(ficheroImagen);
        System.out.println(ficheroVideo);
        System.out.println(ficheroEjecutable);
    }
}
