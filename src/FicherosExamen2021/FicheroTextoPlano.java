package FicherosExamen2021;

import java.time.LocalDateTime;

public class FicheroTextoPlano extends FicheroTexto implements Representable{
    public FicheroTextoPlano(String nombre, Byte tamanio, LocalDateTime fechaCreacion, String[][] matriz) {
        super(nombre, tamanio, fechaCreacion, matriz);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void imprimirConsola() {
        toString();
    }

    @Override
    public void repesentable(FicheroTextoPlano textoPlano) {
        if (textoPlano instanceof Representable){
            textoPlano.imprimirConsola();
        }
    }
}
