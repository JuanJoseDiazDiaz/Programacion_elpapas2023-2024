package PokemonExamenHerencias.exceptions;

public class PokemonException extends Exception {
    public PokemonException(String s) {
    }

    public PokemonException(String message, Throwable cause) {
        super(message, cause);
    }
}
