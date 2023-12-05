package boletinObjetos.Banco;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldoIncial;
        int numeroIntegros = 0;
        int numeroReintegros = 0;
            System.out.println("introduce tu saldo inicial: ");
            saldoIncial = teclado.nextDouble();
            imprimirMenu();




        int opciones = teclado.nextInt();
        do {
            switch (opciones) {
                case 1:
                    Cuenta.reintegroDinero(saldoIncial);
                    System.out.println("Se a realizado el reintegro");
                    numeroReintegros++;
                    imprimirMenu();
                    break;

                case 2:
                    Cuenta.ingresoDinero(saldoIncial);
                    System.out.println("Se a realizado el propio ingreso");
                    numeroIntegros++;



                case 3:
                    Cuenta.comprobacionOperaciones(saldoIncial, numeroReintegros, numeroIntegros);
                    System.out.println("Se a realizado la operacion");
                    break;

                case 4:
                    System.out.println("ADIOS, su cuenta esta cerrada");
                    break;
            }
        } while (opciones > 4);

    }
    public static void imprimirMenu(){
        System.out.println("QUE OPERACION QUIERES HACER: ");
        System.out.println("INGRESA CUALQUIER OPCION (1-4): ");
            System.out.println("1. Hacer un reintegro, se pedirá la cantidad a retirar.");
            System.out.println("2. Hacer un ingreso, se pedirá la cantidad a ingresar.");
            System.out.println("3. Consultar el saldo y el número de reintegros e ingresos realizados.");
            System.out.println("4. Finalizar las operaciones. Debe confirmar si realmente desea salir e informar del saldo al final de todas las operaciones.  ");
    }
}
