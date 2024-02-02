package BoletinHerencias_5_1.JuegoDeRoll;

public class Clerigo extends Personaje {
    private static final int FUERZA_MAX = 18;
    private static final int INTELIGENCIA_MIN = 12;
    private static final int INTELIGENCIA_MAX = 16;
    private DiosClerigo diosDeClerigo;

    public Clerigo(String nombre, Raza raza, int fuerza, int inteligencia, int vidaMax, DiosClerigo diosClerigo) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, vidaMax);
        this.diosDeClerigo = diosClerigo;
    }
}
