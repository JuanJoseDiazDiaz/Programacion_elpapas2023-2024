package ExamenColecciones2022;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Liga {
    private List<Equipo> equipos;
    private String nombreLiga;

    public Liga(String nombre) {
        super();
        this.equipos = new ArrayList<>();
        this.nombreLiga = nombre;
    }

    public void addEquipo(Equipo e) throws LigaException {
        for (Equipo equipo : equipos){
            if (!equipos.contains(e.getJugadores())){
                throw new LigaException("No hay jugadores en el equipo");
            }
        }
        equipos.add(e);
    }

    public void eliminaEquipo(Equipo e) throws LigaException {
        if (!equipos.contains(e)){
            throw new LigaException("No existe ese equipo en la liga");
        }
        equipos.remove(e);
    }


    public void unirEquipos(Equipo e1, Equipo e2) throws LigaException {
        if (!equipos.contains(e1) && !equipos.contains(e2)){
            throw new LigaException("Los dos equipos a unir no pertenecen a liga");
        }
        e2.getJugadores().addAll(e1.getJugadores());
    }

    public List<Jugador> jugadoresEnComun(Equipo e1, Equipo e2) throws LigaException {
        if (!equipos.contains(e1) && !equipos.contains(e2)){
            throw new LigaException("Esos equipos no estan en esta liga");
        }
      return equipos.stream().flatMap(equipo -> equipo.getJugadores().stream()).filter(jugador -> e1.getJugadores().equals(e2.getJugadores())).toList();
    }

    public double mediaEdad() throws LigaException {
        return todosLosJugadores().stream().mapToDouble(Jugador::getEdad).average().orElseThrow(() -> new LigaException("No hay jugadores en la liga"));
    }

    public List<Jugador> jugadoresOrdenadosEdad() {
       return equipos.stream().flatMap(equipo -> equipo.getJugadores().stream()).sorted((a,b) -> a.getEdad() - b.getEdad()).toList();
    }

    public List<Jugador> jugadoresOrdenadosNombre() {
        return equipos.stream().flatMap(equipo -> equipo.getJugadores().stream()).sorted((a,b) -> a.getNombre().compareTo(b.getNombre())).toList();
    }

    private Set<Jugador> todosLosJugadores() {
       return equipos.stream().flatMap(equipo -> equipo.getJugadores().stream()).collect(Collectors.toSet());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bienvenidos a " + nombreLiga).append(System.lineSeparator());
        sb.append("Equipos: ").append(System.lineSeparator());
        for (Equipo e: equipos) {
            sb.append(e).append(System.lineSeparator());
        }

        return sb.toString();

    }
}
