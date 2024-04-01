package boletinRepasoExamen.Avion.EjerciciosRepaso.ExamenColecciones.ejercicio1;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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
	
	public void addPelicula (Pelicula pelicula)  throws NetPleaseException{
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
		if (borrado == true){
			throw new NetPleaseException("ya esta borrada");
		}
	}
	
	public void annadirOpinionAPelicula(String tituloPelicula, Opinion opinion) throws NetPleaseException {
		if (!listaPeliculasDeUnTema.contains(tituloPelicula)){
			throw new NetPleaseException("esta pelicula no se encuentra dentro de nuestra base de datos");
		}
		listaPeliculasDeUnTema.stream().filter(pelicula -> {
			if (listaPeliculasDeUnTema.contains(tituloPelicula)){
				opinion.toString();
			}
            return false;
        }).toList();
	}
	
	public List<Pelicula> listadoDePeliculasOrdenadasPorMediaDeOpiniones() {
		return listaPeliculasDeUnTema.stream().sorted(Comparator.comparing(Pelicula::mediaDeOpiniones)).collect(toList());
	}
	
	
	public List<Pelicula> listaPeliculasDondeIntervieneUnActor(String actor) {
		List<Pelicula> peliculasConActor = new ArrayList<>();
		for (Pelicula pelicula : listaPeliculasDeUnTema){
			if (pelicula.getActor().contains(actor)){
				peliculasConActor.add(pelicula);
			}
		}
		return peliculasConActor;
	}

	public Pelicula buscarPeliculaPorTitulo(String titulo) {
		for (Pelicula pelicula : listaPeliculasDeUnTema) {
			if (pelicula.getTitulo().equals(titulo)) {
				return pelicula;
			}
		}
		return null; // Devolver null si no se encuentra ninguna película con el título dado
	}
	
	public boolean borrarPeliculaDeTema(String titulo) {
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
