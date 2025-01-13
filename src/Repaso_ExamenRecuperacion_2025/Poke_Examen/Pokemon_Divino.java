package Repaso_ExamenRecuperacion_2025.Poke_Examen;

public class Pokemon_Divino extends Pokemon{
    public Pokemon_Divino(String nombre, int punt_Salud, int nivel_Ataque, int nivel_Defensa) throws PokemonException {
        super(nombre, punt_Salud, nivel_Ataque, nivel_Defensa);
    }
    // Método para calcular ataque (si lo intentan, no sirve para ganar)
    public int calculateAttack() {
        System.out.println(getNombre() + " intenta atacar, pero nunca podrá ganar...");
        return 0;
    }

    // Método para recibir ataques (no puede ser atacado)
    public void receiveAttack(int damage) {
        System.out.println(getNombre() + " no puede ser atacado por nadie. Es invulnerable.");
    }

    // Método para simular una batalla
    public void battle() {
        System.out.println(getNombre() + " participa en la batalla, pero nunca podrá ganar...");
    }
}
