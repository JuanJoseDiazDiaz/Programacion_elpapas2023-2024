package Boletin6_Listas.Ejercicio6;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Caja {
    private int numCaja;
    private boolean cajaAbierta;

    private Queue<Integer> cola;

    public Caja(int numCaja) {
        this.numCaja = numCaja;
        this.cajaAbierta = false;
        this.cola = new LinkedList<>();
    }
    public void abrirCaja() throws AlmacenException{
        if (cajaAbierta){
            throw new AlmacenException("La caja ya esta abierta, SUBNORMAL");
        }
        cajaAbierta = true;
    }

    public void cerrarCaja() throws AlmacenException{
        if (!cajaAbierta){
            throw new AlmacenException("La caja ya esta cerrada, SUBNORMAL");
        }
        if (!cola.isEmpty()){
            throw new AlmacenException("La cola no esta vacia");
        }
        cajaAbierta = false;
    }
    public void addCliente(Integer cliente) throws AlmacenException {
        if (!cajaAbierta){
            throw new AlmacenException("no puedes pasar por la caja porque esta cerrada");
        }
        if (cajaAbierta){
            cola.add(cliente);
        }
    }

    public Integer atenderCliente() throws AlmacenException{
        if (!cajaAbierta){
            throw new AlmacenException("no puedes pasar por la caja porque esta cerrada");
        }
        Integer cliente = cola.poll();
        if (cliente == null){
            throw new AlmacenException("no hay ningun cliente en la caja");
        }
        return cliente;
    }



}
