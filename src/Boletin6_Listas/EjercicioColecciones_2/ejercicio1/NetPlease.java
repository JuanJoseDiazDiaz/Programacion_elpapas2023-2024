package Boletin6_Listas.EjercicioColecciones_2.ejercicio1;
import Boletin6_Listas.EjercicioColecciones_2.ejercicio1.NetPleaseException;
import Boletin6_Listas.EjercicioColecciones_2.ejercicio1.Pelicula;
import Boletin6_Listas.EjercicioColecciones_2.ejercicio1.PeliculasDeUnTema;

import java.util.HashMap;

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
		for ( PeliculasDeUnTema listaPelisTema : mapPeliculas.values()) {
			System.out.println(listaPelisTema);
		}
	}
	
	public void borrarPeliculaDeUnTema(String tema, String titulo) throws NetPleaseException{
		if (!mapPeliculas.containsKey(tema) ){
			throw new NetPleaseException("No se encuentra ninguna pelicula con ese titulo ni ese tema");
		}
		if (!mapPeliculas.get(tema).borrar(titulo)){
			throw new NetPleaseException("No existe esa pelicula");
		}
	}
	
	
	
	public String temaDePelicula(String titulo) throws NetPleaseException {
		/*
		if (!mapPeliculas.containsKey(titulo)){
			return null;
		}
		return mapPeliculas.get(titulo).getTema();
		*/
		// return mapPeliculas.keySet().stream().filter(p -> mapPeliculas.get(p).buscarPeliculaPorTitulo(titulo) != null).findFirst().orElse(null);
		 for (String tema : mapPeliculas.keySet()){
			if (mapPeliculas.get(tema).buscarPeliculaPorTitulo(titulo) != null){
				return tema;
			}

		}
		return titulo;
    }
	


	
	
}
