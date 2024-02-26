package ExamenHerencias23_24.interfaces;

import ExamenHerencias23_24.enums.WeatherCondition;
import ExamenHerencias23_24.exception.MuerteException;

public interface Atacador {
    public void atacar(Atacable objetivo, WeatherCondition tiempo) throws MuerteException;
}
