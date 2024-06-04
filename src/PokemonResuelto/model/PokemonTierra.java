package model;

import enums.WeatherCondition;
import exceptions.MuerteException;
import exceptions.RoundStartException;
import exceptions.ValorNoValidoException;
import interfaces.Atacable;
import interfaces.Atacador;

public class PokemonTierra extends PokemonAtacable {
    /**
     * Resistencia eléctrica del pokemon. Entre 1 y 8
     */
    private int resistenciaElectrica;
    private double bonificacionTormentaDeArena;

    public PokemonTierra(String nombre, int puntosSalud, int ataque, int defensa, int resistenciaElectrica) throws ValorNoValidoException {
        super(nombre, puntosSalud, ataque, defensa);
        this.resistenciaElectrica = resistenciaElectrica;
        this.bonificacionTormentaDeArena = 1d;
    }

    public double getResistenciaElectrica() {
        return resistenciaElectrica;
    }

    public double getBonificacionTormentaDeArena() {
        return bonificacionTormentaDeArena;
    }

    @Override
    public void recibirAtaque(Atacador atacador, WeatherCondition weatherCondition, int puntosAtaque) throws MuerteException {
        if (atacador instanceof PokemonElectrico) {
            puntosAtaque -= resistenciaElectrica;
        }
        super.recibirAtaque(atacador, weatherCondition, puntosAtaque);
    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException {
        atacable.recibirAtaque(this, weatherCondition, (int) (getAtaque() * bonificacionTormentaDeArena));
    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {
        if (!estaVivo()){
            return;
        }
        if (weatherCondition == WeatherCondition.TORMENTA_DE_ARENA) {
            this.bonificacionTormentaDeArena += Math.random();
            throw new RoundStartException("En esta ronda, " + getNombre() + " aumenta su ataque por la tormenta de arena");
        }
        else {
            this.bonificacionTormentaDeArena = 1d;
        }
    }
}
