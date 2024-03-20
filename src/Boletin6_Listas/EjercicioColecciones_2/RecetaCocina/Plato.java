package Boletin6_Listas.EjercicioColecciones_2.RecetaCocina;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Plato {
    private String nombre;
    private double duracionMin;

    private List<String> pasos;
    private Map<String, Integer> ingredientes;

    public Plato(String nombre, double duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
        this.pasos = new ArrayList<>();
        this.ingredientes = new HashMap<>();
    }

    public void nuevoPaso(String paso) throws RestauranteException {
        if (paso.isBlank()){
            throw new RestauranteException("valor incorrecto");
        }
        pasos.add(paso);
    }

    public void nuevoIngrediente(String nombre, int cantidad){
        Integer cantidadPrevia = ingredientes.putIfAbsent(nombre, cantidad);
        if (cantidadPrevia != null){
            ingredientes.replace(nombre, cantidadPrevia + cantidad);
        }
    }
}
