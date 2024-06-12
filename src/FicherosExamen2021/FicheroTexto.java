package FicherosExamen2021;

import java.time.LocalDateTime;
import java.util.Arrays;

public class FicheroTexto extends Fichero implements Leible {
    private String [][] matriz;

    public FicheroTexto(String nombre, Byte tamanio, LocalDateTime fechaCreacion, String[][] matriz) {
        super(nombre, tamanio, fechaCreacion);
        this.matriz = new String[3][5];
    }

    public String[][] getMatriz() {
        return matriz;
    }

    @Override
    public String toString() {
        return super.toString() +
                "FicheroTexto{" +
                "matriz=" + Arrays.toString(matriz) +
                '}';
    }

    @Override
    public boolean serLeido(String archivo) {
        return false;
    }

    @Override
    public boolean leido(FicheroTexto ficheroTexto) throws FicheroException{
        if (ficheroTexto instanceof Leible){
            if (!ficheroTexto.serLeido(Arrays.deepToString(matriz))){
                throw new FicheroException("No puede ser leido");
            }
            throw new FicheroException("No es un Leido");
        }
        return true;
    }
}
