package boletinObjetos.MaquinaCafe;

import java.util.Scanner;

public class monedero {

    monedero dinero = new monedero();
    public static void cuantoTengo (){
        Scanner teclado = new Scanner(System.in);
        System.out.println("cuanto dinero dispones en el monedero: ");
        double dineroActual = teclado.nextDouble();
        System.out.println("esta es la cantidad que tienes dentro del monedero: "+dineroActual+ "€");
    }
}
