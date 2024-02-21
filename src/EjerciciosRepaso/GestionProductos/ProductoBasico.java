package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionProductos;

public class ProductoBasico extends ProductoAbstracto{
    public ProductoBasico(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double setPrecio() {
        return 0;
    }

    @Override
    public double calcularPrecio() {
        return getPrecio();
    }
}
