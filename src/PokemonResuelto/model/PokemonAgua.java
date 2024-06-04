package model;

import enums.WeatherCondition;
import exceptions.MuerteException;
import exceptions.RoundStartException;
import exceptions.ValorNoValidoException;
import interfaces.Atacable;

public class PokemonAgua extends PokemonAtacable {
    /**
     * Hidratación: Cantidad de puntos de salud que recupera el pokemon de agua en cada ronda de lluvia. Entre 10 y 20.
     */
    private int hidratacion;
    private double precisionLluvia;

    public PokemonAgua(String nombre, int puntosSalud, int ataque, int defensa, int hidratacion) throws ValorNoValidoException {
        super(nombre, puntosSalud, ataque, defensa);
        setHidratacion(hidratacion);
        this.precisionLluvia = 1d;
    }

    @Override
    protected void setPuntosSalud(int puntosSalud) {
        if (puntosSalud > Pokemon.MAX_PUNTOS_SALUD) {
            puntosSalud = Pokemon.MAX_PUNTOS_SALUD;
        }
        super.setPuntosSalud(puntosSalud);
    }

    public int getHidratacion() {
        return hidratacion;
    }

    /**
     * Hidratación: Cantidad de puntos de salud que recupera el pokemon de agua en cada ronda de lluvia. Entre 10 y 20.
     * @param hidratacion
     */
    private void setHidratacion(int hidratacion) throws ValorNoValidoException {
        if (hidratacion < 10 || hidratacion > 20) {
            throw new ValorNoValidoException("La hidratación debe estar entre 10 y 20");
        }
        this.hidratacion = hidratacion;
    }

    public double getPrecisionLluvia() {
        return precisionLluvia;
    }

    @Override
    public void atacar(Atacable atacable, WeatherCondition weatherCondition) throws MuerteException {
        atacable.recibirAtaque(this, weatherCondition, (int) (getAtaque() * precisionLluvia));
    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {
        if (!estaVivo()){
            return;
        }
        if (weatherCondition == WeatherCondition.LLUVIA) {
            this.setPuntosSalud(this.getPuntosSalud() + hidratacion);
            this.precisionLluvia += Math.random();
            throw new RoundStartException(getNombre() + " ha recuperado " + hidratacion + " puntos por la lluvia");
        }
        else {
            this.precisionLluvia = 1d;
        }
    }
}
