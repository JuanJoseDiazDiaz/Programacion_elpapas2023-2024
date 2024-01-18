package Avion.MundialChapas;

public class jugadores {

private String nombre;
private int edad;
private int numGoles;
private jugadores [] listaGoles;
    private jugadores jugadorLocal;
    private jugadores jugadorVisitante;

    public jugadores(String nombre, int edad, int numGoles) {
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    public void addGoljugador(jugadores numGolesJug){
        for (int i = 0; i < listaGoles.length; i++){
            if (listaGoles[i] == null){
                this.listaGoles[i] = numGolesJug;
                break;
            }
        }
    }
    public int getNumGoles() {
        return numGoles;
    }
    public jugadores getJugadorLocal() {
        return jugadorLocal;
    }

    public jugadores getJugadorVisitante() {
        return jugadorVisitante;
    }
    public static void obtenerGoles(jugadores[] jugador, Partido[] partidos){
        int golesTotales = 0;
        for (Partido partido : partidos) {
            if (partido.getJugadorLocal().equals(jugador)) {
                golesTotales += partido.getGolesLocal();
            } else if (partido.getJugadorVisitante().equals(jugador)) {
                golesTotales += partido.getGolesVisitante();
            }
        }
        System.out.println("Estos son los goles totales: "+ golesTotales);

    }

}
