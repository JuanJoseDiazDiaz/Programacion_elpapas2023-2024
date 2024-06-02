package PokemonExamenHerencias.model;

import PokemonExamenHerencias.enums.WeatherCondition;
import PokemonExamenHerencias.exceptions.PokemonException;
import PokemonExamenHerencias.interfaces.Atacable;

public class Pokemon  implements Atacable {
    private static final int SALUD_MIN = 0;
    private static final int SALUD_MAX = 100;
    private static final int ATAQUE_MIN = 5;
    private static final int ATAQUE_MAX = 15;
    private static final int DEFENSA_MIN = 5;
    private static final int DEFENSA_MAX = 25;
    private String nombrePokemon;
    private int saludPokemon;
    private int ataquePokemon;
    private int defensaPokemon;

    public Pokemon(String nombrePokemon, int saludPokemon, int ataquePokemon, int defensaPokemon) throws PokemonException {
        this.nombrePokemon = nombrePokemon;
        setSaludPokemon(saludPokemon);
        setAtaquePokemon(ataquePokemon);
        setDefensaPokemon(defensaPokemon);
    }

    public String getNombre() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public int getPuntosSalud() {
        return saludPokemon;
    }

    // Aquí limitaremos la salud del dicho pokemon a los valores dados, puedes realizarlos con sus respectivas constantes o valores sueltos
    public void setSaludPokemon(int saludPokemon) throws PokemonException {
        if (saludPokemon < SALUD_MIN || saludPokemon > SALUD_MAX){
            throw new PokemonException("Error, valor introducido no valido");
        }
        this.saludPokemon = saludPokemon;
    }

    public int getAtaquePokemon() {
        return ataquePokemon;
    }

    public void setAtaquePokemon(int ataquePokemon) throws PokemonException {
        if (ataquePokemon < ATAQUE_MIN || ataquePokemon > ATAQUE_MAX){
            throw new PokemonException("Error, valor introducido no valido");
        }
        this.ataquePokemon = ataquePokemon;
    }

    public int getDefensaPokemon() {
        return defensaPokemon;
    }

    public void setDefensaPokemon(int defensaPokemon) throws PokemonException {
        if (defensaPokemon <  DEFENSA_MIN || defensaPokemon > DEFENSA_MAX){
            throw new PokemonException("Error, valor introducido no valido");
        }
        this.defensaPokemon = defensaPokemon;
    }

    public void roundStart(WeatherCondition weatherCondition) {
    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) {
    }

}
