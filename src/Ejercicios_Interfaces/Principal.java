package Ejercicios_Interfaces;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random r = new Random();
        Fichero fBinario = new FicherosBinarios("Fichero binario", randombytes(r.nextInt()));
        Fichero fAudio = new FicheroAudio("Fichero Audio", randombytes(r.nextInt()));
        Fichero fVideo = new FicheroVideos("Fichero videos", randombytes(r.nextInt()));
        Fichero fImagen = new FicherosImagen("Fichero imagen", randombytes(r.nextInt()), Tformato.JPG);
        Fichero fEjecutable = new FicheroEjecutable("Fichero ejecutable", randombytes(r.nextInt()), r.nextInt());
        Fichero fFormateado = new FicheroFormateado("Fichero formateado");
        Fichero fTexto = new FicheroPlano("Fichero plano", randombytes(r.nextInt())) {
        };
        Fichero[] ficheros = {fImagen,fEjecutable,fTexto,fFormateado, fAudio, fBinario , fVideo};

        for (int i =0; i < ficheros.length; i++){
            if (ficheros[i] instanceof Analizable){
                System.out.println(((Analizable) ficheros[i]).analizable());
            }if (ficheros[i] instanceof Convertible){
                System.out.println(((Convertible) ficheros[i]).convertir());
            }if (ficheros[i] instanceof Reproducible){
                System.out.println(((Reproducible) ficheros[i]).reproducir());
            }if (ficheros[i] instanceof Representable){
                System.out.println(((Representable) ficheros[i]).representar());
            }
        }

    }
    public static byte[] randombytes(int size){
        Random r = new Random();
        byte [] arrayBytes = new byte[size];
         r.nextBytes(arrayBytes);

         return arrayBytes;
    }

}
