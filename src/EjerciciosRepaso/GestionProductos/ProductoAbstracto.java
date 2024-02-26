package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionProductos;

public abstract class ProductoAbstracto implements Producto{
    private String nombre;
    private double precio;

    public ProductoAbstracto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
