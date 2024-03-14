package Boletin6_Listas.Ejercicio7;

import java.util.*;
import java.util.stream.Stream;

public class Receta implements  Comparable<Receta>{
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
    public String getNombreReceta() {
        return nombreReceta;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public boolean necesitaIngredientes (String nombreIngrediente){
       return ingredientes.stream().anyMatch(a -> a.getNombre().equals(nombreIngrediente));
    }
    public void addIngrediente(Ingrediente ingredienteNuevo){
        Iterator<Ingrediente> it = ingredientes.iterator();
        boolean encontrado = false;
        while (it.hasNext() && !encontrado){
            Ingrediente i = it.next();
            if (ingredienteNuevo.getNombre().equals(i.getNombre())){
                i.addCantidad(ingredienteNuevo.getCantidad());
                encontrado = true;
            }
        }
        if (!encontrado){
            ingredientes.add(ingredienteNuevo);
        }
    }
    public void removeIngredientes(Ingrediente ingredienteBorrar) throws RecetaExcepccion {
        if (!ingredientes.remove(ingredienteBorrar)) {
            throw new RecetaExcepccion("En esta receta no esta ese ingrediente");
        }
        pasos.removeIf(paso -> paso.contains(ingredienteBorrar.getNombre()));
        // Stream.of(pasos).toList().removeIf(paso -> pasos.contains(ingredienteBorrar.getNombre()))
    }
    public void addPasoDetrasDe(String pasoNuevo, String pasoExistente) throws RecetaExcepccion {
        int posExistente = pasos.indexOf(pasoExistente);

        if (posExistente == -1){
            throw new RecetaExcepccion("La receta no contiene ese paso");
        }else {
            pasos.add(posExistente + 1, pasoNuevo);
        }


    }


    @Override
    public int compareTo(Receta otraReceta) {
        return this.nombreReceta.compareTo(otraReceta.nombreReceta);
    }
}
