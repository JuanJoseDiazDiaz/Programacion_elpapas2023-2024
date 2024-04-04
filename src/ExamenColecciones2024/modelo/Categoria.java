package ExamenColecciones2024.modelo;


import ExamenColecciones2024.excepciones.CategoriasProductosException;

import java.time.LocalDate;
import java.util.Set;

public class Categoria {
    private String nombre;
    private Set<Producto> productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public boolean soniguales() throws CategoriasProductosException {
        boolean iguales = true;
        for (Producto producto : productos){
            if (producto.getMarca().equals(producto.getModelo())){
             throw new CategoriasProductosException("Producto repetido, Error!");
            }else{
                iguales = false;
            }
        }
        return iguales;
    }

    public void eleminaProducto(Producto producto){
        productos.remove(producto);
    }
    public void annadirProducto(Producto producto){
        productos.add(producto);
    }
}
