package model;

import enums.WeatherCondition;
import exceptions.MuerteException;
import exceptions.RoundStartException;
import exceptions.ValorNoValidoException;
import interfaces.Atacable;
import interfaces.Atacador;

public class PokemonFuego extends PokemonAtacable {
    /**
     * Resistencia al agua del pokemon. Entre 5 y 15
     */
    private int resistenciaAlAgua;
    private double bonificacionSol;

    public PokemonFuego(String nombre, int puntosSalud, int ataque, int defensa, int resistenciaAlAgua) throws ValorNoValidoException {
        super(nombre, puntosSalud, ataque, defensa);
        setResistenciaAlAgua(resistenciaAlAgua);
        this.bonificacionSol = 1d;
    }

    public double getResistenciaAlAgua() {
        return resistenciaAlAgua;
    }

    public void setResistenciaAlAgua(int resistenciaAlAgua) throws ValorNoValidoException {
        if (resistenciaAlAgua < 5 || resistenciaAlAgua > 15) {
            throw new ValorNoValidoException("La resistencia al agua debe estar entre 5 y 15");
        }
        this.resistenciaAlAgua = resistenciaAlAgua;
    }

    public double getBonificacionSol() {
        return bonificacionSol;
    }

    @Override
    public void recibirAtaque(Atacador atacador, WeatherCondition weatherCondition, int puntosAtaque) throws MuerteException {
        if (atacador instanceof PokemonAgua) {
            puntosAtaque -= resistenciaAlAgua;
        }
        super.recibirAtaque(atacador, weatherCondition, puntosAtaque);
    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException {
        atacable.recibirAtaque(this, weatherCondition, (int) (getAtaque() * bonificacionSol));
    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {
        if (!estaVivo()){
            return;
        }
        if (weatherCondition == WeatherCondition.SOL) {
            this.bonificacionSol += Math.random();
            throw new RoundStartException("En esta ronda, " + getNombre() + " aumenta su ataque por el sol");
        }
        else {
            this.bonificacionSol = 1d;
        }
    }
}
