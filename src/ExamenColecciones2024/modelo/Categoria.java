package ExamenColecciones2024.modelo;

import ExamenColecciones2024.excepciones.TiendaException;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Categoria {
    private String nombre;
    private Set<Producto> productoSet;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productoSet = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws TiendaException {
        this.nombre = nombre;
    }

    public Set<Producto> getProductoSet() {
        return productoSet;
    }

    public void setProductoSet(Set<Producto> productoSet) {
        this.productoSet = productoSet;
    }

    public void addProducto(Producto producto) {
        productoSet.add(producto);
    }

    public boolean productoSinStock(){
        for (Producto producto : productoSet){
            if (producto.getStock() == 0){
               return true;
            }
        }
        return false;
    }

    public boolean buscarProductoCategoria(Producto producto){
        for (Producto producto1 : productoSet){
            if (productoSet.equals(producto)){
               return true;
            }
        }
        return false;
    }

    public boolean borrarProducto(Producto p){
        return productoSet.remove(p);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(nombre, categoria.nombre) && Objects.equals(productoSet, categoria.productoSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, productoSet);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nombre='" + nombre + '\'' +
                ", productoSet=" + productoSet +
                '}';
    }
}
