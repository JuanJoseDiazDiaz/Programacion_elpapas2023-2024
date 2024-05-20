package GestionGranja;

public class ProductosAgricolas {
    private String nombreProducto;
    private Productos tipoProducto;
    private int cantDisponible;
    private double precio;
    private boolean disponible;





    public ProductosAgricolas(String nombreProducto, Productos tipoProducto, int cantDisponible, double precio) {
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.cantDisponible = cantDisponible;
        this.precio = precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }
    public boolean isDisponible() {
        return disponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }
}
