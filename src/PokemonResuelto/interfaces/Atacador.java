package interfaces;

import enums.WeatherCondition;
import exceptions.MuerteException;

public interface Atacador {
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException;
}
