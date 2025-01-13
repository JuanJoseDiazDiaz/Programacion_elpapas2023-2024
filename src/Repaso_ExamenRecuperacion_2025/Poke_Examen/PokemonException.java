package Repaso_ExamenRecuperacion_2025.Poke_Examen;

public class PokemonException extends Exception {
    public PokemonException(String message) {
        super(message);
    }

    public PokemonException(String message, Throwable cause) {
        super(message, cause);
    }
}
