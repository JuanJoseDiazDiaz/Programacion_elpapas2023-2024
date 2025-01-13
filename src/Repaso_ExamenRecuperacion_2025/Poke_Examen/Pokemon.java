package Repaso_ExamenRecuperacion_2025.Poke_Examen;

public class Pokemon {
    private String nombre;
    private int punt_Salud;
    private int nivel_Ataque;
    private int nivel_Defensa;

    public Pokemon(String nombre, int punt_Salud, int nivel_Ataque, int nivel_Defensa) throws PokemonException {
        this.nombre = nombre;
        setPunt_Salud(punt_Salud);
        setNivel_Ataque(nivel_Ataque);
        setNivel_Defensa(nivel_Defensa);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPunt_Salud() {
        return punt_Salud;
    }

    public void setPunt_Salud(int punt_Salud) throws PokemonException {
        if (punt_Salud < 0 || punt_Salud > 100) {
            throw new PokemonException("Error,La puntuacion debe estar entre 0 a 100");
        }
        this.punt_Salud = punt_Salud;
    }

    public int getNivel_Ataque() {
        return nivel_Ataque;
    }

    public void setNivel_Ataque(int nivel_Ataque) throws PokemonException {
        if (nivel_Ataque < 5 || nivel_Ataque > 15) {
            throw new PokemonException("Error, La nivel de ataque debe estar entre 5 a 15");
        }
        this.nivel_Ataque = nivel_Ataque;
    }

    public int getNivel_Defensa() {
        return nivel_Defensa;
    }

    public void setNivel_Defensa(int nivel_Defensa) throws PokemonException {
        if (nivel_Defensa < 5 || nivel_Defensa > 25) {
            throw new PokemonException("Error, La nivel de defensa debe estar entre 5 a 25");
        }
        this.nivel_Defensa = nivel_Defensa;
    }
}
