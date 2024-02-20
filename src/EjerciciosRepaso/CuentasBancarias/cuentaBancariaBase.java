package EjerciciosRepaso.CuentasBancarias;

import java.time.LocalDateTime;
import java.util.Scanner;

public class cuentaBancariaBase implements CuentaBancaria{
    Scanner teclado = new Scanner(System.in);
    private int numCuenta;
    private double saldo;
    private LocalDateTime fechaApertura;

    public cuentaBancariaBase(int numCuenta, double saldo, LocalDateTime fechaApertura) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.fechaApertura = LocalDateTime.now();
    }

    public double getSaldoActual() {
        return saldo;
    }

    public LocalDateTime getFechaApertura() {
        return fechaApertura;
    }


    @Override
    public void obtenerDatosCuenta(int numCuenta, double saldo, LocalDateTime fechaApertura) {
        System.out.println("Bienvenido a CaixaBank: ");
        System.out.println("Introduce tu numero de cuenta bancaria: ");
        numCuenta = teclado.nextInt();
        System.out.println("Introduce tu saldo : ");
        saldo = teclado.nextInt();
        System.out.println("La fecha de entrada de la cuenta: ");
        LocalDateTime.now();
    }

    @Override
    public void playGame() {
        obtenerDatosCuenta(numCuenta, saldo, fechaApertura);
    }
}
