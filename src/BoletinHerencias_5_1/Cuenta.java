package BoletinHerencias_5_1;

import java.util.Scanner;

public class Cuenta {
    Scanner teclado = new Scanner(System.in);
    public static final double SALDO_ACTUAL = 0;
    private double saldoActual;


    public Cuenta(double saldoActual) {
        this.saldoActual = saldoActual;

    }
    public Cuenta() {
        this.saldoActual = SALDO_ACTUAL;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    public void ingresarDinero(double dineroIngresado) throws CuentaCreditoExpection {
        if (dineroIngresado <= 0){
            throw new CuentaCreditoExpection("Has Ingresado una cantidad negativa");
        }
        System.out.println("cuanto dinero quieres ingresar: ");
        dineroIngresado = teclado.nextDouble();
        double cantIngresada = dineroIngresado + saldoActual;
        System.out.printf("En su cuenta se a ingresado %d, y el total de la cuenta es : %d", dineroIngresado, cantIngresada);
    }
    public void retirarDinero(double dineroSacar) throws CuentaCreditoExpection {
        if (dineroSacar <= 0 ){
            throw new CuentaCreditoExpection("No puedes sacar una cantidad negativa");
        }
        if (dineroSacar > saldoActual){
         throw new CuentaCreditoExpection("no puedes sacar una cantidad superior al saldo actual");
        }
        System.out.println("Cual es la cantidad a sacar: ");
        dineroSacar = teclado.nextDouble();
        double cantSacada = dineroSacar - saldoActual;
        System.out.printf("En su cuenta se a sacado %d, y el total de la cuenta es : %d", dineroSacar, cantSacada);

    }


}
