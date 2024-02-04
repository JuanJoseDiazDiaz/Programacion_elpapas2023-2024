package JuegoRollEnCasa;

import java.util.Scanner;

public class Clerigo extends Personaje {
    private static final int FUERZA_MAX = 18;
    private static final int INTELIGENCIA_MIN = 12;
    private static final int INTELIGENCIA_MAX = 16;
    private String diosDeClerigo;

    public Clerigo(String nombre, Raza raza, int fuerza, int inteligencia, int vidaMax, String nombreDios) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, vidaMax);
        this.diosDeClerigo = nombreDios;
    }


    public void setFuerzaClerigo(int fuerzaClerigo) throws PersonajeException {
        if (fuerzaClerigo < FUERZA_MAX) {
            throw new PersonajeException("el valor de la fuerza es menor al maximo ");
        }
        super.setFuerza(fuerzaClerigo);
    }

    public void setInteligenciaClerigo(int inteligenciaClerigo) throws PersonajeException {
        if (inteligenciaClerigo > INTELIGENCIA_MIN && inteligenciaClerigo < INTELIGENCIA_MAX) {
            throw new PersonajeException("el valor de la inteligencia sobrepasa los valores registrados ");
        }
        super.setInteligencia(inteligenciaClerigo);
    }

    public void ClerigoCurar(Personaje diosDeClerigo) throws PersonajeException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("quieres rezarle a tu dios?");
        String PalabraClave = teclado.nextLine().toLowerCase();
        try {
            if (PalabraClave.equals("Si")) {
                diosDeClerigo.RezoClerigo();
            } else {
                throw new PersonajeException("La respuesta no es la correcta");
            }
        } catch (PersonajeException e) {
            System.out.println(e.getMessage());
        }


    }
}
