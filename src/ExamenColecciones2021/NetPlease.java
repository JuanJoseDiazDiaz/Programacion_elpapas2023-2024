package ExamenColecciones2021;

import java.util.HashMap;
import java.util.SortedMap;

public class NetPlease {

    //Hashmap donde por cada tema, podemos acceder a las películas de ese tema
    private HashMap<String, PeliculasDeUnTema> mapPeliculas;


    public NetPlease() {
        mapPeliculas = new HashMap<String, PeliculasDeUnTema>();

    }

    public void annadirTema(String tema, String titulo, int annioEstreno) throws NetPleaseException {
        tema = tema.toUpperCase();
        if (mapPeliculas.containsKey(tema)) {
            throw new NetPleaseException("Ya existe ese tema");
        }
        mapPeliculas.put(tema, new PeliculasDeUnTema(tema));
        System.out.println("Se ha añadido un tema");
    }


    public void addPelicula(String tema, Pelicula pelicula) throws NetPleaseException {
        PeliculasDeUnTema listaPeliculasDeUnTema = mapPeliculas.get(tema);
        if (listaPeliculasDeUnTema == null) {
            throw new NetPleaseException("No existe el tema " + tema);
        }
        listaPeliculasDeUnTema.addPelicula(pelicula);
        System.out.println("Se ha añadido una pelicula");
    }

    public void listadoDeTodasPeliculasDeTodosLosTemas() {
        System.out.println("Listado de peliculas por tema: ");
        for (PeliculasDeUnTema listaPelisTema : mapPeliculas.values()) {
            System.out.println(listaPelisTema);
        }
    }

    public void borrarPeliculaDeUnTema(String tema, String titulo) throws NetPleaseException {
        if (!mapPeliculas.containsKey(titulo) || !mapPeliculas.containsKey(tema)) {
            throw new NetPleaseException("No existe ninguna pelicula ni con ese tema ni con ese titulo");
        }
        mapPeliculas.entrySet().remove(mapPeliculas.get(titulo).getTema());
        System.out.println("se ha borrado la pelicula por ese tema");
    }


    public String temaDePelicula(String titulo) throws NetPleaseException {
        return mapPeliculas.entrySet().stream().filter(pelicula -> {
            if (pelicula.getValue().equals(titulo)) {
                System.out.println(pelicula.getValue().getTema());
            } else {
                try {
                    throw new NetPleaseException("No existe ese tema");
                } catch (NetPleaseException e) {
                    System.out.println(e.getMessage());
                }
            }
            return false;
        }).toList().toString();
    }


}
