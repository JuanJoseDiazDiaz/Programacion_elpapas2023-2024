package GestionGranja;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventario {
    private String nombreInventario;
    private List<ProductosAgricolas> listaProductosAgricolas;

    public Inventario(String nombreInventario) {
        this.nombreInventario = nombreInventario;
        this.listaProductosAgricolas = new ArrayList<>();
    }

    public List<ProductosAgricolas> ListaProductosAgricolas() {
        return listaProductosAgricolas;
    }

    public void addProducto(String nombreProducto, Productos tipoProducto, int cantDisponible, double precio) {
        ProductosAgricolas p = new ProductosAgricolas(nombreProducto, tipoProducto, cantDisponible, precio);
        listaProductosAgricolas.add(p);
    }

    public List<ProductosAgricolas> ventaProductos () {
       return listaProductosAgricolas.stream().filter(ProductosAgricolas::isDisponible).toList();
    }

    public List<ProductosAgricolas> listOrdenadaProducto(ProductosAgricolas p){
      return listaProductosAgricolas.stream().filter(productosAgricolas -> p.isDisponible()).sorted().collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "nombreInventario='" + nombreInventario + '\'' +
                ", listaProductosAgricolas=" + listaProductosAgricolas +
                '}';
    }
}


