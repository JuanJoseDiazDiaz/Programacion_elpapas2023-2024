package Boletin6_Listas.EjercicioColecciones_2.Examen22Cromos;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Mazo {
    private Map<Cromo, Integer> mazoCartas;

    public Mazo() {
        this.mazoCartas = new HashMap<>();
    }


    public void addCromo(Cromo c, int numCromo) {
        Integer numPrevioCromo = mazoCartas.get(c);
        if (numPrevioCromo == null){
            mazoCartas.put(c, numCromo);
       }else {
           mazoCartas.replace(c, numCromo + numPrevioCromo);
       }
    }
    public void addCromos(Cromo c) {
        addCromo(c, 1);
    }
    public void intercambiarCromo(Cromo mio, Cromo cromoTuyo) throws MazoException{
        Integer numPrevioCromo = mazoCartas.get(mio);
        if (!mazoCartas.containsKey(mio)){
            throw new MazoException("No tengo ese cromo");
        }
        if (numPrevioCromo > 1){
            mazoCartas.replace(mio, numPrevioCromo - 1);
        }else{
            mazoCartas.remove(mio);
        }
        addCromos(cromoTuyo);
    }
    public void mezclar(Mazo mazoNuevo){
        for (Map.Entry<Cromo, Integer> entry : mazoNuevo.mazoCartas.entrySet()){
            this.addCromo(entry.getKey(), entry.getValue());
        }
    }
    public int contardiferente(){
        return mazoCartas.size();
    }

    public List<Cromo> cromosDeUnEquipo(String nombreEquipo){
       return mazoCartas.keySet().stream().filter(cromo -> cromo.getEquio().equals(nombreEquipo)).toList();
    }

   /* public List<Cromo> cromosDeUnEquipo2 (String nombreEquipo){
       return mazoCartas.keySet().stream().filter(cromo -> {
           if (cromo instanceof CromoEscudo){
               return ((CromoEscudo)cromo).getNombreEquipo().equals(nombreEquipo);
           } else if (cromo instanceof CromoJugador) {
               return ((CromoJugador)cromo).getEquipoJugado().equals(nombreEquipo);
           }
           return false;
       }).toList();
    }
    */

    public double alturaMedia(String equipo) throws MazoException {
       return cromosDeUnEquipo(equipo).stream().filter(cromo -> cromo instanceof CromoJugador)
                .mapToInt(c -> ((CromoJugador)c).getAlturaJugador())
                .average().orElseThrow(()-> new MazoException("No hay jugadores de ese equipo")) ;
    }

}
