package model;

import enums.WeatherCondition;
import exceptions.RoundStartException;
import exceptions.ValorNoValidoException;
import interfaces.Atacador;

public abstract class Pokemon implements Atacador {

    public static final int MAX_PUNTOS_SALUD = 100;
    public static final int MAX_PUNTOS_ATAQUE = 20;
    public static final int MAX_PUNTOS_DEFENSA = 50;

    private String nombre;
    private int puntosSalud;
    /**
     * Ataque del pokemon. Entero de 0 a 20.
     */
    private int ataque;
    /**
     * Defensa del pokemon. Entero de 0 a 50. Es la probabilidad de restarle fuerza al ataque del oponente.
     */
    private int defensa;
    //private EstadoPokemon estado;

    public Pokemon(String nombre, int puntosSalud, int ataque, int defensa) throws ValorNoValidoException {
        this.nombre = nombre;
        setPuntosSalud(puntosSalud);
        setAtaque(ataque);
        setDefensa(defensa);
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    protected void setPuntosSalud(int puntosSalud) {
        if (puntosSalud < 0) {
            this.puntosSalud = 0;
        }
        else if (puntosSalud > MAX_PUNTOS_SALUD) {
            this.puntosSalud = MAX_PUNTOS_SALUD;
        }
        else {
            this.puntosSalud = puntosSalud;
        }
    }

    public int getAtaque() {
        return ataque;
    }

    /**
     * Ataque del pokemon. Entero de 0 a 20.
     * @param ataque
     */
    public void setAtaque(int ataque) throws ValorNoValidoException {
        if (ataque < 0 || ataque > MAX_PUNTOS_ATAQUE) {
            throw new ValorNoValidoException("El ataque debe estar entre 0 y " + MAX_PUNTOS_ATAQUE);
        }
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

/**
     * Defensa del pokemon. Entero de 0 a 50. Es la probabilidad de restarle fuerza al ataque del oponente.
     * @param defensa
     */
    public void setDefensa(int defensa) throws ValorNoValidoException {
        if (defensa < 0 || defensa > MAX_PUNTOS_DEFENSA) {
            throw new ValorNoValidoException("La defensa debe estar entre 0 y " + MAX_PUNTOS_DEFENSA);
        }
        this.defensa = defensa;
    }

    public boolean estaVivo() {
        return puntosSalud > 0;
    }

    public abstract void roundStart(WeatherCondition weatherCondition) throws RoundStartException;

}
