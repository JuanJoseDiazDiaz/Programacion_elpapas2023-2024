package Repaso_ExamenRecuperacion_2025.Colecciones_Repaso_OpenWebinars;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Repaso_ExamenRecuperacion_2025.Colecciones_Repaso_OpenWebinars.Producto producto = (Repaso_ExamenRecuperacion_2025.Colecciones_Repaso_OpenWebinars.Producto) obj;
        return nombre.equals(producto.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

}
