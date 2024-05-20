package GestionMascota;

import boletin1Arrays.MiEntradaSalida;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class Principal {
    private static Tienda tienda = new Tienda("AnimalCrossing");

    public static void main(String[] args) {
        addCliente();
        addMascota();
    }

    public static void addCliente() {
        tienda.addCliente(MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("introduce el nombre del cliente: "));
    }

    public static void addMascota() {
        String nombre = MiEntradaSalidaLectora.Lectora.solicitarCadenaMinus("introduce el nombre de la mascota: ");
        int edad = MiEntradaSalidaLectora.Lectora.leerEnteroPositivo("introduce la edad de la mascota: ");
        double precio = MiEntradaSalidaLectora.Lectora.leerEnteroPositivo("introduce el precio de la mascota: ");
        Especie tipoEspecie = MiEntradaSalidaLectora.Lectora.leerEnum("Que tipo de especies es: ", Especie.values());
        boolean disponible = MiEntradaSalidaLectora.Lectora.leerCaracterSN("¿esta disponible para la venta?") == 'S';
        tienda.addMascota(nombre, tipoEspecie, edad, precio, disponible);
    }

    public static void addCompra(){
        List<Cliente> clientes =  tienda.getListaDeClientes();
        List<Mascotas> mascotas =  tienda.listasDeMascotasDisponibles();
        Cliente c = MiEntradaSalidaLectora.Lectora.leerEnum("selecciona el cliente: ", clientes.toArray(Cliente[]::new));
        Mascotas m = MiEntradaSalidaLectora.Lectora.leerEnum("Seleccione a la mascota: ", mascotas.toArray(Mascotas[]::new));
        tienda.comprarMascota(c, m);
    }
}
