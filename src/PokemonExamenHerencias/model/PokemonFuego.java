package PokemonExamenHerencias.model;

import PokemonExamenHerencias.enums.WeatherCondition;
import PokemonExamenHerencias.exceptions.PokemonException;
import PokemonExamenHerencias.interfaces.Atacable;

public class PokemonFuego extends Pokemon {
    private static final int VALOR_MIN_RESISTENCIA_AGUA = 5;
    private static final int VALOR_MAX_RESISTENCIA_AGUA = 10;
    private int bonificacionSol = 0;
    private int resistenciaAgua;

    public PokemonFuego(String nombrePokemon, int saludPokemon, int ataquePokemon, int defensaPokemon, int resistenciaAgua) throws PokemonException {
        super(nombrePokemon, saludPokemon, ataquePokemon, defensaPokemon);
        setResistenciaAgua(resistenciaAgua);
    }

    public int setBonificacionSol() throws PokemonException {
        if (!WeatherCondition.SOLEADO.equals(WeatherCondition.SOLEADO)){
            throw new PokemonException("No ha salido el sol aun");
        }
       return bonificacionSol++;
    }

    public void setResistenciaAgua(int resistenciaAgua) throws PokemonException {
        // TODO -> PREGUNTAR A BERMUDO SI PUEDO HACERLO CON UN INSTANCE OF
        if (){
            if (resistenciaAgua < VALOR_MIN_RESISTENCIA_AGUA || resistenciaAgua > VALOR_MAX_RESISTENCIA_AGUA ){
                throw new PokemonException("Error, valor no valido");
            }
            this.resistenciaAgua = resistenciaAgua;
        }

    }
}
