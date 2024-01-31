package BoletinHerencias_5_1.EmpresaDeVehiculos;

import MiEntradaSalidaLectora.Lectora;

import java.util.Scanner;

public class MenuVehiculo {
    private static final int MAX_VEHICULOS = 200;
    private static final Vehiculo[] listaVehiculos = new Vehiculo[MAX_VEHICULOS];

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenu();
            opcion = teclado.nextInt();
            switch (opcion){

                case 1:

                    break;
                    case 2:

                    break;
                    case 3:

                    break;
                    case 4:

                    break;
            }
        }while (opcion != 3);
    }
    public static void imprimirMenu(){
        System.out.println("Elige una opción:");
        System.out.println("1. Alta vehiculo. ");
        System.out.println("2. Cálculo del precio del alquiler. ");
        System.out.println("3. Imprimir lista de vehículos. ");
        System.out.println("4. Salir. ");
    }
    private static void darAltaVehiculos(){
        int seleccionUsuario;
        System.out.println("estos son los vehiculos disponibles");
        int opcion = 1;
        for (TiposVehiculos tipoVehiculo : TiposVehiculos.values()){
            System.out.println(tipoVehiculo);
            System.out.println(opcion+ ". " +String.valueOf(tipoVehiculo).toLowerCase());
        }
        seleccionUsuario = Lectora.leerEnteroDeRango("Seleccion: ", TiposVehiculos.values().length, 1);

    }
}
