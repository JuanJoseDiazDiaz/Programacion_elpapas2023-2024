package ExamenColecciones2024.modelo;


import ExamenColecciones2024.excepciones.TiendaException;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Tienda {
    private String nombre;
    private Set<Categoria> categorias;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.categorias = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }


    /**
     * Añade una nueva categoría. En caso de que exista, lanza una excepción
     *
     * @param nombre
     * @throws TiendaException
     */
    public void addCategoria(String nombre) throws TiendaException {
        Categoria categoria = new Categoria(nombre);
        if (categorias.contains(categoria)) {
            throw new TiendaException("Ya existe esa categoria");
        }
        categorias.add(categoria);
    }

    /**
     * Añade un producto a una lista de categorías. Se añadirá a aquellas categorías en las que todavía no exista. En
     * aquellas donde ya exista, no se hará nada.
     *
     * @param p
     * @param categorias
     */
    public void addProducto(Producto p, List<Categoria> categorias) throws TiendaException {
        Categoria categoria = new Categoria(nombre);
        if (!categorias.contains(p)) {
                throw new TiendaException("No existe ese producto, esta categoria");
            }
            categoria.annadirProducto(p);



    }


    public Set<Categoria> categoriasConProductosSinStock() {
        Set<Categoria> conjuntoCategorias = new HashSet<>();
        categorias.stream().filter(categoria -> {
            if (categorias instanceof Producto) {
                if (categorias.contains(((Producto) categorias).getStock())) {
                    conjuntoCategorias.add(categoria);
                }
            }
            return false;
        });
        return conjuntoCategorias;
    }


    public Set<Categoria> categoriasDeProducto(Producto p) {
        Set<Categoria> conjuntoCategorias = new HashSet<>();
        categorias.stream().filter(categoria -> {
            if (categorias.contains(p)) {
                conjuntoCategorias.add(categoria);
            }
            return false;
        });
        return conjuntoCategorias;
    }


    public List<Producto> getTodosLosProductosOrdenadosPorPrecio() {
        List<Producto> productos = new ArrayList<>();
        return (List<Producto>) productos.stream().sorted((a, b) -> (int) (b.getPrecio() - a.getPrecio()));
    }


    public boolean eliminaProducto(Producto p) {
        boolean eliminado = false;
        for (Categoria c : categorias) {
            if (!categorias.contains(p)) {
                eliminado = false;
                break;
            }
            if (categorias.contains(p)) {
                c.eleminaProducto(p);
                eliminado = true;
                break;
            }
        }
        return eliminado;
    }


    public Set<Producto> productosUltimoAnno() {
        HashSet<Producto> productos = new HashSet<>();
        productos.stream().filter(p -> {
            if (p.getFechaIncorporacion().getYear() <= LocalDate.now().getYear()) {
                productos.add(p);
            }
            return false;
        });
        return productos;
    }

}
