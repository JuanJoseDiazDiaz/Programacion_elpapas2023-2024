package BoletinHerencias_5_1.JuegoDeRoll;

import java.util.Arrays;

public class Mago extends Personaje {
    public static final int NUMERO_MAX_HECHIZOS = 4;
    public static final int INTELIGENCIA_MIN = 17;
    public static final int FUERZA_MAX_MAGO = 15;
    public static final int DAÑO_DE_HECHIZO = 10;
    private String[] hechizos;

    public Mago(String nombre, Raza raza, int fuerza, int inteligencia, int vidaMax) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, vidaMax);
        hechizos = new String[NUMERO_MAX_HECHIZOS];
    }

    @Override
    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza > FUERZA_MAX_MAGO) {
            throw new PersonajeException("Valor de la fuerza no esta permitido para ser Mago");
        }
        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < INTELIGENCIA_MIN) {
            throw new PersonajeException("Valor de la Inteligencia no esta permitido para ser Mago");
        }
        super.setInteligencia(inteligencia);
    }
    public void aprendeHechizo(String hechizo) throws PersonajeException {
        boolean encontradoHechizo = false;
        int posVacia = -1;
        for (int i = 0; i < hechizos.length && !encontradoHechizo; i ++){
            if (hechizo.equals(hechizos[i])){
                System.out.println("has aprendido de nuevo el hechizo");
                encontradoHechizo = true;
            }
            if (hechizos[i] == null && posVacia == -1) {
                posVacia = i;
            }
        }
        if (encontradoHechizo){
            throw new PersonajeException("El mago no puede aprender el mismo Hechizo");
        }
        if (posVacia == -1){
            throw new PersonajeException("No tiene suficiente espacio para aprender este hechizo");
        }
        hechizos[posVacia]=hechizo;

    }
    public void lanzarHechizo (Personaje personaje, String hechizo) throws PersonajeException {
        int posHechizo = 0;
        for (int i = 0; i < hechizos.length; i ++){
            if (hechizo.equals(hechizos[i])){
                posHechizo = i;
            }
        }
        if (this == personaje){
            throw new PersonajeException("No puedes atacarte a ti mismo ");
        }
        if (personaje.getVidaActual()== 0){
            throw new PersonajeException("El personaje esta muerto");
        }
        hechizos[posHechizo] = null;
        personaje.setVidaActual(personaje.getVidaActual() - DAÑO_DE_HECHIZO);
    }

    @Override
    public String toString() {
        return "Mago{" +
                "hechizos=" + Arrays.toString(hechizos) +
                super.toString() +'}';
    }
}
