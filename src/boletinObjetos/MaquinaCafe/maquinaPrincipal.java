package boletinObjetos.MaquinaCafe;

import java.util.Scanner;

public class maquinaPrincipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcionEscogida = 0;
        monedero.cuantoTengo();
        maquina maq = new maquina();
        do {
            MenuMaquina();
            System.out.println("Seleciona la opcion");
            opcionEscogida = teclado.nextInt();
            switch (opcionEscogida){
                case 1 :
                    if (maq.puedoServirCafe()){
                        try {
                            maq.darCambio(maquina.MONEDERO_INICIAL);
                            maq.servirCafe();
                        }catch (MaquinaExpection e ){
                            System.out.println(e.getMessage());
                        }
                    }else {
                        System.out.println("Producto agotado");
                    }
                break;

                case 2:
                    if (maq.puedoServirLeche()){
                        try {
                            maq.darCambio(maquina.MONEDERO_INICIAL);
                            maq.servirLeche();
                        }catch (MaquinaExpection e ){
                            System.out.println(e.getMessage());
                        }
                    }else {
                        System.out.println("Producto agotado");
                    }
                    break;

                case 3:
                    if (maq.puedoServirCafeConLeche()){
                        try {
                            maq.darCambio(maquina.MONEDERO_INICIAL);
                            maq.servirCafeConLeche();
                        }catch (MaquinaExpection e ){
                            System.out.println(e.getMessage());
                        }
                    }else {
                        System.out.println("Producto agotado");
                    }
                    break;
                case 4:
                    System.out.println(maq);
                    break;
                case 5:
                    System.out.println("Gracias por confiar en nuestra maquina :)");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + opcionEscogida);
            }


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

