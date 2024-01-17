package boletinRepasoExamen.Avion.boletin4_1.Ej2;

public class ordenador {
    public static void main(String[] args) {
        Placa_Base placabase = new Placa_Base("asus", "intel", "core");
        microprocesador microprocesador = new microprocesador("asus", "a500", 4, 120f, "core");
        discoDuro discoDuro = new discoDuro("hp", "ssd", 50);
        tarjetaGrafica tarjetaGrafica = new tarjetaGrafica("open", "324as", 5, 50f, 400);
        System.out.println("El ordenador se compone por: ");
        System.out.println(placabase);
        System.out.println(microprocesador);
        System.out.println(discoDuro);
        System.out.println(tarjetaGrafica);
        placabase.compatibilidadPlacaBase("core", "core");


    }

}
