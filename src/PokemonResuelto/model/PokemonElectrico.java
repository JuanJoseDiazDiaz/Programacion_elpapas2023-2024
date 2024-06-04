package model;

import enums.WeatherCondition;
import exceptions.MuerteException;
import exceptions.RoundStartException;
import exceptions.ValorNoValidoException;
import interfaces.Atacable;
import interfaces.Atacador;

public class PokemonElectrico extends PokemonAtacable {
    /**
     * Reducción de daño por lluvia. Entre 10 y 15
     */
    private int reduccionDanioLluvia;
    private double bonificacionTormentaElectrica;

    public PokemonElectrico(String nombre, int puntosSalud, int ataque, int defensa, int reduccionDanioLluvia) throws ValorNoValidoException {
        super(nombre, puntosSalud, ataque, defensa);
        this.reduccionDanioLluvia = reduccionDanioLluvia;
        this.bonificacionTormentaElectrica = 1d;
    }

    public double getReduccionDanioLluvia() {
        return reduccionDanioLluvia;
    }

    public double getBonificacionTormentaElectrica() {
        return bonificacionTormentaElectrica;
    }

    @Override
    public void recibirAtaque(Atacador atacador, WeatherCondition weatherCondition, int puntosAtaque) throws MuerteException {
        if (weatherCondition == WeatherCondition.LLUVIA) {
            puntosAtaque -= puntosAtaque * reduccionDanioLluvia / 100;
        }
        super.recibirAtaque(atacador, weatherCondition, puntosAtaque);
    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException {
        atacable.recibirAtaque(this, weatherCondition, (int) (getAtaque() * bonificacionTormentaElectrica));
    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {
        if (!estaVivo()){
            return;
        }
        if (weatherCondition == WeatherCondition.TORMENTA_ELECTRICA) {
            this.bonificacionTormentaElectrica += Math.random();
            throw new RoundStartException("En esta ronda, " + getNombre() + " aumenta su ataque por el sol");
        } else if (weatherCondition == WeatherCondition.LLUVIA) {
            this.bonificacionTormentaElectrica = 1d;
            throw new RoundStartException("En esta ronda, " + getNombre() + " disminuye el daño recibido gracias a la lluvia");
        } else {
            this.bonificacionTormentaElectrica = 1d;
        }
    }
}
