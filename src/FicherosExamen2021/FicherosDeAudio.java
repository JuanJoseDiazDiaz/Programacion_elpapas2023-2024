package FicherosExamen2021;

import java.time.LocalDateTime;
import java.util.Arrays;

public class FicherosDeAudio extends Fichero implements Reproducible{
    private Byte[] contenido;
    private double duracionSeg;

    public FicherosDeAudio(String nombre, Byte tamanio, LocalDateTime fechaCreacion, Byte[] contenido, double duracionSeg) {
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
                "FicherosDeAudio{" +
                "contenido=" + Arrays.toString(contenido) +
                ", duracionSeg=" + duracionSeg +
                '}';
    }

    @Override
    public String reproducir(FicheroVideo ficheroVideo) throws FicheroException {
        return null;
    }

    @Override
    public String reproducir(FicherosDeAudio ficherosDeAudio) throws FicheroException {
        if (!(ficherosDeAudio instanceof Reproducible)){
            throw new FicheroException("Error, no es reproducible");
        }
        return "reproduciendo "+ getNombre();
    }


}
