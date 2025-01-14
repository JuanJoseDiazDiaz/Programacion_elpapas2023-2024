package Repaso_ExamenRecuperacion_2025.Poke_Examen;

import java.util.Random;

public class Pokemon_Agua extends Pokemon implements Curarse, Atacar{
    private boolean esta_lloviendo;
    private int vidaRecuperada;



    public Pokemon_Agua(String nombre, int punt_Salud, int nivel_Ataque, int nivel_Defensa, int vidaRecuperada) throws PokemonException {
        super(nombre, punt_Salud, nivel_Ataque, nivel_Defensa);
        this.vidaRecuperada = vidaRecuperada;
    }



    @Override
    public void heal() {
        if (esta_lloviendo) {
            int vidaTotal = getPunt_Salud() + vidaRecuperada;
            System.out.println(getNombre() + " se ha curado " + vidaRecuperada + " puntos de vida. Vida actual: " + vidaTotal);
        } else {
            System.out.println(getNombre() + " no puede curarse porque no está lloviendo.");
        }
    }

    @Override
    public int calculateAttack() {
        if (esta_lloviendo) {
            Random random = new Random();
            double precision = 1 + random.nextDouble(); // Valor entre 1.0 y 1.99999
            int boostedAttack = (int) (getNivel_Ataque() * precision);
            System.out.println(getNombre() + " tiene ataque aumentado por la lluvia: " + boostedAttack);
            return boostedAttack;
        } else {
            System.out.println(getNombre() + " tiene ataque normal: " + getNivel_Ataque());
            return getNivel_Ataque();
        }
    }
}
