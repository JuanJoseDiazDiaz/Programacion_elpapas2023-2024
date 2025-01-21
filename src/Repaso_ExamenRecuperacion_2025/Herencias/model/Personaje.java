package Repaso_ExamenRecuperacion_2025.Herencias.model;

import Repaso_ExamenRecuperacion_2025.Herencias.expections.JuegoRolException;

public class Personaje {
    private String nombre;
    private RazaEnum raza_personaje;
    private float fuerza_personaje;
    private float inteligencia_personaje;
    private float puntoVidaMax_personaje;
    private float puntoVidaActual_personaje;

    public Personaje(String nombre, RazaEnum raza_personaje, float fuerza_personaje, float inteligencia_personaje, float puntoVidaMax_personaje, float puntoVidaActual_personaje) throws JuegoRolException {
        this.nombre = nombre;
        this.raza_personaje = raza_personaje;
        setFuerza_personaje(fuerza_personaje);
        setInteligencia_personaje(inteligencia_personaje);
        setPuntoVidaMax_personaje(puntoVidaMax_personaje);
        setPuntoVidaActual_personaje(puntoVidaActual_personaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RazaEnum getRaza_personaje() {
        return raza_personaje;
    }

    public void setRaza_personaje(RazaEnum raza_personaje) {
        this.raza_personaje = raza_personaje;
    }

    public float getFuerza_personaje() {
        return fuerza_personaje;
    }

    public void setFuerza_personaje(float fuerza_personaje) throws JuegoRolException {
        if (fuerza_personaje < 0 || fuerza_personaje > 20) {
            throw new JuegoRolException("Error, fuerza del personaje no valida");
        }
        this.fuerza_personaje = fuerza_personaje;
    }

    public float getInteligencia_personaje() {
        return inteligencia_personaje;
    }

    public void setInteligencia_personaje(float inteligencia_personaje) throws JuegoRolException {
        if (inteligencia_personaje < 0 || inteligencia_personaje > 20) {
            throw new JuegoRolException("Error, inteligencia del personaje no valida");
        }
        this.inteligencia_personaje = inteligencia_personaje;
    }

    public float getPuntoVidaMax_personaje() {
        return puntoVidaMax_personaje;
    }

    public void setPuntoVidaMax_personaje(float puntoVidaMax_personaje) throws JuegoRolException {
        if (puntoVidaMax_personaje < 0 || puntoVidaMax_personaje > 100) {
            throw new JuegoRolException("Error, puntos de vida no validos");
        }
        this.puntoVidaMax_personaje = puntoVidaMax_personaje;
    }

    public float getPuntoVidaActual_personaje() {
        return puntoVidaActual_personaje;
    }

    public void setPuntoVidaActual_personaje(float puntoVidaActual_personaje) throws JuegoRolException {
        if (puntoVidaActual_personaje < 0 || puntoVidaActual_personaje > puntoVidaMax_personaje) {
            throw new JuegoRolException("Error, puntos de vida no validos");
        }
        this.puntoVidaActual_personaje = puntoVidaActual_personaje;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", raza_personaje=" + raza_personaje +
                ", fuerza_personaje=" + fuerza_personaje +
                ", inteligencia_personaje=" + inteligencia_personaje +
                ", puntoVidaMax_personaje=" + puntoVidaMax_personaje +
                ", puntoVidaActual_personaje=" + puntoVidaActual_personaje +
                '}';
    }
}
