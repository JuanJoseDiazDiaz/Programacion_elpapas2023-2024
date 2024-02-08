package Ejercicios_Interfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FicherosImagen extends Fichero{
    private byte [] contenido;
    private Tformato tformato;

    public FicherosImagen(String nombre, byte[] contenido,Tformato tformato) {
        super(nombre);
        this.contenido = contenido;
        this.tformato = tformato;
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
