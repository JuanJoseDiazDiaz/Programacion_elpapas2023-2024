package Avion.MundialChapas;

public class Equipo {
    private static int NUM_MAX_JUG = 2;
    private String paisRepresentante;
    private  String nombreEntrenador;
    private jugadores [] listaDeJug;


    public Equipo(String paisRepresentante, String nombreEntrenador) {
        this.paisRepresentante = paisRepresentante;
        this.nombreEntrenador = nombreEntrenador;
        this.listaDeJug = new jugadores[10];
    }

    public void addJugadorLista(jugadores nuevoJugador){ //ESTE TE VA A AÑADIR A UN JUGADOR
        for (int i = 0; i < NUM_MAX_JUG; i++){
            if (listaDeJug[i] == null){
                this.listaDeJug[i] = nuevoJugador;
                break;
            }
        }
    }
    public void removeJugLista (){ //QUITA UN JUGADOR
        if (listaDeJug[0] == null){
            System.out.println("No hay ningun jugador en la lista");
        }
        boolean salir = false;
        for (int i = 0; i < NUM_MAX_JUG && !salir; i++){
            listaDeJug[i - 1] = listaDeJug[i];
            listaDeJug[i] = null;
            if (i < NUM_MAX_JUG -1 && listaDeJug[i+1] == null ){
                salir = true;
            }
        }

    }

    public String getNombreEntrenador() {
        System.out.println("este es el nombre del entrenador: ");
        return nombreEntrenador;
    }
   public static int obtenerGoles(jugadores[] jugador, Partido[] partidos){
       int golesTotales = 0;
        for (Partido partido : partidos) {
           if (partido.getJugadorLocal().equals(jugador)) {
               golesTotales += partido.getGolesLocal();
           } else if (partido.getJugadorVisitante().equals(jugador)) {
               golesTotales += partido.getGolesVisitante();
           }
       }
      return golesTotales;

   }





}
