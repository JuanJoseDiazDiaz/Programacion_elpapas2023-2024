package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionEmpleados;

import java.util.Scanner;

public class EmpleadoPorHoras extends EmpleadoAbstracto{
    Scanner teclado = new Scanner(System.in);
    private double salarioPorHoras;
    private double horasTrabajas;
    public EmpleadoPorHoras(String nombre, double salarioBase, double salarioPorHoras, double horasTrabajas) {
        super(nombre, salarioBase);
        this.salarioPorHoras = salarioPorHoras;
        this.horasTrabajas = horasTrabajas;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasTrabajas * salarioPorHoras);
    }
}
