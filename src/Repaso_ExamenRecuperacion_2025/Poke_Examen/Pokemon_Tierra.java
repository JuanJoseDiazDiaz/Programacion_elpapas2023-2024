package Repaso_ExamenRecuperacion_2025.Poke_Examen;

import java.util.Random;
import java.util.Scanner;

public class Pokemon_Tierra extends Pokemon implements Atacar, Atacable{
    private int electricResistance; // Resistencia a ataques eléctricos (1 a 9)
    private boolean isSandstorm; // Indica si hay tormenta de arena
    public Pokemon_Tierra(String nombre, int punt_Salud, int nivel_Ataque, int nivel_Defensa, int electricResistance) throws PokemonException {
        super(nombre, punt_Salud, nivel_Ataque, nivel_Defensa);
        this.electricResistance = electricResistance;
        this.isSandstorm = false;
    }
    @Override
    // Método para calcular el ataque con bonificación por tormenta de arena
    public int calculateAttack() {
        if (isSandstorm) {
            Random random = new Random();
            double sandstormBonus = 1 + random.nextDouble(); // Genera un valor entre 1.0 y 1.99999
            int boostedAttack = (int) (getNivel_Ataque() * sandstormBonus);
            System.out.println(getNombre() + " tiene ataque aumentado por tormenta de arena: " + boostedAttack);
            return boostedAttack;
        } else {
            System.out.println(getNombre() + " tiene ataque normal: " + getNivel_Ataque());
            return getNivel_Ataque();
        }
    }
    @Override
    // Método para recibir daño, con resistencia a ataques eléctricos
    public void receiveAttack(int damage) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tipo de ataque es: ");
        String attackType = sc.nextLine();
        if (attackType.equalsIgnoreCase("eléctrico")) {
            int reducedDamage = Math.max(damage - electricResistance, 0); // Reduce el daño por resistencia
            int dañoRecibido = getPunt_Salud() - reducedDamage;
            System.out.println(getNombre() + " recibió un ataque eléctrico. Daño reducido a: " + reducedDamage + ". Vida actual: " + dañoRecibido);
        } else {
            int vidaConDaño = getPunt_Salud() - damage;
            System.out.println(getNombre() + " recibió un ataque de tipo " + attackType + ". Daño: " + damage + ". Vida actual: " + vidaConDaño);
        }
    }

    public int getElectricResistance() {
        return electricResistance;
    }

    public void setElectricResistance(int electricResistance) {
        this.electricResistance = electricResistance;
    }

    public boolean isSandstorm() {
        return isSandstorm;
    }

    public void setSandstorm(boolean sandstorm) {
        isSandstorm = sandstorm;
    }
}
