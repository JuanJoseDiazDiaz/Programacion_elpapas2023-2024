package boletinRepasoExamen.Avion.ExamenColecciones2023;

import java.util.ArrayList;
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
       if (!equipos.contains(e.getJugadores())){
           throw new LigaException("Error, el equipo no tiene jugador");
       }
       if (equipos.contains(e)){
           throw new LigaException("Error, el equipo pertenece ya a una liga");
       }
       equipos.add(e);
    }
    
    public void eliminaEquipo(Equipo e) throws LigaException {
        if (!equipos.contains(e)){
            throw new LigaException("No se encuentra este equipo");
        }
        equipos.remove(e);
    }
    
    
    public void unirEquipos(Equipo e1, Equipo e2) throws LigaException {
        if (!equipos.contains(e1) && !equipos.contains(e2)){
            throw new LigaException("No se encuentra esos equipos");
        }
       e1.getJugadores().addAll(e2.getJugadores());
    }
    
    public List<Jugador> jugadoresEnComun(Equipo e1, Equipo e2) throws LigaException {
        int contadorJugadorRepetidos = 0;
        if (!equipos.contains(e1) && !equipos.contains(e2)){
            throw new LigaException("Estos equipos no estan en la misma liga");
        }
        for (int i = 0; i < equipos.size(); i++){
            if (e1.getJugadores() == e2.getJugadores()){
                contadorJugadorRepetidos++;
            }
        }
        return contadorJugadorRepetidos;
    }
    
    public double mediaEdad() throws LigaException {
        
    }
    
    public List<Jugador> jugadoresOrdenadosEdad() {
        
    }
    
    public List<Jugador> jugadoresOrdenadosNombre() {
        
    }
    
    private Set<Jugador> todosLosJugadores() {
        
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
