package ExamenHerencias23_24.model;

import ExamenHerencias23_24.enums.WeatherCondition;
import ExamenHerencias23_24.exception.RoundStartException;
import ExamenHerencias23_24.exception.ValorNoValidoException;

public class PokemonElectrico extends Pokemon {
    public static final int MIN_DANIO_LLUVIA = 10;
    public static final int MAX_DANIO_LLUVIA = 15;
    private double bonficacionTormenta;
    private int danioLLuvia;

    public PokemonElectrico(String nombre, int puntosSalud, int puntosAtaque, int defensa, int reduccionDanio) throws ValorNoValidoException {
        super(nombre, puntosSalud, puntosAtaque, defensa);
    }

    public void setBonficacionTormenta(int danioLLuvia) throws ValorNoValidoException {
        if (danioLLuvia < MIN_DANIO_LLUVIA ||  danioLLuvia > MAX_DANIO_LLUVIA){
            throw new ValorNoValidoException("El valor no es el adecuado");
        }
        this.bonficacionTormenta = bonficacionTormenta;
    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {
        if (!estaVivo()){
            return;
        }
        bonficacionTormenta =1d;
        if (weatherCondition == WeatherCondition.TORMENTA_ELECTRICA){

        }

    }

    @Override
    public boolean estaVivo() {
        return false;
    }
}
