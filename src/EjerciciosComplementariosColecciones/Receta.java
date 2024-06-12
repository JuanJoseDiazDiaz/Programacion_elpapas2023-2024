package EjerciciosComplementariosColecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Receta {
    private final String nombreReceta;
    private int minutosDePreparacion;
    private final HashSet<Ingrediente> hashIngredientes;
    private final LinkedList<String> listPasos;

    public Receta(String nombreReceta, int minutosPreparacion) throws RecetaException {
        this.nombreReceta = nombreReceta.toUpperCase();
        setMinutosDePreparacion(minutosPreparacion);
        hashIngredientes = new HashSet<Ingrediente>();
        listPasos = new LinkedList<String>();
    }

    public int getMinutosDePreparacion() {
        return minutosDePreparacion;
    }

    public void setMinutosDePreparacion(int minutosDePreparacion) throws RecetaException {
        if (minutosDePreparacion <= 0) {
            throw new RecetaException("Minutos incorrectos");
        }
        this.minutosDePreparacion = minutosDePreparacion;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void annadirPasoAlFinal(String paso) {
        listPasos.add(paso.toUpperCase());
    }

    public void annadirIngrediente(Ingrediente ingredienteNuevo) throws RecetaException {
        hashIngredientes.add(ingredienteNuevo);
    }

    public boolean necesitaIngrediente(String nombreIngrediente) throws RecetaException {
        if (hashIngredientes.contains(nombreIngrediente)) {
            throw new RecetaException("No necesita ese ingrediente");
        }
        return true;
    }

    public void borrarIngrediente(Ingrediente ingredienteABorrar) throws RecetaException {
        if (ingredienteABorrar.getNombreIngrediente().equals(ingredienteABorrar.getNombreIngrediente())) {
            if (!hashIngredientes.contains(ingredienteABorrar)) {
                throw new RecetaException("No puedes borrar el un ingrediente que no esta");
            }
            throw new RecetaException("No puedes borrar el mismo ingrediente dos veces");
        }
        if (listPasos.contains(ingredienteABorrar.getNombreIngrediente())) {
            listPasos.remove(ingredienteABorrar);
        }
        hashIngredientes.remove(ingredienteABorrar);
    }


    public void annadirPasoDetrasDe(String pasoNuevo, String pasoExistente) throws RecetaException {
        if (pasoExistente.equals(pasoNuevo)) {
            throw new RecetaException("No puedes añadir el mismo mensaje");
        }
        if (listPasos.isEmpty()) {
            throw new RecetaException("La lista esta vacia");
        }
        for (int i = 0; i < listPasos.size(); i++) {
            if (listPasos.get(i).equals(pasoExistente)) {
                listPasos.add(pasoNuevo);
            }
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombreReceta == null) ? 0 : nombreReceta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Receta other = (Receta) obj;
        if (nombreReceta == null) {
            return other.nombreReceta == null;
        } else return nombreReceta.equals(other.nombreReceta);
    }


}
