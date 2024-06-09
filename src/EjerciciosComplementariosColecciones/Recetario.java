package EjerciciosComplementariosColecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Recetario {


    private HashMap<String, Receta> recetas;


    public Recetario() {
        recetas = new HashMap<String, Receta>();
    }

    public void annadirReceta(Receta nuevaReceta) throws RecetaException {
        if (recetas.containsKey(nuevaReceta.getNombreReceta())) {
            throw new RecetaException("Error, No se puede añadir una receta que ya esta");
        }
        recetas.put(nuevaReceta.getNombreReceta(), nuevaReceta);

    }

    public String listadoRecetasOrdenadasAlfabeticamente() throws RecetaException {
        if (recetas.isEmpty()) {
            throw new RecetaException("No hay recetas");
        }
        return recetas.entrySet().stream().sorted((receta1, receta2) -> receta1.getValue().getNombreReceta().compareTo(receta2.getValue().getNombreReceta())).toList().toString();
    }

    public String listadoRecetasConIngredienteOrdenadasPorTiempoPreparacion(String ingrediente) throws RecetaException {
		if (!recetas.containsKey(ingrediente)) {
			throw new RecetaException("No hay recetas con ese nombre");
		}
		return recetas.entrySet().stream().sorted((a,b) -> b.getValue().getMinutosDePreparacion() - a.getValue().getMinutosDePreparacion()).toList().toString();
    }
}
