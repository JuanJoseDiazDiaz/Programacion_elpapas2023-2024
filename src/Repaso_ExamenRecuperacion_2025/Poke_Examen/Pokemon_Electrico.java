package Repaso_ExamenRecuperacion_2025.Poke_Examen;

import java.util.Random;

public class Pokemon_Electrico extends Pokemon {
    private double rainDamageReduction; // Reducción de daño bajo lluvia (entre 10% y 15%)
    private boolean isStorming; // Condición climática: tormenta eléctrica
    private boolean isRaining;

    public Pokemon_Electrico(String nombre, int punt_Salud, int nivel_Ataque, int nivel_Defensa, double rainDamageReduction) throws PokemonException {
        super(nombre, punt_Salud, nivel_Ataque, nivel_Defensa);
        this.rainDamageReduction = rainDamageReduction;
        this.isStorming = false;
        this.isRaining = false;
    }
    // Método para activar tormenta eléctrica
    public void setStorming(boolean storming) {
        this.isStorming = storming;
    }

    // Método para activar lluvia
    public void setRaining(boolean raining) {
        this.isRaining = raining;
    }

    // Método para calcular el ataque con bonificación por tormenta eléctrica
    public int calculateAttack() {
        if (isStorming) {
            Random random = new Random();
            double stormBonus = 1 + random.nextDouble(); // Valor entre 1.0 y 1.99999
            int boostedAttack = (int) (getNivel_Ataque() * stormBonus);
            System.out.println(getNombre() + " tiene ataque aumentado por tormenta eléctrica: " + boostedAttack);
            return boostedAttack;
        } else {
            System.out.println(getNombre() + " tiene ataque normal: " + getNivel_Ataque());
            return getNivel_Ataque();
        }
    }

    // Método para recibir daño, con reducción bajo lluvia
    public void receiveAttack(int damage) {
        if (isRaining) {
            int reducedDamage = (int) (damage * (1 - rainDamageReduction)); // Reduce el daño en un % fijo
            int vidaDañoRecibido = getPunt_Salud() - reducedDamage;
            System.out.println(getNombre() + " recibió un ataque bajo la lluvia. Daño reducido a: " + reducedDamage + ". Vida actual: " + vidaDañoRecibido);
        } else {
            int vidaDañoRecibido2 = getPunt_Salud() - damage;
            System.out.println(getNombre() + " recibió un ataque. Daño: " + damage + ". Vida actual: " + vidaDañoRecibido2);
        }
    }
}
