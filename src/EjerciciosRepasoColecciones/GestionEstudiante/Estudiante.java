package EjerciciosRepasoColecciones.GestionEstudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudiante {
    private String nombre;
    private int id;



    private int nota;

    private List<Integer> listaNotas;


    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.listaNotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getListaNotas() {
        return listaNotas;
    }
    public int getNota() {
        return nota;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(listaNotas, that.listaNotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, listaNotas);
    }
}
