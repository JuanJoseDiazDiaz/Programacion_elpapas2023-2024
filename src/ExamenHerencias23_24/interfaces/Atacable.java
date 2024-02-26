package ExamenHerencias23_24.interfaces;

import ExamenHerencias23_24.enums.WeatherCondition;
import ExamenHerencias23_24.exception.MuerteException;

public interface Atacable {
    public void recibirAtaque(WeatherCondition tiempo, int puntosAtaque, Atacador atacador) throws MuerteException;
}
