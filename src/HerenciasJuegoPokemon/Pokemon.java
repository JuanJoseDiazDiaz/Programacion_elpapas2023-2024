package HerenciasJuegoPokemon;

public abstract class Pokemon {
    private String nombre;
    private final int SALUD;
    private final int ATAQUE;
    private final int DEFENSA;

    public Pokemon(String nombre, int salud, int ataque, int defensa) {
        this.nombre = nombre;
        this.SALUD = salud;
        this.ATAQUE = ataque;
        this.DEFENSA = defensa;
    }
}
