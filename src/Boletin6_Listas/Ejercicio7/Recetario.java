package Boletin6_Listas.Ejercicio7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class Recetario{
    HashMap<String, Receta> recetas;

    public Recetario() {
        this.recetas = new HashMap<>();
    }
    public void addReceta (Receta nuevaReceta) throws RecetaExcepccion{
        if (recetas.containsKey(nuevaReceta.getNombreReceta())){
            throw new RecetaExcepccion("ya esta esa receta dentro del recetario");
        }
        recetas.put(nuevaReceta.getNombreReceta(),  nuevaReceta);

    }
    public List<Receta> listadoRecetasOrdenadasAlfabeticamente() throws RecetaExcepccion{
      if (recetas.isEmpty()){
          throw new RecetaExcepccion("La receta esta vacia");
      }
        return recetas.values().stream().sorted().toList();
    }
    public List<Receta> listadoRecetasConIngredienteOrdenadasPorTiempoPreparacion(String ingrediente) throws RecetaExcepccion {
        List<Receta> listaRecetas = recetas.values().stream().filter(receta -> receta.necesitaIngredientes(ingrediente)).toList();
        if (listaRecetas.isEmpty()) {
            throw new RecetaExcepccion("La receta no tiene ese cliente");
        }
        listaRecetas.sort((a, b) -> a.getTiempoPreparacion() - b.getTiempoPreparacion());
        return listaRecetas;
    }
}
