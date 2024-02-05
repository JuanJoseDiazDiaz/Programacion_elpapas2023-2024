package BoletinHerencias_5_1.JuegoDeRoll;


import static BoletinHerencias_5_1.JuegoDeRoll.Raza.*;


public class MenuJuegoRoll {
    public static void main(String[] args) throws PersonajeException {
        Mago magoA = new Mago("merlin", HUMANO, 10, 19, 100);
        Mago magoB = new Mago("jose", ELFO, 10, 19, 100);
        Clerigo clerigoA = new Clerigo("juan", ORCO, 10, 10, 100, "Jesus");
        imprimirDatosPersonajes(magoA, magoB, clerigoA);

        magoA.aprendeHechizo("Rayo");
        System.out.println("El magoA ha aprendido el hechizo");
        magoA.aprendeHechizo("Fuego");
        System.out.println("El magoA ha aprendido el hechizo");
        magoB.aprendeHechizo("Hielo");
        System.out.println("El magoB ha aprendido el hechizo \n");

        imprimirDatosMagos(magoA, magoB);

        magoA.lanzarHechizo(magoB, "Adracadabra");
        System.out.println("El magoA ha lanzado el hechizo al magoB");
        magoB.lanzarHechizo(magoA, "leviosa");
        System.out.println("El magoB ha lanzado el hechizo al magoA");
        magoA.lanzarHechizo(magoB, "Espeliarmus");
        System.out.println("El magoA ha lanzado el hechizo al magoB \n");
        imprimirDatosMagos(magoA, magoB);

        clerigoA.ClerigoCurar(magoB, "Jesus");

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
