package ExamenColecciones2024.modelo;

import ExamenColecciones2024.excepciones.TiendaException;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Tienda {
    private String nombre;
    private Set<Categoria> categoriaSet;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.categoriaSet = new HashSet<>();
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
        if (!categoriaSet.add(new Categoria(nombre)))
            throw new TiendaException("La categoria ya se encuentra");
    }


    /**
     * Añade un producto a una lista de categorías. Se añadirá a aquellas categorías en las que todavía no exista. En
     * aquellas donde ya exista, no se hará nada.
     *
     * @param p
     * @param categorias
     */
    public void addProducto(Producto p, List<Categoria> categorias) throws TiendaException {
        for (Categoria categoria : categorias) {
            if (!categorias.contains(categoria)) {
                throw new TiendaException("La categoria no existe");
            }
        }

        for (Categoria categoria : categorias){
            categoria.addProducto(p);
        }
    }

    /**
     * Devuelve un conjunto con aquellas categorías que contienen algún producto sin stock
     *
     * @return
     */
    public Set<Categoria> categoriasConProductosSinStock() {
        return categoriaSet.stream().filter(Categoria::productoSinStock).collect(Collectors.toSet());
    }

    /**
     * Devuelve un conjunto con las categorías a las que pertenece un producto determinado
     *
     * @param p
     * @return
     */
    public Set<Categoria> categoriasDeProducto(Producto p) {
        return categoriaSet.stream().filter(categoria -> categoria.buscarProductoCategoria(p)).collect(Collectors.toSet());
    }

    /**
     * Devuelve un listado con todos los productos de la tienda (sin repetir) ordenados por precio de mayor a menor
     *
     * @return
     */
    public List<Producto> getTodosLosProductosOrdenadosPorPrecio() {
        return categoriaSet.stream().flatMap(categoria -> categoria.getProductoSet().stream())
                .distinct()
                .sorted((a, b) -> Double.compare(a.getPrecio(),b.getPrecio())
                ).toList();
    }

    /**
     * Elimina un producto de todas las categorías donde aparezca.
     *
     * @param p
     * @return true si el producto aparecía en alguna categoría
     */
    public boolean eliminaProducto(Producto p) {
        for (Categoria categoria : categoriaSet){
            if (categoriaSet.contains(p)){
                categoria.borrarProducto(p);
            }
        }
        return false;
    }

    /**
     * Devuelve un conjunto con aquellos productos que han sido añadido en el último año (a partir de la fecha actual)
     *
     * @return
     */
    public Set<Producto> productosUltimoAnno() {
      return categoriaSet.stream().flatMap(categoria -> categoria.getProductoSet().stream()).filter(producto -> producto.getFechaIncorporacion().isBefore(LocalDate.now())).collect(Collectors.toSet());
    }

    public Set<Categoria> getCategoriaSet() {
        return categoriaSet;
    }
}
