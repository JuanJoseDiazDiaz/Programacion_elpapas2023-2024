package boletinRepasoExamen.Avion.EjerciciosRepaso.SistemaPago;

import java.util.Scanner;

public class Empleado implements Pagable{
    Scanner teclado = new Scanner(System.in);
    int nombreEmpleado;
    int horasTrabajo;
    int salarioHora;


    @Override
    public void calcularPago(int horastrabajada, int salarioHora) {
        System.out.println("Introduce las horas trabajadas : ");
        horastrabajada = teclado.nextInt();
        System.out.println("Introduce las salario : ");
        salarioHora = teclado.nextInt();
        int resultado = horastrabajada * salarioHora;
        System.out.println("Este es tu salario total por horas : "+ resultado);
    }

    @Override
    public void playGame() {
        calcularPago(horasTrabajo, salarioHora);
    }
}
