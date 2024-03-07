package Boletin6_Listas.Ejercicio6;

import java.util.ArrayList;

public class GranAlmacen {
    public static final int NUMERO_DE_CAJAS = 20;

    private Caja[] arrayCajas;

    public GranAlmacen() {
        this.arrayCajas = new Caja[NUMERO_DE_CAJAS];
        for (int i = 0; i < arrayCajas.length; i++){
            this.arrayCajas[i] = new Caja(i +1 );
        }
    }
    public void abrirCaja(int numCajas){

    }


}
