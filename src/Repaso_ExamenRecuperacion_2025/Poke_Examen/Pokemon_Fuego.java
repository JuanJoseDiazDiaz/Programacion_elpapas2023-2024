package Repaso_ExamenRecuperacion_2025.Poke_Examen;

import java.util.Random;
import java.util.Scanner;

public class Pokemon_Fuego extends Pokemon implements Atacar, Atacable{
    private int waterResistance; // Resistencia a los ataques de tipo agua
    private boolean isSunny;

    public Pokemon_Fuego(String nombre, int punt_Salud, int nivel_Ataque, int nivel_Defensa, int waterResistance) throws PokemonException {
        super(nombre, punt_Salud, nivel_Ataque, nivel_Defensa);
        this.waterResistance = waterResistance;
        this.isSunny = false;
    }

    @Override
    // Método para calcular el ataque con bonificación por sol
    public int calculateAttack() {
        if (isSunny) {
            Random random = new Random();
            double sunBonus = 1 + random.nextDouble(); // Valor entre 1.0 y 1.99999
            int boostedAttack = (int) (getNivel_Ataque() * sunBonus);
            System.out.println(getNombre() + " tiene ataque aumentado por el sol: " + boostedAttack);
            return boostedAttack;
        } else {
            System.out.println(getNombre() + " tiene ataque normal: " + getNivel_Ataque());
            return getNivel_Ataque();
        }
    }
    @Override
    // Método para recibir daño, teniendo en cuenta la resistencia al agua
    public void receiveAttack(int damage) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tipo de ataque es: ");
        String attackType = sc.nextLine();
        if (attackType.equalsIgnoreCase("agua")) {
            int reducedDamage = Math.max(damage - waterResistance, 0);
            int vidaActual = getPunt_Salud() - reducedDamage;
            System.out.println(getNombre() + " recibió un ataque de agua. Daño reducido a: " + reducedDamage + ". Vida actual: " + vidaActual);
        } else {
            int vidaDolida = getPunt_Salud() - damage;
            System.out.println(getNombre() + " recibió un ataque de tipo " + attackType + ". Daño: " + damage + ". Vida actual: " + vidaDolida);
        }
    }

    public int getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(int waterResistance) {
        this.waterResistance = waterResistance;
    }

    public boolean isSunny() {
        return isSunny;
    }

    public void setSunny(boolean sunny) {
        isSunny = sunny;
    }
}
