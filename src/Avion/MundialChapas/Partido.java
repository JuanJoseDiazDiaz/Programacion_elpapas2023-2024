package Avion.MundialChapas;

public class Partido {
    private jugadores jugadorLocal;
    private jugadores jugadorVisitante;
    private Equipo equipolocal;
    private Equipo equipoVisitante;


    private int golesLocal;
    private int golesVisitante;
    public Partido(jugadores jugadorLocal, jugadores jugadorVisitante, int golesLocal, int golesVisitante) {
        this.jugadorLocal = jugadorLocal;
        this.jugadorVisitante = jugadorVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public Equipo getEquipolocal() {
        return equipolocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public jugadores getJugadorLocal() {
        return jugadorLocal;
    }

    public jugadores getJugadorVisitante() {
        return jugadorVisitante;
    }
}
