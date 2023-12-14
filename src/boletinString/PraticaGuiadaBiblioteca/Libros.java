package boletinString.PraticaGuiadaBiblioteca;

public class Libros {
    private String nombre;
    private String autor;
    private String sinopsis;
    private int numEjemplares;

    private int ejemplaresDisponibles;

    public Libros(String nombre, String autor, String sinopsis, int numEjemplares, int ejemplaresDisponibles) {
        this.nombre = nombre;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.numEjemplares = numEjemplares;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

}
