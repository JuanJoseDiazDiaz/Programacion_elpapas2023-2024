package Boletin6_Listas.Ejercicio7;

import java.util.*;
import java.util.stream.Stream;

public class Receta {
    private String nombreReceta;
    private int tiempoPreparacion;
    Set<Ingrediente> ingredientes;
    List<String> pasos;

    public Receta(String nombreReceta, int tiempoPreparacion) {
        this.nombreReceta = nombreReceta;
        this.tiempoPreparacion = tiempoPreparacion;
        this.ingredientes = new HashSet<>();
        this.pasos = new LinkedList<>();
    }

    public boolean necesitaIngredientes (String nombreIngrediente){
       return ingredientes.stream().anyMatch(a -> a.getNombre().equals(nombreIngrediente));
    }
    public void addIngrediente(Ingrediente ingrediente){
        Iterator<Ingrediente> it = ingredientes.iterator();
        while (it.hasNext()){
            Ingrediente i = it.next();
            if (ingrediente.getNombre().equals(i.getNombre())){
                i.addCantidad(i.getCantidad());
            }
        }
    }
}
