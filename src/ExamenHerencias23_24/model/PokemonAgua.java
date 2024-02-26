package ExamenHerencias23_24.model;

import ExamenHerencias23_24.enums.WeatherCondition;
import ExamenHerencias23_24.exception.MuerteException;
import ExamenHerencias23_24.exception.RoundStartException;
import ExamenHerencias23_24.exception.ValorNoValidoException;
import ExamenHerencias23_24.interfaces.Atacable;
import ExamenHerencias23_24.interfaces.Atacador;

public class PokemonAgua extends Pokemon {
    private static final int MIN_HIDRATACION = 10;
    private static final int MAX_HIDRATACION = 20;
    private int hidratacion;
    private double precisionLluvia;

    public PokemonAgua(String nombre, int puntosSalud, int puntosAtaque, int defensa, int hidratacion) throws ValorNoValidoException {
        super(nombre, puntosSalud, puntosAtaque, defensa);
        setHidratacion(hidratacion);
        precisionLluvia = 1d;
    }

    public void setHidratacion(int hidratacion) throws ValorNoValidoException {
        if (hidratacion < MIN_HIDRATACION || hidratacion > MIN_HIDRATACION){
            throw new ValorNoValidoException("hidratacion debe estar entre "+ MIN_HIDRATACION +" y "+ MAX_HIDRATACION);
        }
        this.hidratacion = hidratacion;
    }

    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {
        if (!estaVivo()){
            return;
        }
        if (weatherCondition == WeatherCondition.LLUVIA){
            setPuntosSalud(getPuntosSalud() + hidratacion);
            precisionLluvia += Math.random();
            throw new RoundStartException("El pokemon "+getNombre()+" recibe una curacion por lluvia");
        }else {
            precisionLluvia = 1d;
        }
    }

    @Override
    public void atacar(Atacable objetivo, WeatherCondition tiempo) throws MuerteException {
        objetivo.recibirAtaque(tiempo, (int) (getPuntosAtaque() * precisionLluvia), this);
    }

    @Override
    public void recibirAtaque(WeatherCondition tiempo, int puntosAtaques, Atacador atacador) throws MuerteException {
        setPuntosSalud(getPuntosSalud() - puntosAtaques *(1- getDefensa() /100));
        if (!estaVivo()){
            throw new MuerteException("El pokemon "+getNombre()+ "  nos ha dejado");
        }
    }

    @Override
    public boolean estaVivo() {
        return false;
    }
}
