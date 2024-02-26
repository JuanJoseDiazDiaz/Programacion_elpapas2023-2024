package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionEmpleados;

public class EmpleadoTiempoCompleto extends EmpleadoAbstracto{
    public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        super(nombre, salarioBase);

    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

}
