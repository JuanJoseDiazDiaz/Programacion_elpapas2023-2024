package Boletin6_Listas.Ejercicio6;

import java.util.ArrayList;
import java.util.stream.Stream;

public class GranAlmacen {
    public static final int NUMERO_DE_CAJAS = 20;

    private Caja[] arrayCajas;
    private int numClientes;

    public GranAlmacen() {
        this.arrayCajas = new Caja[NUMERO_DE_CAJAS];
        for (int i = 0; i < arrayCajas.length; i++){
            this.arrayCajas[i] = new Caja(i +1 );
        }
        this.numClientes = 0;
    }

    /*
    *
    * @param numCaja Numero del 1 a el NUMERO_DE_CAJAS
    *
    */
    public void abrirCaja(int numCajas) throws AlmacenException {
        if (numCajas < 1 || numCajas > NUMERO_DE_CAJAS){
            throw new AlmacenException("No se puede abrir la caja, no existe la caja");
        }
        arrayCajas[numCajas - 1 ].abrirCaja();
    }

    public void cerrarCaja(int numCajas) throws AlmacenException {
        if (numCajas < 1 || numCajas > NUMERO_DE_CAJAS){
            throw new AlmacenException("No se puede abrir la caja, no existe la caja");
        }
        arrayCajas[numCajas - 1 ].cerrarCaja();
    }

    public String nuevoCliente() throws AlmacenException {

        if (Stream.of(arrayCajas).filter(Caja::isCajaAbierta).count() == 0){
            throw new AlmacenException("No cajas abiertas");
        }
        Caja c = Stream.of(arrayCajas).filter(Caja::isCajaAbierta).sorted((a,b) -> a.getClientes() - b.getClientes()).toList().get(0);
        c.addCliente(++numClientes);
        return "es usted el cliente numero "+ numClientes + " y debe ir a la caja numero "+c.getNumCaja();
    }

    public Integer atenderCliente(int numCajas) throws AlmacenException{
        if (numCajas < 1 || numCajas > NUMERO_DE_CAJAS){
            throw new AlmacenException("La caja no existe");
        }
        return arrayCajas[numCajas - 1 ].atenderCliente();
    }

}
