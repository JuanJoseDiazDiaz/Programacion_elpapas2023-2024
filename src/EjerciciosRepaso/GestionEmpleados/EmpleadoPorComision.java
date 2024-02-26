package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionEmpleados;

public class EmpleadoPorComision extends EmpleadoAbstracto{
    private float porcentajeComision ;
    private float ventasTotales ;
    public EmpleadoPorComision(String nombre, double salarioBase, float porcentajeComision, float ventasTotales) {
        super(nombre, salarioBase);
        this.porcentajeComision = porcentajeComision;
        this.ventasTotales = ventasTotales;

    }

    @Override
    public double calcularSalario() {
        return (porcentajeComision * ventasTotales) + getSalarioBase();
    }
}
