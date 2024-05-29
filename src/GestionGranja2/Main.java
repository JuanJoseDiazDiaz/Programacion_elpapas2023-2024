package GestionGranja2;

import boletin1Arrays.MiEntradaSalida;

import java.util.List;

public class Main {
    private static Granja miGranja = new Granja("Mi Corral IslaCristina");

    public static void main(String[] args){
        /*//Animales ->
        addAnimal();
        chequeoGeneral();

        //Productos ->
        addProducto();
        chequeoProductos();
        addProducto();
        chequeoProductos();
        venderProductos();
        listarProductosDisponibles();

         */
        int opcion;
        opcion = MiEntradaSalidaLectora.Lectora.leerEnteroPositivo("selecciona la opcion : ");
        do {
            menu();
            switch (opcion) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    chequeoGeneral();
                    break;
                case 3:
                    // HACER ESTE METODO
                    break;
                case 4:
                    // HACER ESTE METODO
                    break;
                case 5:
                    addProducto();
                    break;
                case 6:
                    chequeoProductos();
                    break;
                case 7:
                    venderProductos();
                    break;
                case 8:
                    listarProductosDisponibles();
                    break;
                case 9:
                    System.out.println("Adios!!!");
                    break;

            }

        } while (opcion != 9);

    }

    public static void menu() {
        System.out.println("""
                1)Añadir animal
                2)Realizar chequeo
                3)Alimentar al animal
                4)Comprobar el estado de salud del los animales
                5)Añadir producto
                6)Reponer producto
                7)Compra producto
                8)Listar todos los productos
                9)Salir
                """);
    }

    public static void addAnimal(){
        int idAnimal = Integer.parseInt(MiEntradaSalidaLectora.Lectora.solicitarCadenaMayus("introduce el id del Animal: "));
        String nombreAnimal = MiEntradaSalidaLectora.Lectora.solicitarCadenaMayus("introduce el nombre del Animal: ");
        AnimalesGranja animalesGranja = MiEntradaSalidaLectora.Lectora.leerEnum("Que tipo de especies es: ", AnimalesGranja.values());
        String tipoAlimentacion = MiEntradaSalidaLectora.Lectora.solicitarCadenaMayus("introduce el tipo de alimentacion del Animal: ");
        int edad = MiEntradaSalidaLectora.Lectora.leerEnteroPositivo("introduce la edad del Animal: ");
        int salud = MiEntradaSalidaLectora.Lectora.leerEnteroPositivo("introduce la Salud del Animal: ");
        try {
            miGranja.addAnimal(idAnimal, nombreAnimal, animalesGranja, tipoAlimentacion, edad, salud);
        } catch (AnimalException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addProducto() {
        String nombreProducto = MiEntradaSalidaLectora.Lectora.solicitarCadenaMayus("introduce el nombre del Producto: ");
        Productos tipoProducto = MiEntradaSalidaLectora.Lectora.leerEnum("Que tipo de Producto es: ", Productos.values());
        int cantDisponible = MiEntradaSalidaLectora.Lectora.leerEnteroPositivo("introduce la cantidad disponible de productos: ");
        double precio = MiEntradaSalidaLectora.Lectora.leerDouble("introduce el precio del Producto: ");
        miGranja.addProducto(nombreProducto, tipoProducto, cantDisponible, precio);
    }

    public static void chequeoGeneral() {
        List<Animal> animalList = miGranja.getListaAnimales();
        Animal a = MiEntradaSalidaLectora.Lectora.leerEnum("selecciona el animal: ", animalList.toArray(Animal[]::new));
        miGranja.checkSaludAnimal(a);
        miGranja.registrarAlimentacion(a);
    }

    public static void chequeoProductos() {
        List<ProductosAgricolas> productosAgricolas = miGranja.listaProductosAgricolas();
        ProductosAgricolas p = MiEntradaSalidaLectora.Lectora.leerEnum("selecciona el producto: ", productosAgricolas.toArray(ProductosAgricolas[]::new));
        miGranja.checkCantidad(p);
        miGranja.registrarPrecio2(p);
    }



    /*
    public static void venderProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Venta de Producto ---");
        System.out.println("1. Ver lista de precios");
        System.out.println("2. Ver lista de cantidades disponibles");
        System.out.println("3. Proceder a la venta");
        System.out.println("0. Cancelar");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir nueva línea

        switch (opcion) {
            case 1:
               // TODO -> DUDA COMO METER UNA LISTA DE PRECIOS DISPONIBLE AQUI
                break;
            case 2:
                // TODO -> DUDA COMO METER UNA LISTA DE CANTIDAD DISPONIBLE AQUI
                break;
            case 3:
                System.out.print("\nIngrese el nombre del producto a vender: ");
                String nombreProducto = scanner.nextLine();
                for (ProductosAgricolas producto : miInventario.listaProductosAgricolas()) {
                    if (producto.getNombreProducto().equals(nombreProducto)) {
                        if (producto.getCantDisponible() > 0) {
                            producto.setCantDisponible(0);
                            System.out.println("El producto ha sido vendido.");

                            if (producto.getCantDisponible() <= 0) {
                                miInventario.listaProductosAgricolas().remove(producto);
                            }
                            return;
                        } else {
                            System.out.println("No hay suficiente stock.");
                            return;
                        }
                    }
                }
                System.out.println("El producto no existe.");
                break;
            case 0:
                System.out.println("Cancelando venta.");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }

     */


    public static boolean venderProductos() {
        List<ProductosAgricolas> listproductosAgricolas = miGranja.listaProductosAgricolas();
        ProductosAgricolas p = MiEntradaSalidaLectora.Lectora.leerEnum("selecciona el producto que quieres comprar: ", listproductosAgricolas.toArray(ProductosAgricolas[]::new));

        for (int i = 0; i < listproductosAgricolas.size(); i++) {
            if (p.getNombreProducto().equals(p.getNombreProducto())) {
                if (p.getCantDisponible() >= p.getCantDisponible()) {
                    p.setCantDisponible(0);
                    if (p.getCantDisponible() <= 0) {
                        miGranja.listaProductosAgricolas().remove(p.getNombreProducto());
                        System.out.println("El producto ha sido vendido");
                    }
                    return true;
                } else {
                    System.out.println("No hay suciente Stock");
                    return false;
                }
            }

        }
        return false; // El producto no existe
    }

    public static void listarProductosDisponibles() {
        System.out.println("Productos disponibles para la venta:");
        for (ProductosAgricolas productosAgricolas : miGranja.listaProductosAgricolas()) {
            if (productosAgricolas.isDisponible()) {
                System.out.println("Producto: " + productosAgricolas.getNombreProducto() + ", Precio: " + productosAgricolas.getPrecio() + ", Cantidad: " + productosAgricolas.getCantDisponible());
            }
        }
    }


}
