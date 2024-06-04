package FicherosExamen2021;

public class FicheroException extends Exception {
    public FicheroException(String s) {
    }

    public FicheroException(String message, Throwable cause) {
        super(message, cause);
    }

    public FicheroException(Throwable cause) {
        super(cause);
    }
}
