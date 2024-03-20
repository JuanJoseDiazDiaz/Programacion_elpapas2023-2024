package Boletin6_Listas.EjercicioColecciones_2.RecetaCocina;

import boletin4.MiEntradaSalida2;

public class Main {
    private static  final String TOKEN_FINALIZACION= "fin";
    public static void main(String[] args) {

    }
    public void nuevaReceta() throws RestauranteException {
        String nombre = String.valueOf(MiEntradaSalidaLectora.Lectora.leerCaracter("Nombre de la receta"));
        double duracion = MiEntradaSalidaLectora.Lectora.leerDoublePositivo("Duracion de la receta");
        Plato plato = new Plato(nombre, duracion);

        String cadena = null;
        int cantidad;
        do {
            cadena = String.valueOf(MiEntradaSalidaLectora.Lectora.leerCaracter("Introduce el nombre del ingrediente"));
            if (!cadena.equals(TOKEN_FINALIZACION)){
                plato.nuevoPaso(cadena);
            }
        }while (!cadena.equals(TOKEN_FINALIZACION));
    }
}
