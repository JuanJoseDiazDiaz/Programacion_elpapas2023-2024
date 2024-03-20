package Boletin6_Listas.EjercicioColecciones_2.Examen_Colecciones;

public class LigaException extends Exception {
    public LigaException() {
    }

    public LigaException(String message) {
        super(message);
    }

    public LigaException(String message, Throwable cause) {
        super(message, cause);
    }

    public LigaException(Throwable cause) {
        super(cause);
    }

    public LigaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
