package Repaso_ExamenRecuperacion_2025.Herencias.model;

import Repaso_ExamenRecuperacion_2025.Herencias.expections.JuegoRolException;
import Repaso_ExamenRecuperacion_2025.Herencias.interfaces.Curar;

import java.util.HashSet;
import java.util.Set;

public class Clerigo extends Personaje implements Curar {
    Set<String> SetNombresDioses;
    public Clerigo(String nombre, RazaEnum raza_personaje, float fuerza_personaje, float inteligencia_personaje, float puntoVidaMax_personaje, float puntoVidaActual_personaje) throws JuegoRolException {
        super(nombre, raza_personaje, fuerza_personaje, inteligencia_personaje, puntoVidaMax_personaje, puntoVidaActual_personaje);
        SetNombresDioses = new HashSet<>();
        setFuerza_personaje(fuerza_personaje);
        setInteligencia_personaje(inteligencia_personaje);
    }

    @Override
    public void setFuerza_personaje(float fuerza_clerigo) throws JuegoRolException {
        if (fuerza_clerigo < 18 ){
            throw new JuegoRolException("Error, valor fuera de rango");
        }
        super.setFuerza_personaje(fuerza_clerigo);
    }

    @Override
    public void setInteligencia_personaje(float inteligencia_Clerigo) throws JuegoRolException {
        if (inteligencia_Clerigo < 12 || inteligencia_Clerigo > 16 ){
            throw new JuegoRolException("Error, valor de la inteligencia fuera de rango");
        }
        super.setInteligencia_personaje(inteligencia_Clerigo);
    }

    public void addDios_Clerigo(String nombreDiose){
        SetNombresDioses.add(nombreDiose);
    }


    @Override
    public void curar(Personaje personaje) throws JuegoRolException {
        if (personaje.getPuntoVidaActual_personaje() < 0){
            throw new JuegoRolException("Lo siento, pero solo puedo curar no resucitar");
        }
        float vidaCurada = personaje.getPuntoVidaActual_personaje() + 10f;
        System.out.println("El personaje: "+ personaje + " se acaba de curar");
        setPuntoVidaActual_personaje(vidaCurada);
    }

    @Override
    public String toString() {
        return super.toString() + "Clerigo{" +
                "SetNombresDioses=" + SetNombresDioses +
                '}';
    }
}
