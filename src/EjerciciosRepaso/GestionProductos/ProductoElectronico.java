package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionProductos;

import java.time.LocalDate;

public class ProductoElectronico extends ProductoAbstracto{
    private double yearLanzamiento;


    public ProductoElectronico(String nombre, double precio, double yearLanzamiento) {
        super(nombre, precio);
        this.yearLanzamiento = yearLanzamiento;

    }

    @Override
    public double setPrecio() {
        return 0;
    }

    @Override
    public double calcularPrecio() {
        int yearActual = LocalDate.now().getYear();
        double resultado = 1 - ((yearActual - yearLanzamiento)* 0.1);
        return getPrecio() * resultado;
    }
}
