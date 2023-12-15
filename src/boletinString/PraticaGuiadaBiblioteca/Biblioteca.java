package boletinString.PraticaGuiadaBiblioteca;

public class Biblioteca {
    private static final int NUM_MAX_USUARIOS = 2;
    private static final int NUM_MAX_LIBROS = 2;
    private String nombre;

    private Libros[] libros;
    private Usuario[] usuarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libros[NUM_MAX_LIBROS];
        this.usuarios = new Usuario[NUM_MAX_USUARIOS];
    }

    public void addUsuario(String nombre, String apellidos, String dni) throws BibliotecaExpection {
        Usuario u = new Usuario(nombre, apellidos, dni);
        if (existeUsuario(u)){
            throw new BibliotecaExpection("ya existe un usuario");
        }
    }
    public boolean existeUsuario(Usuario u){
        boolean encontrado = false;
        for (int i = 0 ; i < usuarios.length && !encontrado ; i++){
            if (u.equals(usuarios[i])){
                encontrado = true;
            }
        }
        return encontrado;
    }
    public void addLibro(String nombre, String autor, String sinopsis,  int numEjemplares, int ejemplaresDisponibles) throws BibliotecaExpection {
        Libros l = new Libros(nombre, autor, sinopsis,numEjemplares, ejemplaresDisponibles);
        if (comprabacionLibro(l, autor,nombre)){
            throw new BibliotecaExpection("este libro, esta repetido");
        }
    }
    public boolean comprabacionLibro(Libros l, String autor, String nombre){
        boolean libroEncontrado = false;
        for (int i = 0 ; i < libros.length && !libroEncontrado; i++){
            if (l.equals(libros[i]) && autor.equals(autor) && nombre.equals(nombre)){
            }
        }
        return libroEncontrado;
    }




}
