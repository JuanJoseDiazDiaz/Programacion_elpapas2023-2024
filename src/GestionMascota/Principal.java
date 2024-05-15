package GestionMascota;

import boletin1Arrays.MiEntradaSalida;

import java.util.Scanner;

import static java.lang.System.*;

public class Principal {
    private static Tienda tienda = new Tienda("AnimalCrossing");

    public static void main(String[] args) {

    }

    public static void addMascota() {
        String nombre = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("introduce el nombe de la mascota: ");
        int edad = MiEntradaSalidaLectora.Lectora.leerEnteroPositivo("introduce la edad de la mascota: ");
        double precio = MiEntradaSalidaLectora.Lectora.leerEnteroPositivo("introduce la edad de la mascota: ");
        Especie tipoEspecie = MiEntradaSalidaLectora.Lectora.leerEnum("introduce las especies: ", Especie.values());

    }

}
