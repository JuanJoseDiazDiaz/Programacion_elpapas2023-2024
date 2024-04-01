package Boletin6_Listas.EjercicioColecciones_2.ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PeliculasDeUnTema {

    private String tema;
    private LinkedList<Pelicula> listaPeliculasDeUnTema;

    public PeliculasDeUnTema(String tema) {
        this.tema=tema;
        listaPeliculasDeUnTema=new LinkedList<Pelicula>();
    }

    public String getTema() {
        return getTema();
    }

    public void addPelicula (Pelicula pelicula)  throws NetPleaseException {
        if (listaPeliculasDeUnTema.contains(pelicula)){
            throw new NetPleaseException("La pelicula esta en la lista");
        }
        if (pelicula.getAnnoEstreno() >= LocalDate.now().getYear()){
            throw new NetPleaseException("esta pelicula no esta registrada por ese año");
        }
        listaPeliculasDeUnTema.add(pelicula);
    }

    public void borrarLasPeliculasDeUnAnno(int anno) throws NetPleaseException {
        Iterator<Pelicula> it = listaPeliculasDeUnTema.iterator();
        boolean borrado = false;
        while (it.hasNext()){
            Pelicula p = it.next();
            if (anno == p.getAnnoEstreno()){
                it.remove();
                borrado = false;
            }
        }
    }

    public void annadirOpinionAPelicula(String tituloPelicula, Opinion opinion) throws NetPleaseException {



    }

    public List<Pelicula> listadoDePeliculasOrdenadasPorMediaDeOpiniones() {
        return null;

    }


    public List<Pelicula> listaPeliculasDondeIntervieneUnActor(String actor) {

        return null;
    }

    public Pelicula buscarPeliculaPorTitulo(String titulo) {

        return null;
    }

    public boolean borrar(String titulo) {
        return false;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tema == null) ? 0 : tema.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PeliculasDeUnTema other = (PeliculasDeUnTema) obj;
        if (tema == null) {
            if (other.tema != null)
                return false;
        } else if (!tema.equals(other.tema))
            return false;
        return true;
    }

    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Tema " + tema + "\n");
        for (Pelicula pelicula: listaPeliculasDeUnTema) {
            sb.append(pelicula +"\n");
        }
        return sb.toString();
    }
}
