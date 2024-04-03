package Boletin6_Listas.EjercicioColecciones_2.ejercicio1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Pelicula {
	private String titulo;



	private String actor;
	private int annoEstreno;
	private ArrayList<Opinion> opiniones;
	private HashSet<String> actores;

	public Pelicula(String titulo, int annoEstreno) {
		super();
		this.titulo = titulo;
		this.annoEstreno = annoEstreno;
		actores= new HashSet<String>();
		opiniones = new ArrayList<Opinion>();
	}

	public void annadirOpinion(Opinion opinion) {
		opiniones.add(opinion);
	}

	public void annadirActor(String actor) {
		actores.add(actor);
	}
	
	

	public double mediaDeOpiniones() {
		List<Integer> o = new ArrayList<>();
		// ESTO EN RESUMEN LO QUE HAREMOS ES SUMAR TODOS LOS DATOS, PERO LOS GUARDAMOS DENTRO DE UNA VARIABLE
		Integer sumaOpiniones = o.stream().mapToInt(d -> d.intValue()).sum();
		return (double) sumaOpiniones / o.size(); //AQUI DIVIDO EL PROCESO PARA REALIZAR LA MEDIA
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnnoEstreno() {
		return annoEstreno;
	}
	public String getActor() {
		return actor;
	}

	public void setAnnoEstreno(int annoEstreno) {
		this.annoEstreno = annoEstreno;
	}
	public boolean intervieneActor(String actor) {
		return actores.contains(actor);
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", annoEstreno=" + annoEstreno + "]" + " Media de opiniones " + mediaDeOpiniones();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Pelicula other = (Pelicula) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
