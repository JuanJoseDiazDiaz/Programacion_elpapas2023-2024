package PokemonExamenHerencias.interfaces;

import PokemonExamenHerencias.enums.WeatherCondition;

public interface Atacable {

    void atacar(Atacable atacable, WeatherCondition weatherCondition);
}
