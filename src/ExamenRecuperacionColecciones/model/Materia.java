package ExamenRecuperacionColecciones.model;


import ExamenRecuperacionColecciones.exceptions.CursoException;

import java.util.Objects;

public class Materia {
    private String nombre;
    private boolean esObligatoria;

    public Materia(String nombre, boolean esObligatoria) throws CursoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new CursoException("El nombre de la materia no puede estar vacío.");
        }
        this.nombre = nombre;
        this.esObligatoria = esObligatoria;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isObligatoria() {
        return esObligatoria;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return Objects.equals(nombre, materia.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", obligatoria=" + isObligatoria() +
                '}';
    }
}
