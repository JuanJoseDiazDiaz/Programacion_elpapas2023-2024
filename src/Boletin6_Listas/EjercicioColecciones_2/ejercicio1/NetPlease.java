package boletinRepasoExamen.Avion.EjerciciosRepaso.ExamenColecciones.ejercicio1;
import java.util.HashMap;
import java.util.concurrent.TimeoutException;

public class NetPlease {

	//Hashmap donde por cada tema, podemos acceder a las películas de ese tema
	private HashMap<String, PeliculasDeUnTema> mapPeliculas;
	
	
	public NetPlease() {
		mapPeliculas=new HashMap<String, PeliculasDeUnTema>();
		
	}
	
	public void annadirTema( String tema) throws NetPleaseException {
	
		tema= tema.toUpperCase();
		if (mapPeliculas.containsKey(tema)) {
			throw new NetPleaseException("Ya existe ese tema");
		}
		
		mapPeliculas.put(tema, new PeliculasDeUnTema(tema));
		System.out.println("Se ha añadido este tema a esa pelicula: "+tema);
	}
	

	
	public void addPelicula(String tema, Pelicula pelicula) throws NetPleaseException {
		PeliculasDeUnTema listaPeliculasDeUnTema = mapPeliculas.get(tema);
		
		if (listaPeliculasDeUnTema == null) {
			throw new NetPleaseException("No existe el tema " + tema);
		}
		listaPeliculasDeUnTema.addPelicula(pelicula);
		System.out.println("Se ha añadadio esta pelicula: " + pelicula);
	}
	
	public void listadoDeTodasPeliculasDeTodosLosTemas() {
		for ( PeliculasDeUnTema listaPelisTema: mapPeliculas.values()) {
			System.out.println(listaPelisTema);
		}
	}
	
	public void borrarPeliculaDeUnTema(String tema, String titulo) throws NetPleaseException{
		if (!mapPeliculas.containsKey(tema) || !mapPeliculas.containsKey(titulo)){
			throw new NetPleaseException("No se encuentra ninguna pelicula con ese titulo ni ese tema");
		}
		mapPeliculas.remove(tema,titulo);
	}
	
	
	
	public String temaDePelicula( String titulo) throws NetPleaseException {
		if (!mapPeliculas.containsKey(titulo)){
			throw new NetPleaseException("No tiene esa pelicula dentro de nuestra base de datos");
		}
		if (mapPeliculas.containsKey(titulo)){
			mapPeliculas.get(titulo);
		}else{
			return null;
		}

        return titulo;
    }
	


	
	
}
