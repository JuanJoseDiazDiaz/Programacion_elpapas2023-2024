package ExamenColecciones2024.Main;

import ExamenColecciones2024.excepciones.TiendaException;
import ExamenColecciones2024.modelo.Producto;
import ExamenColecciones2024.modelo.Tienda;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        // Crear instancia de la tienda para pruebas
        Tienda tienda = new Tienda("Supermercados Gilda");

        Producto producto = new Producto("hacendado", "32deww", "son productos de calidad", 12, LocalDate.now(), 2);


        // Agregar pruebas de los métodos aquí
        // Por ejemplo, se podrían agregar categorías, productos y llamar a los métodos para verificar su comportamiento

        try {
            tienda.addCategoria("Lacteos");
            tienda.addProducto(producto, tienda.getCategoriaSet().stream().toList());
            tienda.categoriasConProductosSinStock();
            tienda.categoriasDeProducto(producto);
            tienda.getTodosLosProductosOrdenadosPorPrecio();
            tienda.eliminaProducto(producto);
            tienda.productosUltimoAnno();
        } catch (TiendaException e) {
            System.out.println(e.getMessage());
        }
    }
}
