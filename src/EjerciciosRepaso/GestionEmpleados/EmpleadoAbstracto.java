package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionEmpleados;

public abstract class EmpleadoAbstracto implements Empleado{
    private String nombre;
    private double salarioBase;

    public EmpleadoAbstracto(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getSalarioBase() {
        return salarioBase;
    }
}
