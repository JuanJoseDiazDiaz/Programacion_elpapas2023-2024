package GestionGranja;

public class ProductosAgricolas {
    private String nombreProducto;
    private int cantDisponible;
    private double precio;
    private boolean disponible;



    public ProductosAgricolas(String nombreProducto, int cantDisponible, double precio) {
        this.nombreProducto = nombreProducto;
        this.cantDisponible = cantDisponible;
        this.precio = precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }
    public boolean isDisponible() {
        return disponible;
    }
}
