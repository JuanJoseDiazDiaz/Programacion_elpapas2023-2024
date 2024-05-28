package GestionGranja2;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private String nombreInventario;

    private  List<ProductosAgricolas> listaProductosAgricolas;


    public Inventario(String nombreInventario) {
        this.nombreInventario = nombreInventario;
        this.listaProductosAgricolas = new ArrayList<>();

    }

    public List<ProductosAgricolas> listaProductosAgricolas() {
        return listaProductosAgricolas;
    }

    public void registrarPrecio2(ProductosAgricolas p) {
        for (ProductosAgricolas productosAgricolas : listaProductosAgricolas) {
            if (productosAgricolas.equals(p)) {
                productosAgricolas.registrarPrecio();
                System.out.println("Alimentación registrada para " + p.getNombreProducto());
                return;
            }
        }
        System.out.println("Animal no encontrado: " + p.getNombreProducto());
    }

    public void checkCantidad(ProductosAgricolas p) {
        for (ProductosAgricolas productosAgricolas : listaProductosAgricolas) {
            if (productosAgricolas.equals(p)) {
                p.registrarCantidadDispoble();
                System.out.println("Chequeo registrado para " + p.getNombreProducto());
                return;
            }
        }
        System.out.println("Animal no encontrado: " + p.getNombreProducto());
    }

    public void addProducto(String nombreProducto, Productos tipoProducto, int cantDisponible, double precio) {
        ProductosAgricolas p = new ProductosAgricolas(nombreProducto, tipoProducto, cantDisponible, precio);
        listaProductosAgricolas.add(p);
    }

    public List<ProductosAgricolas> listaProductosVendidos(ProductosAgricolas p) {
        return listaProductosAgricolas.stream().filter(ProductosAgricolas::isDisponible).toList();
    }



    @Override
    public String toString() {
        return "Inventario{" +
                "nombreInventario='" + nombreInventario + '\'' +
                ", listaProductosAgricolas=" + listaProductosAgricolas +
                '}';
    }


}


