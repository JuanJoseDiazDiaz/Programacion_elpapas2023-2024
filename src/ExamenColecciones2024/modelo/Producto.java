package ExamenColecciones2024.modelo;

import ExamenColecciones2024.excepciones.TiendaException;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {
    private String marca;
    private String modelo;
    private String descripcion;
    private double precio;
    private LocalDate fechaIncorporacion;
    private int stock;

    public Producto(String marca, String modelo, String descripcion, double precio, LocalDate fechaIncorporacion, int stock){
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaIncorporacion = fechaIncorporacion;
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public int getStock() {
        return stock;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) throws TiendaException {
        if (fechaIncorporacion.isAfter(LocalDate.now())){
            throw new TiendaException("No puedes dar una fecha superior a la actual");
        }
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public void setStock(int stock) throws TiendaException {
        if (stock < 0) {
            throw new TiendaException("No hay stock");
        }
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(marca, producto.marca) && Objects.equals(modelo, producto.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", fechaIncorporacion=" + fechaIncorporacion +
                ", stock=" + stock +
                '}';
    }
}
