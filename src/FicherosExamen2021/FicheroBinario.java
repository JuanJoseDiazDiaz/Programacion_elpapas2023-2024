package FicherosExamen2021;

import java.time.LocalDateTime;
import java.util.Arrays;

public class FicheroBinario extends Fichero{
    private Byte[] arrayDeBytes;

    public FicheroBinario(String nombre, Byte tamanio, LocalDateTime fechaCreacion, Byte[] arrayDeBytes) {
        super(nombre, tamanio, fechaCreacion);
        this.arrayDeBytes = new Byte[60];
    }

    public Byte[] getArrayDeBytes() {
        return arrayDeBytes;
    }

    @Override
    public String toString() {
         return super.toString() +
                "FicheroBinario{" +
                "arrayDeBytes=" + Arrays.toString(arrayDeBytes) +
                '}';
    }
}
