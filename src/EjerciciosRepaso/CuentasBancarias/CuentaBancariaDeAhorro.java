package EjerciciosRepaso.CuentasBancarias;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CuentaBancariaDeAhorro implements CuentaBancaria{
    Scanner teclado = new Scanner(System.in);
    private int numCuenta;
    private double saldo;
    private LocalDateTime fechaApertura;
    private double tasaInteres;

    public CuentaBancariaDeAhorro(int numCuenta, double saldo, LocalDateTime fechaApertura, double tasaInteres) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.fechaApertura = LocalDateTime.now();
        this.tasaInteres = tasaInteres;
    }

    public LocalDateTime getFechaApertura() {
        return fechaApertura;
    }



    public static void calcularInteres(double saldo, double tasaInteres){
        //TODO debemos multiplicar el saldo por la tasa de interes
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el saldo que tienes: ");
        saldo = teclado.nextDouble();
        System.out.println("Introduce la tasa de interes que tienes: ");
        tasaInteres = teclado.nextDouble();
        double resultado = saldo * tasaInteres;
        System.out.println("La cantidad de interes total con el saldo incluido es de: "+ resultado);

    }

    @Override
    public void obtenerDatosCuenta(int numCuenta, double saldo, LocalDateTime fechaApertura) {
        System.out.println("Bienvenido a CaixaBank: ");
        System.out.println("Introduce tu numero de cuenta bancaria: ");
        numCuenta = teclado.nextInt();
        System.out.println("Introduce tu saldo : ");
        saldo = teclado.nextInt();
        System.out.println("La fecha de entrada de la cuenta: ");
        getFechaApertura();
    }

    @Override
    public void playGame() {
        obtenerDatosCuenta(numCuenta, saldo, fechaApertura);
        calcularInteres(saldo, tasaInteres);
    }
}
