package Repaso_ExamenRecuperacion_2025.Ej1;

import java.util.Scanner;

public class CuentaCliente {
    Scanner teclado = new Scanner(System.in);
    public static final double SALDO_ACTUAL = 0;
    private double saldoActual;


    public CuentaCliente(double saldoActual) {
        this.saldoActual = saldoActual;

    }
    public CuentaCliente() {
        this.saldoActual = SALDO_ACTUAL;
    }
    public double getSaldoActual() {
        return saldoActual;
    }

    public void ingresarDinero(double dineroIngresado) throws CuentaExpection {
        if (dineroIngresado <= 0){
            throw new CuentaExpection("Has Ingresado una cantidad negativa");
        }
        System.out.println("cuanto dinero quieres ingresar: ");
        dineroIngresado = teclado.nextDouble();
        double cantIngresada = dineroIngresado + saldoActual;
        System.out.println("En su cuenta se a ingresado "+dineroIngresado+" y el total de la cuenta es : "+cantIngresada);
    }

    public void retirarDinero(double dineroSacar) throws CuentaExpection {
        if (dineroSacar <= 0 ){
            throw new CuentaExpection("No puedes sacar una cantidad negativa");
        }
        if (dineroSacar > saldoActual){
            throw new CuentaExpection("no puedes sacar una cantidad superior al saldo actual");
        }
        System.out.println("Cual es la cantidad a sacar: ");
        dineroSacar = teclado.nextDouble();
        double cantSacada = dineroSacar - saldoActual;
        System.out.println("En su cuenta se a sacado "+dineroSacar+" y el total de la cuenta es : "+cantSacada);

    }
}
