package EjerciciosRepasoColecciones;

public class LibroException extends Exception {
    public LibroException(String message) {
        super(message);
    }

    public LibroException(String message, Throwable cause) {
        super(message, cause);
    }

    public LibroException(Throwable cause) {
        super(cause);
    }
}
