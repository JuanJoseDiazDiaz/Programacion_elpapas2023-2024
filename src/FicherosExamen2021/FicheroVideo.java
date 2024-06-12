package FicherosExamen2021;

import java.time.LocalDateTime;
import java.util.Arrays;

public class FicheroVideo extends Fichero implements Reproducible{
    private Byte[] contenido;
    private double duracionSeg;

    public FicheroVideo(String nombre, Byte tamanio, LocalDateTime fechaCreacion, Byte[] contenido, double duracionSeg) {
        super(nombre, tamanio, fechaCreacion);
        this.contenido = contenido;
        this.duracionSeg = duracionSeg;
    }

    public Byte[] getContenido() {
        return contenido;
    }

    public double getDuracionSeg() {
        return duracionSeg;
    }

    @Override
    public String toString() {
        return super.toString() +
                "FicheroVideo{" +
                "contenido=" + Arrays.toString(contenido) +
                ", duracionSeg=" + duracionSeg +
                '}';
    }

    @Override
    public String reproducir(FicheroVideo ficheroVideo) throws FicheroException {
       if (!(ficheroVideo instanceof Reproducible)){
           throw new FicheroException("Error, no es reproducible");
       }
        return "reproduciendo "+ getNombre();
    }

    @Override
    public String reproducir(FicherosDeAudio ficherosDeAudio) {
        return null;
    }


}
