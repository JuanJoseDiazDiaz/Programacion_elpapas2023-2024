package GestionGranja;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventario {
    private String nombreInventario;
    private List<ProductosAgricolas> listaProductosAgricolas;

    public Inventario(String nombreInventario) {
        this.nombreInventario = nombreInventario;
        this.listaProductosAgricolas = new ArrayList<>();
    }

    public List<ProductosAgricolas> getListaProductosAgricolas() {
        return listaProductosAgricolas;
    }

    public void addProducto(String nombreProducto, Productos tipoProducto, int cantDisponible, double precio) {
        ProductosAgricolas p = new ProductosAgricolas(nombreProducto, tipoProducto, cantDisponible, precio);
        listaProductosAgricolas.add(p);
    }

    public List<ProductosAgricolas> venderProducto() {
        return listaProductosAgricolas.stream().filter(productosAgricolas -> {
            if (productosAgricolas.isDisponible()) {
                listaProductosAgricolas.remove(productosAgricolas);
            } else {
                System.out.println("Lo siento, no esta ese producto");
            }
            return false;
        }).toList();
    }

    public List<ProductosAgricolas> listOrdenadaProducto(){
      return  listaProductosAgricolas.stream().sorted().toList();
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "nombreInventario='" + nombreInventario + '\'' +
                ", listaProductosAgricolas=" + listaProductosAgricolas +
                '}';
    }
}


