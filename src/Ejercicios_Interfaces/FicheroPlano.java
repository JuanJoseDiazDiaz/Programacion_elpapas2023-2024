package Ejercicios_Interfaces;

import java.time.LocalDateTime;

public class FicheroPlano extends FicheroDeTexto implements Representable{

    public FicheroPlano(String nombre, byte [] matriz) {
        super(nombre, matriz);
    }
    @Override
    public long getSize() {
        return super.getSize();
    }
    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public void representar() {
        for (int i = 0; i < getMatriz().length; i++){
            if (getMatriz()[i] != null){
                System.out.println(getMatriz()[i]);
            }
        }
    }
}
