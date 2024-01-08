package boletinObjetos.MaquinaCafe;

import boletin1Arrays.MiEntradaSalida;

public class maquinaPrincipal {
    public static void main(String[] args) {
        int opcionEscogida = 0;
        monedero.cuantoTengo();
        do {
            MenuMaquina();
            switch (opcionEscogida){
                case 1 :

            }
            System.out.println("Seleciona la opcion");
        }while(opcionEscogida != 5);

    }
    public static void MenuMaquina(){
        System.out.println("BIENVENIDO A LA MAQUINA DE CAFE, QUE DESEA?");
        System.out.println("Elige cualquier opcion:");
        System.out.println("1. Servir café solo ("+maquina.PRECIO_CAFE+" euro) ");
        System.out.println("2. Servir leche ("+maquina.PRECIO_LECHE+" euros)");
        System.out.println("3. Servir café con leche ("+maquina.PRECIO_CAFE_LECHE+" euros)");
        System.out.println("4. Consultar estado máquina. Aparecen los datos de los depósitos y del monedero");
        System.out.println("5. Apagar máquina y salir");
    }


}

