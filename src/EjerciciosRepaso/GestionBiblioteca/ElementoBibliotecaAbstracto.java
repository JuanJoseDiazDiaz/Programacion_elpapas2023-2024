package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionBiblioteca;

public class  ElementoBibliotecaAbstracto implements ElementoBiblioteca{
    private String titulo;
    private String autor;
    private boolean prestado;
    public ElementoBibliotecaAbstracto(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean prestar() {
        prestado = true;
        return false;
    }

    @Override
    public boolean devuelto() {
        return false;
    }

    public boolean isPrestado() {
        return prestado;
    }
}
