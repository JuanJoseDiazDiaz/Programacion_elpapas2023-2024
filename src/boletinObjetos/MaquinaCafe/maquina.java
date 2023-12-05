package boletinObjetos.MaquinaCafe;

public class maquina {
    public static void MenuMaquina(){
        System.out.println("Elige cualquier opcion:");
        System.out.println("1. Servir café solo (1 euro) ");
        System.out.println("2. Servir leche (0,8 euros)");
        System.out.println("3. Servir café con leche (1,5 euros)");
        System.out.println("4. Consultar estado máquina. Aparecen los datos de los depósitos y del monedero");
        System.out.println("5. Apagar máquina y salir");
    }
    //QUIERO CAMBIARLO A DOUBLE EL METODO
    public static void ServirCafe (double dineroActual){
        double costeCafe = 1;
        System.out.println("El precio del cafe solo es de 1€");
        double resultado = dineroActual - costeCafe;
        System.out.println("Aqui tienes su cafe");
        if (dineroActual < resultado){
            System.out.println("aqui tiene su cambio");
        }
    }
}

