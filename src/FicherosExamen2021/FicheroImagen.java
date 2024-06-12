package FicherosExamen2021;

import java.time.LocalDateTime;
import java.util.Arrays;

public class FicheroImagen extends Fichero{
    private Byte[] contenido;
    private FormatoImagen formatoImagen;

    public FicheroImagen(String nombre, Byte tamanio, LocalDateTime fechaCreacion, Byte[] contenido, FormatoImagen formatoImagen) {
        super(nombre, tamanio, fechaCreacion);
        this.contenido = contenido;
        this.formatoImagen = formatoImagen;
    }

    public Byte[] getContenido() {
        return contenido;
    }

    public FormatoImagen getFormatoImagen() {
        return formatoImagen;
    }

    @Override
    public String toString() {
        return super.toString() +
                "FicheroImagen{" +
                "contenido=" + Arrays.toString(contenido) +
                ", formatoImagen=" + formatoImagen +
                '}';
    }
}
