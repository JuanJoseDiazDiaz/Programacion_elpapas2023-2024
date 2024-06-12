package ExamenRecuperacionColecciones.exceptions;

public class CursoException extends Exception {
    public CursoException(String message) {
        super(message);
    }

    public CursoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CursoException(Throwable cause) {
        super(cause);
    }
}
