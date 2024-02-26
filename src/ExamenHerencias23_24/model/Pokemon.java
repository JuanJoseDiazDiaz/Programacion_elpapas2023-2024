package ExamenHerencias23_24.model;

import ExamenHerencias23_24.enums.WeatherCondition;
import ExamenHerencias23_24.exception.MuerteException;
import ExamenHerencias23_24.exception.RoundStartException;
import ExamenHerencias23_24.exception.ValorNoValidoException;
import ExamenHerencias23_24.interfaces.Atacable;
import ExamenHerencias23_24.interfaces.Atacador;

public abstract class Pokemon implements Atacable, Atacador {
    public static final int MAX_SALUD = 100;
    public static final int MIN_ATAQUE = 5;
    public static final int MAX_ATAQUE = 15;
    public static final int MIN_DEFENSA = 5;
    public static final int MAX_DEFENSA = 25;
    private int puntosSalud;
    private int puntosAtaque ;
    private int defensa;
    private String nombre;

    public Pokemon(String nombre,int puntosSalud, int puntosAtaque, int defensa) throws ValorNoValidoException {
        setPuntosSalud(puntosSalud);
        setPuntosAtaque(puntosAtaque);
        setDefensa(defensa);
        this.nombre = nombre;
    }

    public void setPuntosSalud(int puntosSalud) {
        if (puntosSalud <0 ){
            puntosSalud = 0;
        }
        else if (puntosSalud > MAX_SALUD){
            puntosSalud = MAX_SALUD;
        }
        this.puntosSalud = puntosSalud;
    }

    public void setPuntosAtaque(int puntosAtaque) throws ValorNoValidoException {
        if (puntosAtaque < MIN_ATAQUE || puntosAtaque > MAX_ATAQUE){
            throw new ValorNoValidoException("El valor de ataque debe estar entre: "+MIN_ATAQUE+ " Y " + MAX_ATAQUE);
        }

        this.puntosAtaque = puntosAtaque;
    }

    public void setDefensa(int defensa) throws ValorNoValidoException {
        if (defensa < MIN_DEFENSA || defensa > MAX_DEFENSA){
            throw new ValorNoValidoException("El valor de defensa debe estar entre: "+MIN_ATAQUE+ " Y " + MAX_ATAQUE);
        }
        this.defensa = defensa;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public int getDefensa() {
        return defensa;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void recibirAtaque(WeatherCondition tiempo, int puntosVida, Atacador atacador) throws MuerteException {

    }

    @Override
    public void atacar(Atacable objetivo, WeatherCondition tiempo) throws MuerteException {

    }

    public abstract void roundStart(WeatherCondition weatherCondition) throws RoundStartException ;

    public abstract boolean estaVivo();
}
