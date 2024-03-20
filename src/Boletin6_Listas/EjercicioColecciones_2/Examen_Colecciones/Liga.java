package Boletin6_Listas.EjercicioColecciones_2.Examen_Colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Liga {
    private List<Equipo> equipos;
    private String nombre;
    
    public Liga(String nombre) {
        super();
        this.equipos = new ArrayList<>();
        this.nombre = nombre;
    }
    
    public void addEquipo(Equipo e) throws LigaException {
        if (!equipos.contains(e)){
            throw new LigaException("No se encuentra a dicho equipo");
        }
        if (e.getJugadores().isEmpty()){
            throw new LigaException("La lista del equipo esta vacia aun");
        }
        equipos.add(e);

    }
    
    public void eliminaEquipo(Equipo e) throws LigaException {
        if (!equipos.contains(e)){
            throw new LigaException("No se encuentra a este equipo");
        }
        equipos.remove(e);
    }
    
    
    public void unirEquipos(Equipo e1, Equipo e2) throws LigaException {
        if (!equipos.contains(e1) || !equipos.contains(e2)){
            throw new LigaException("No hay equipo, en la lista");
        }
        e1.addJugadores(e2.getJugadores());
    }
    
    public List<Jugador> jugadoresEnComun(Equipo e1, Equipo e2) throws LigaException {
        if (!equipos.contains(e1) || !equipos.contains(e2)){
            throw new LigaException("No hay equipo, en la lista");
        }

        Set<Jugador> jugadors = new HashSet<>(e1.getJugadores());
        jugadors.retainAll(e2.getJugadores());
        return new ArrayList<>(jugadors);
    }
    
    public double mediaEdad() throws LigaException {
        return todosLosJugadores().stream().mapToInt(Jugador::calculaEdad).average().orElseThrow(() -> new LigaException("No hay jugadores")) ;
    }
    
    public List<Jugador> jugadoresOrdenadosEdad() {
        return todosLosJugadores().stream().sorted((a,b) -> b.getFechaNacimiento().compareTo(a.getFechaNacimiento())).toList();
    }
    
    public List<Jugador> jugadoresOrdenadosNombre() {
        return todosLosJugadores().stream().sorted((a,b) -> a.getNombre().compareTo(b.getNombre())).toList();
    }
    
    private Set<Jugador> todosLosJugadores() {
        Set<Jugador> todos = new HashSet<>();
        for (Equipo e : equipos){
            todos.addAll(e.getJugadores());
        }
        return todos;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bienvenidos a " + nombre).append(System.lineSeparator());
        sb.append("Equipos: ").append(System.lineSeparator());
        for (Equipo e: equipos) {
            sb.append(e).append(System.lineSeparator());
        }
        
        return sb.toString();
        
    }
}
