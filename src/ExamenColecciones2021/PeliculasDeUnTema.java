package ExamenColecciones2021;

import java.util.LinkedList;
import java.util.List;

public class PeliculasDeUnTema {

    private String tema;
    private LinkedList<Pelicula> listaPeliculasDeUnTema;



    public PeliculasDeUnTema(String tema ) throws NetPleaseException {
        this.tema = tema;
        this.listaPeliculasDeUnTema = new LinkedList<>();
    }

    public String getTema() {
        return getTema();
    }

    public void addPelicula(Pelicula pelicula) throws NetPleaseException {
        if (pelicula.getTitulo().equals(pelicula.getTitulo()) || pelicula.getAnnoEstreno() <= 2024) {
            throw new NetPleaseException("Error, valor no valido");
        }
        listaPeliculasDeUnTema.add(pelicula);
    }

    public void borrarLasPeliculasDeUnAnno(int anno) throws NetPleaseException {
        if (!listaPeliculasDeUnTema.contains(anno)) {
            throw new NetPleaseException("Error, no hay una pelicula con ese año de estreno");
        }
        listaPeliculasDeUnTema.remove(anno);
    }

    public void annadirOpinionAPelicula(String tituloPelicula, Opinion opinion) throws NetPleaseException {
        if (!listaPeliculasDeUnTema.contains(tituloPelicula)) {
            throw new NetPleaseException("No se encuentra esa pelicula");
        }
        listaPeliculasDeUnTema.add(opinion);

    }

    public List<Pelicula> listadoDePeliculasOrdenadasPorMediaDeOpiniones() {
        return (List<Pelicula>) listaPeliculasDeUnTema.stream().sorted((pelicula1, pelicula2) -> (int) (pelicula1.mediaDeOpiniones() - pelicula2.mediaDeOpiniones())).toList();
    }


    public List<Pelicula> listaPeliculasDondeIntervieneUnActor(String actor) {
        return listaPeliculasDeUnTema.stream().filter(pelicula -> pelicula.getActores().contains(actor)).toList();
    }

    public List<Pelicula> buscarPeliculaPorTitulo(String titulo) {
        return listaPeliculasDeUnTema.stream().filter(pelicula -> pelicula.getTitulo().equals(titulo)).toList();
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
        StringBuilder sb = new StringBuilder();
        sb.append("Tema " + tema + "\n");
        for (Pelicula pelicula : listaPeliculasDeUnTema) {
            sb.append(pelicula + "\n");
        }
        return sb.toString();
    }


}
