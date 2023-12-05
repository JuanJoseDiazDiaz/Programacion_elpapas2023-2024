package boletinObjetos.Banco;

import java.util.Scanner;

public class Cuenta {
    Cuenta usuario = new Cuenta();

    public static double reintegroDinero(double saldoInicial){
        Scanner teclado = new Scanner(System.in);
        double resultado = 0;
        System.out.println("Su saldo actual es de: "+ saldoInicial);
        System.out.println("Introduce la cantidad a retirar: ");
        double cantidadRetirada = teclado.nextDouble();

        resultado = saldoInicial - cantidadRetirada;
        System.out.println("su saldo actual es de: "+ resultado);
        return resultado;
    }
    public static double ingresoDinero(double saldoInicial){
        Scanner teclado = new Scanner(System.in);
        double saldoFinal = 0;
        System.out.println("Su saldo actual es de: "+ saldoInicial);
        System.out.println("Introduce la cantidad a ingresar: ");
        double cantidadIngresada = teclado.nextDouble();

        saldoFinal = saldoInicial + cantidadIngresada;
        System.out.println("su saldo actual es de: "+ saldoFinal);
        return saldoFinal;
    }

    public static void comprobacionOperaciones (double saldoInicial, int numeroReintegros, int numeroIntegros){
        System.out.println("SU SALDO ACTUAL ES DE :" + saldoInicial);
        System.out.println("la operacion de reintegros ha sido usada: "+ numeroReintegros);
        System.out.println("la operacion de integros ha sido usada: "+ numeroIntegros);
    }





}
