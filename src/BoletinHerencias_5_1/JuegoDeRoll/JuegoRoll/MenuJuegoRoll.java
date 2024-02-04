package JuegoRoll;

import static JuegoRoll.Raza.HUMANO;

public class MenuJuegoRoll {
    public static void main(String[] args) throws PersonajeException {
        Mago magoA = new Mago("merlin", HUMANO, 10, 10, 100);
        Mago magoB = new Mago("jose", HUMANO, 10, 19, 100);
        Clerigo clerigoA = new Clerigo("juan", HUMANO, 10, 10, 100, "Jesus");
        imprimirDatosPersonajes(magoA, magoB, clerigoA);

        magoA.aprendeHechizo("Rayo");
        magoA.aprendeHechizo("Fuego");
        magoB.aprendeHechizo("Hielo");

        imprimirDatosMagos(magoA, magoB);

        magoA.lanzarHechizo(magoB, "Adracadabra");
        magoB.lanzarHechizo(magoA, "leviosa");
        magoA.lanzarHechizo(magoB, "Espeliarmus");
        clerigoA.ClerigoCurar(magoA);

        imprimirDatosPersonajes(magoA, magoB, clerigoA);

    }
    private static void imprimirDatosPersonajes(Mago magoA, Mago magoB, Clerigo clerigoA) {
        System.out.println("Datos de los personajes:");
        System.out.println(magoA);
        System.out.println(magoB);
        System.out.println(clerigoA);
        System.out.println();
    }
    private static void imprimirDatosMagos(Mago magoA, Mago magoB) {
        System.out.println("Datos de los Magos:");
        System.out.println(magoA);
        System.out.println(magoB);
        System.out.println();
    }
}
