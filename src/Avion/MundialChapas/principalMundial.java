package Avion.MundialChapas;

import java.util.Scanner;

public class principalMundial {

    public static void main(String[] args) {
         jugadores[] jugadores = new jugadores[100];
         Partido [] partidos = new Partido[20];
         Equipo [] equipos = new Equipo[5];

        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            mundial.menuMundial();
            opcion = teclado.nextInt();
        }while (opcion > 6);
        switch (opcion){
            case 1 :
                CrearNuevoEquipo();
                break;
            case 2:
                addjugador();
                break;
            case 3:
               mundial.golesTotalesEquipo(equipos, partidos);
               break;
            case 4:
                mundial.obtenerGolesJugador(jugadores, partidos);
                break;
            case 5:

                break;
        }



    }
    public static void CrearNuevoEquipo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu pais Representate: ");
        String paisRepresentante = sc.nextLine();
        System.out.println("Cual es el nombre de tu propio entrenador de equipo: ");
        String nombreEntrenador = sc.nextLine();
        Equipo nuevoEquipo = new Equipo(paisRepresentante, nombreEntrenador);
        System.out.println("has creado un nuevo equipo");
    }
    public static void addjugador(){
        Equipo equipo = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el nombre del jugador: ");
        String nombre = sc.nextLine();
        System.out.println("Cual es la edad del jugador : ");
        int edad = sc.nextInt();
        System.out.println("Cuantos goles ha marcado este jugador: ");
        int numGoles = sc.nextInt();
        jugadores nuevoJugador = new jugadores(nombre, edad, numGoles);
        equipo.addJugadorLista(nuevoJugador);
        System.out.println("has añadido un jugador a tu equipo");
    }
    public void menuMundial(){
        System.out.println("Introduce una opcion: ");
        System.out.println("1. Crear un nuevo equipo");
        System.out.println("2. Añadir un nuevo jugador a un equipo existente");
        System.out.println("3. Ver el número total de goles marcados por un equipo existente");
        System.out.println("4. Ver el número total de goles marcados por un jugador existente");
        System.out.println("5. Ver el equipo con más goles marcados en el mundia");
        System.out.println("6. Ver el jugador con más goles marcados en el mundial");
    }

}
