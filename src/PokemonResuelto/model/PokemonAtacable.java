package model;

import enums.WeatherCondition;
import exceptions.MuerteException;
import exceptions.ValorNoValidoException;
import interfaces.Atacable;
import interfaces.Atacador;

public abstract class PokemonAtacable extends Pokemon implements Atacable {
    public PokemonAtacable(String nombre, int puntosSalud, int ataque, int defensa) throws ValorNoValidoException {
        super(nombre, puntosSalud, ataque, defensa);
    }

    @Override
    public void recibirAtaque(Atacador atacador, WeatherCondition weatherCondition, int puntosAtaque) throws MuerteException {
        if (puntosAtaque < 0) {
            return;
        }
        int danio = (int) (puntosAtaque * (1 - (getDefensa() / 100d)));
        this.setPuntosSalud(this.getPuntosSalud() - danio);

        if (!estaVivo()){
            throw new MuerteException(getNombre() + " ha muerto");
        }
    }
}
