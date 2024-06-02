package PokemonExamenHerencias.model;

import PokemonExamenHerencias.enums.WeatherCondition;
import PokemonExamenHerencias.exceptions.PokemonException;

public class PokemonAgua extends Pokemon {
    private int valorHidratacion;
    private static final int VALOR_MIN_SUBIDA_ATAQUE = 1;
    private static final int VALOR_MAX_SUBIDA_ATAQUE = 2;


    public PokemonAgua(String nombrePokemon, int saludPokemon, int ataquePokemon, int defensaPokemon, int valorHidratacion) throws PokemonException {
        super(nombrePokemon, saludPokemon, ataquePokemon, defensaPokemon);
        setHidratacion(valorHidratacion);
    }

    public void setHidratacion(int valorHidratacion) throws PokemonException {
        if (!WeatherCondition.LLUVIOSO.equals(WeatherCondition.LLUVIOSO)) {
            throw new PokemonException("No esta lloviendo, no se beneficia");
        }
       this.valorHidratacion = valorHidratacion;
    }

    public void setPrecisionDeLLuvia(WeatherCondition weatherCondition) throws PokemonException {
        if (!WeatherCondition.LLUVIOSO.equals(WeatherCondition.LLUVIOSO)) {
            if (getAtaquePokemon() < Math.random() * (VALOR_MIN_SUBIDA_ATAQUE - VALOR_MAX_SUBIDA_ATAQUE) + VALOR_MIN_SUBIDA_ATAQUE) {
                int subidaAtaque = (int) ((int) getAtaquePokemon() * Math.random() * (VALOR_MIN_SUBIDA_ATAQUE - VALOR_MAX_SUBIDA_ATAQUE) + VALOR_MIN_SUBIDA_ATAQUE);
                System.out.println("Con la subida del ataque se queda este resultado: "+ subidaAtaque);
            }
            throw new PokemonException("No esta lloviendo, no se beneficia");
        }
    }
}
