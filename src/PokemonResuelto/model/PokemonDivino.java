package model;

import enums.WeatherCondition;
import exceptions.MuerteException;
import exceptions.RoundStartException;
import interfaces.Atacable;

public class PokemonDivino extends Pokemon {
    public PokemonDivino(String nombre, int puntosSalud, int ataque, int defensa) {
        super(nombre, puntosSalud, ataque, defensa);
    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {
        throw new RoundStartException("El pokemon divino " + getNombre() + " te ha bendecido con su presencia. No puede ser atacado.");
    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException {

    }
}
