package GestionGranja;

import java.util.List;

public class Main {
    private static Granja miGranja = new Granja("Mi Corral IslaCristina");
    private static Inventario miInventario = new Inventario("El mas chulo");

    public static void main(String[] args) {
        //Animales ->
        addAnimal();
        chequeoGeneral();

        //Productos ->
        addProducto();
        ventaProductos();
        listaOrdenadaProductos();


    }

    public static void addAnimal() {
        int idAnimal = Integer.parseInt(MiEntradaSalida.Lectora.solicitarCadenaMayus("introduce el id del Animal: "));
        String nombreAnimal = MiEntradaSalida.Lectora.solicitarCadenaMayus("introduce el nombre del Animal: ");
        AnimalesGranja animalesGranja = MiEntradaSalida.Lectora.leerEnum("Que tipo de especies es: ", AnimalesGranja.values());
        String tipoAlimentacion = MiEntradaSalida.Lectora.solicitarCadenaMayus("introduce el tipo de alimentacion del Animal: ");
        int edad = MiEntradaSalida.Lectora.leerEnteroPositivo("introduce la edad del Animal: ");
        int salud = MiEntradaSalida.Lectora.leerEnteroPositivo("introduce la Salud del Animal: ");
        miGranja.addAnimal(idAnimal,nombreAnimal, animalesGranja, tipoAlimentacion, edad, salud);
    }

    public static void addProducto() {
        String nombreProducto = MiEntradaSalida.Lectora.solicitarCadenaMayus("introduce el nombre del Producto: ");
        Productos tipoProducto = MiEntradaSalida.Lectora.leerEnum("Que tipo de Producto es: ", Productos.values());
        int cantDisponible = MiEntradaSalida.Lectora.leerEnteroPositivo("introduce la cantidad disponible de productos: ");
        double precio = MiEntradaSalida.Lectora.leerDouble("introduce el precio del Producto: ");
        miInventario.addProducto(nombreProducto, tipoProducto, cantDisponible, precio);
    }

    public static void chequeoGeneral() {
        List<Animal> animalList = miGranja.getListaAnimales();
        Animal a = MiEntradaSalida.Lectora.leerEnum("selecciona el animal: ", animalList.toArray(Animal[]::new));
        miGranja.checkSaludAnimal(a);
        miGranja.registrarAlimentacion(a);
    }

    public static void ventaProductos() {
        String nombreProducto = MiEntradaSalida.Lectora.solicitarCadenaMayus("introduce el nombre del Producto:  ");
        Productos tipoProducto = MiEntradaSalida.Lectora.leerEnum("Que tipo de Producto es: ", Productos.values());
        int cantDisponible = MiEntradaSalida.Lectora.leerEnteroPositivo("introduce la cantidad disponible de productos: ");
        double precio = MiEntradaSalida.Lectora.leerDouble("introduce el precio del Producto: ");

        List<ProductosAgricolas> productosAgricolasList = miInventario.ListaProductosVendidos(new ProductosAgricolas(nombreProducto, tipoProducto, cantDisponible,precio));
        System.out.println("Productos vendidos: ");
        for (ProductosAgricolas p : productosAgricolasList){
            System.out.println(p);
        }
    }

    public static void listaOrdenadaProductos() {
        String nombreProducto = MiEntradaSalida.Lectora.solicitarCadenaMayus("introduce el nombre del Producto: ");
        Productos tipoProducto = MiEntradaSalida.Lectora.leerEnum("Que tipo de Producto es: ", Productos.values());
        int cantDisponible = MiEntradaSalida.Lectora.leerEnteroPositivo("introduce la cantidad disponible de productos: ");
        double precio = MiEntradaSalida.Lectora.leerDouble("introduce el precio del Producto: ");

        List<ProductosAgricolas> productosAgricolasListOrdenados = miInventario.listOrdenadaProducto(new ProductosAgricolas(nombreProducto, tipoProducto, cantDisponible,precio));
        System.out.println("Productos ordenados: ");
        for (ProductosAgricolas p : productosAgricolasListOrdenados){
            System.out.println(p);
        }

    }

}
