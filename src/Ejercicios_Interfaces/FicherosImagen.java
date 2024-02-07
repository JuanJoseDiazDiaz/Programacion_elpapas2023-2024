package Ejercicios_Interfaces;

import java.time.LocalDate;

public class FicherosImagen extends Fichero{
    private byte [] contenido;
    private enum formato {
        JPG, PNG;
    }

    public FicherosImagen(String nombre, byte tamano, LocalDate fecha, byte[] contenido) {
        super(nombre, tamano, fecha);
        this.contenido = contenido;
    }
    @Override
    public long getSize() {
        return super.getSize();
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
