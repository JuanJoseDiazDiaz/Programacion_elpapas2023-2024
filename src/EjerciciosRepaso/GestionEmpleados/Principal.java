package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionEmpleados;

public class Principal {
    public static void main(String[] args) {
        EmpleadoAbstracto empleado = new EmpleadoAbstracto("Juan", 1000) {
            @Override
            public double calcularSalario() {
                return 0;
            }
        };
        EmpleadoTiempoCompleto empleado2 = new EmpleadoTiempoCompleto("Jose", 1200);
        EmpleadoPorHoras empleado3 = new EmpleadoPorHoras("Adrian", 1300, 200, 120);
        EmpleadoPorComision empleado4 = new EmpleadoPorComision("Carlos", 1500, 60, 50);

        System.out.println("Salario de : "+empleado.getNombre()+" : "+empleado.calcularSalario());
        System.out.println("Salario de : "+empleado2.getNombre()+" : "+empleado2.calcularSalario());
        System.out.println("Salario de : "+empleado3.getNombre()+" : "+empleado3.calcularSalario());
        System.out.println("Salario de : "+empleado4.getNombre()+" : "+empleado4.calcularSalario());
    }
}
