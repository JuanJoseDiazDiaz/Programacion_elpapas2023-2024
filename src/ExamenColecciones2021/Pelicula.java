package ExamenColecciones2021;

import java.util.ArrayList;
import java.util.HashSet;

public class Pelicula {
    private double cont = 0;
    private String titulo;
    private int annoEstreno;
    private ArrayList<Opinion> opiniones;
    private HashSet<String> actores;

    public Pelicula(String titulo, int annoEstreno) throws NetPleaseException {
        super();
        this.titulo = titulo;
        this.annoEstreno = annoEstreno;
        actores = new HashSet<String>();
        opiniones = new ArrayList<Opinion>();
    }

    public void annadirOpinion(Opinion opinion) {
        opiniones.add(opinion);
        cont++;
    }

    public void annadirActor(String actor) {
        actores.add(actor);
    }


    public double mediaDeOpiniones() {
        return opiniones.size() + opiniones.size() / cont;
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

    public void setAnnoEstreno(int annoEstreno) throws NetPleaseException {
        if (annoEstreno < 0 || annoEstreno > 2024) {
            throw new NetPleaseException("Error, valor no valido");
        }
        this.annoEstreno = annoEstreno;
    }

    public HashSet<String> getActores() {
        return actores;
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
