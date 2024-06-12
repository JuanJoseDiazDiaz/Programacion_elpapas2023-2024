package ExamenRecuperacionHerencias;

public class ProblemaSensor extends Exception {
    public ProblemaSensor(String s) {
    }

    public ProblemaSensor(String message, Throwable cause) {
        super(message, cause);
    }

    public ProblemaSensor(Throwable cause) {
        super(cause);
    }
}
