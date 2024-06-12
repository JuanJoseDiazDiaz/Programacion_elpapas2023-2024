package interfaces;

import enums.WeatherCondition;
import exceptions.MuerteException;

public interface Atacable {
    public void recibirAtaque(Atacador atacador, WeatherCondition weatherCondition, int puntosAtaque) throws MuerteException;
}
