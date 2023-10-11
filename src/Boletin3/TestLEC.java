package Boletin3;

public class TestLEC {
    public static void main(String[] args) {
        System.out.println("introduce un numero positivo: ");
        int max = Prueba.MiEntradaSalida.teclado.nextInt();
        System.out.println("introduce un numero positivo: ");
        int min = Prueba.MiEntradaSalida.teclado.nextInt();

        int i = Prueba.MiEntradaSalida.leerEntero(max, min);
        System.out.println(i);


    }
}
