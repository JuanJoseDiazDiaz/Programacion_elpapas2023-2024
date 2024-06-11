package EjerciciosRepasoColecciones;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {
    private List<Libro> listaLibros;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }

    public void addLibros(Libro libro) throws LibroException {
        if (listaLibros.contains(libro)){
            throw new LibroException("No puedes añadir un libro que ya existe");
        }
        listaLibros.add(libro);
    }

    public void removeLibros(Libro libro) throws LibroException {
        if (!listaLibros.contains(libro)){
            throw new LibroException("No se puede borrar un libro que no esta");
        }
        listaLibros.add(libro);
    }

    public List<Libro> listadoDeLibrosPorAutor(String autor){
        return listaLibros.stream().filter(libro -> libro.getAutor().equals(autor)).toList();
    }

    public void listadoDeTodosLibros(){
        for (Libro libro : listaLibros){
            System.out.println(libro);
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaLibros=" + listaLibros +
                '}';
    }
}
