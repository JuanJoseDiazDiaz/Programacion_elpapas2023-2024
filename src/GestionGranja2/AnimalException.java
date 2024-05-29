package GestionGranja2;

public class AnimalException extends Throwable {
    public AnimalException(String s) {
    }

    public AnimalException(String message, Throwable cause) {
        super(message, cause);
    }
}
