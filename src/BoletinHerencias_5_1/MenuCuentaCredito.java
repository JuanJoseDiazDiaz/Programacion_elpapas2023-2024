package BoletinHerencias_5_1;

import java.util.Scanner;

public class MenuCuentaCredito {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CuentaCredito cuentaCredito = new CuentaCredito();
        int opcion;
        do {
            menuCredito();
            opcion = teclado.nextInt();
            switch (opcion){
                case 1 :
                    System.out.println("Cantidad a ingresar: ");
                    double dineroIngresar = teclado.nextDouble();
                    try {
                        cuentaCredito.ingresarDinero(dineroIngresar);
                    } catch (CuentaCreditoExpection e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2 :
                    System.out.println("Cantidad a Sacar: ");
                    double dineroRetirar = teclado.nextDouble();
                    try {
                        cuentaCredito.retirarDinero(dineroRetirar);
                    }catch (CuentaCreditoExpection e){
                        System.out.println(e.getMessage());
                    }
                case 3:
                    System.out.println("Mostrando datos de tu Cuenta: este es tu saldo actual: "+ cuentaCredito.getSaldoActual()+
                            " este es el credito que tienes aun : "+ cuentaCredito.getCreditoActual());
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
            }
        }while(opcion != 4);
    }
    public static void menuCredito(){
        System.out.println("Bienvenido a tu Banco favorito: ");
        System.out.println("1. Ingresar dinero ");
        System.out.println("2. Sacar dinero");
        System.out.println("3. Mostrar saldo y crédito ");
        System.out.println("4. Salir");
        System.out.println("Introduce una opcion: ");
    }
}
