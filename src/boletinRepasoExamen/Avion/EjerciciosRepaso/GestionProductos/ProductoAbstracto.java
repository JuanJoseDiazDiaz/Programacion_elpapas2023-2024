package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionProductos;

import Repaso_ExamenRecuperacion_2025.Colecciones_Repaso_OpenWebinars.Producto;

public abstract class ProductoAbstracto extends Producto {
    private String nombre;
    private double precio;

    public ProductoAbstracto(String nombre, double precio, String nombre1, double precio1) {
        super(nombre, precio);
        this.nombre = nombre1;
        this.precio = precio1;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
