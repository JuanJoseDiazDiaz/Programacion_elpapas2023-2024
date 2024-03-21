package Boletin6_Listas.EjercicioColecciones_2.RecetaCocina;

import java.util.*;

public class Cocina {
    private Map<String, Integer> despensa;
    private List<Receta> platosCocinados;

    public Cocina() {
        despensa = new HashMap<>();
        platosCocinados = new LinkedList<>();
    }

    public boolean haySuficientesIngredientes(Map<String, Integer> ingredientes) {
        if (ingredientes.isEmpty()) return true;
        if (despensa.isEmpty()) return false;
        Set<String> nombres = ingredientes.keySet();
        for (String str : nombres) {
            if (despensa.get(str) == null) return false;
            if (ingredientes.get(str) > despensa.get(str)) return false;
        }
        return true;
    }

    public void addIngrediente(String nombre, int cantidad) {
        Integer cantidadPrevia = despensa.putIfAbsent(nombre, cantidad);
        if (cantidadPrevia != null) despensa.replace(nombre, cantidadPrevia + cantidad);
    }

    public void eliminarIngrediente(String nombre, int cant){
        if (despensa.get(nombre) == cant){
            despensa.remove(nombre);
        }
        despensa.replace(nombre, despensa.get(nombre) - cant);
    }
    public void cocinarPlato(Receta plato){
        Map<String, Integer> ingredientes = plato.getIngredientes();
        for (Map.Entry<String, Integer> entry : ingredientes.entrySet()){

        }
    }
}


