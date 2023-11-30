package boletinObjetos.Rectangulos;

import java.util.Scanner;

public class Principal  {
    public static int SALDO = 0;

    public static void main(String[] args) {
            imprimirMenu();
    }
    public static void imprimirMenu(){
        System.out.println("1. Hacer un reintegro, se pedirá la cantidad a retirar");
        System.out.println("2. Hacer un ingreso, se pedirá la cantidad a ingresar.");
        System.out.println("3. Consultar el saldo y el número de reintegros e ingresos realizados.");
        System.out.println("4. Finalizar las operaciones. Debe confirmar si realmente desea salir e informar del saldo al final de todas las operaciones. ");
    }

    public static int ingresoCuenta (int saldoInicial, int cantidadIngresada, int saldo){
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce tu saldo inicial: ");
            saldoInicial = teclado.nextInt();
            System.out.println("Introduce la cantidad que quieras ingresar?");
            cantidadIngresada = teclado.nextInt();
        }while (cantidadIngresada < 500);

        if (cantidadIngresada > 0){
            SALDO = cantidadIngresada + saldoInicial;
            System.out.println("se ingresado la cantidad de: "+ cantidadIngresada);
        }
        return SALDO;
    }
    public static int reintegroCuenta (int saldo, int saldoIncial, int cantidadReintegro){
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce tu saldo inicial: ");
            saldoIncial = teclado.nextInt();
            System.out.println("Introduce la cantidad que quieras reintegrar?");
            cantidadReintegro = teclado.nextInt();
        }while (cantidadReintegro < 500);

       // if (){


      return saldo;
    }

}
