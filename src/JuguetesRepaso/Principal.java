package JuguetesRepaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static List<Juguete> listaJuguetes = new ArrayList<>();
    private static List<Juguete> listaAplilable = new ArrayList<>();
    private static int recuentoDeJuguetes = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 8) {
            menu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Creaccion FiguraMadera
                    addFiguraMadera();
                    System.out.println("Se ha añadido");
                    break;
                case 2:
                    // Creaccion InstrumentoMadera
                    addInstrumentoMusical();
                    System.out.println("Se ha añadido");
                    break;
                case 3:
                    // Código para la opción 3
                    addVehiculoPlastico();
                    break;
                case 4:
                    // Código para la opción 4
                    addPiezaLego();
                    break;
                case 5:
                    // Código para la opción 5
                    try {
                        apilarJuguete();
                    } catch (ErrorException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    // Código para la opción 6
                    mostrarListaJuguetes();
                    break;
                case 7:
                    // Código para la opción 7
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
            System.out.println();
        }

        scanner.close();
    }


    public static void addFiguraMadera() {
        String nombreJuguete = MiEntradaSalida.Lectora.leerCadena("Introduce el nombre de la figura de madera: ");
        String marcaJuguete = MiEntradaSalida.Lectora.leerCadena("Introduce la marca de la figura de madera: ");
        PaisOrigenMadera paisOrigenMadera = MiEntradaSalida.Lectora.leerEnum("selecciona el pais de origen de la madera: ", Arrays.stream(PaisOrigenMadera.values()).toArray(PaisOrigenMadera[]::new));
        int anioTala = MiEntradaSalida.Lectora.leerEnteroPositivo("Introduce el año de la tala");
        ColorFigura colorFigura = MiEntradaSalida.Lectora.leerEnum("selecciona el color de la figura de madera: ", Arrays.stream(ColorFigura.values()).toArray(ColorFigura[]::new));
        int numLados = MiEntradaSalida.Lectora.leerEnteroPositivo("Introduce el numero de lados de la figura ");
        double precio = MiEntradaSalida.Lectora.leerDouble("Introduce el precio de la figura ");
        try {
            FigurasDeMadera  f = new FigurasDeMadera(nombreJuguete, marcaJuguete, paisOrigenMadera, precio, anioTala, colorFigura, numLados);
            listaJuguetes.add(f);
            recuentoDeJuguetes++;
        } catch (ErrorException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addInstrumentoMusical() {
        String nombreJuguete = MiEntradaSalida.Lectora.leerCadena("Introduce el nombre del jueguete de madera: ");
        String marcaJuguete = MiEntradaSalida.Lectora.leerCadena("Introduce la marca del instrumento musical de madera: ");
        PaisOrigenMadera paisOrigenMadera = MiEntradaSalida.Lectora.leerEnum("selecciona el pais de origen de la madera: ", Arrays.stream(PaisOrigenMadera.values()).toArray(PaisOrigenMadera[]::new));
        int anioTala = MiEntradaSalida.Lectora.leerEnteroPositivo("Introduce el año de la tala");
        int edadInstrumento = MiEntradaSalida.Lectora.leerEnteroPositivo("Introduce la edad del instrumento: ");
        double precio = MiEntradaSalida.Lectora.leerDouble("Introduce el precio del instrumento ");
        try {
            InstrumentosMusicalesMadera m = new InstrumentosMusicalesMadera(nombreJuguete, marcaJuguete, precio, paisOrigenMadera, anioTala, edadInstrumento);
            listaJuguetes.add(m);
            recuentoDeJuguetes++;
        } catch (ErrorException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addVehiculoPlastico() {
        String nombreJuguete = MiEntradaSalida.Lectora.leerCadena("Introduce el nombre del jueguete de plastico: ");
        String marcaJuguete = MiEntradaSalida.Lectora.leerCadena("Introduce la marca del vehiculo de plastico: ");
        TipoPlastico tipoPlastico = MiEntradaSalida.Lectora.leerEnum("selecciona el tipo de plastico: ", Arrays.stream(TipoPlastico.values()).toArray(TipoPlastico[]::new));
        int numRuedas = MiEntradaSalida.Lectora.leerEnteroPositivo("Introduce el numero de ruedas del vehiculo");
        double precio = MiEntradaSalida.Lectora.leerDouble("Introduce el precio del vehiculo ");
        try {
            if (tipoPlastico == TipoPlastico.PVC) {
                System.out.println("Se ha creado Correctamente");
                VehiculosPlastico v = new VehiculosPlastico(nombreJuguete, marcaJuguete, precio, tipoPlastico, numRuedas);
                listaJuguetes.add(v);
                recuentoDeJuguetes++;
            }
        } catch (ErrorException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addPiezaLego() {
        String nombreJuguete = MiEntradaSalida.Lectora.leerCadena("Introduce el nombre del jueguete de plastico: ");
        String marcaJuguete = MiEntradaSalida.Lectora.leerCadena("Introduce la marca del jueguete de plastico: ");
        TipoPlastico tipoPlastico = MiEntradaSalida.Lectora.leerEnum("selecciona el tipo de plastico: ", Arrays.stream(TipoPlastico.values()).toArray(TipoPlastico[]::new));
        double longitudPieza = MiEntradaSalida.Lectora.leerDouble("Introduce la longitud de la pieza: ");
        String colorPieza = MiEntradaSalida.Lectora.leerCadena("Introduce el color de la pieza: ");
        double precio = MiEntradaSalida.Lectora.leerDouble("Introduce el precio de la pieza ");
        try {
            if (tipoPlastico == TipoPlastico.ABS) {
                System.out.println("Se ha creado Correctamente");
                PiezasLego p = new PiezasLego(nombreJuguete, marcaJuguete, precio, tipoPlastico, longitudPieza, colorPieza);
                listaJuguetes.add(p);
                recuentoDeJuguetes++;
            }
        } catch (ErrorException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void apilarJuguete() throws ErrorException {
        List<Juguete> listTodosJuguetes = getListaJuguetes();
        List<Juguete> listApilable2 = getListaAplilable();
        Juguete juguetes = MiEntradaSalida.Lectora.leerEnum("Selecciona el primer jueguete", listTodosJuguetes.toArray(Juguete[]::new));

        if (juguetes instanceof Apilable) {
            if (!juguetes.equals(juguetes)) {
                listaAplilable.add(juguetes);
                System.out.println("Se ha registrado el primer Juguete");
                if (listaAplilable.size() >= 2) {
                    Juguete newJuguete = MiEntradaSalida.Lectora.leerEnum("Selecciona el segundo", listTodosJuguetes.toArray(Juguete[]::new));
                    if (newJuguete instanceof Apilable && !newJuguete.equals(newJuguete)) {
                        listaAplilable.add(newJuguete);
                        for (Juguete listaAplilada : listaAplilable) {
                            System.out.println("Lista de apilables");
                            System.out.println(listaAplilada);
                        }
                        System.out.println("se han apilado");
                    } else {
                        throw new ErrorException("El segundo juguete no es aplicable");
                    }
                }

            }
        } else {
            throw new ErrorException("No es apilable");
        }
    }

    public static void mostrarListaJuguetes() {
        double resultadoPrecioTotal = 0;
        for (Juguete listaJuguete : listaJuguetes) {
            System.out.println(listaJuguete);
            resultadoPrecioTotal = listaJuguete.getPrecioJuguete() * recuentoDeJuguetes;
        }
        System.out.println("El precio total de los juguetes juntos es de: "+ resultadoPrecioTotal);
    }


    public static void menu() {
        System.out.println("Menú de Opciones:");
        System.out.println("1. Creaccion Figura Madera");
        System.out.println("2. Creaccion Instrumento Musical de Madera");
        System.out.println("3. Creaccion vehículo de plástico");
        System.out.println("4. Creaccion pieza de lego");
        System.out.println("5. Apilar Juguete");
        System.out.println("6. Mostrar todos los juguetes");
        System.out.println("7. Salir");
    }

    public static List<Juguete> getListaJuguetes() {
        return listaJuguetes;
    }

    public static List<Juguete> getListaAplilable() {
        return listaAplilable;
    }
}
