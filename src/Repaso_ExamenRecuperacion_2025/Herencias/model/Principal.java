package Repaso_ExamenRecuperacion_2025.Herencias.model;

import Repaso_ExamenRecuperacion_2025.Herencias.expections.JuegoRolException;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try {
            Mago a = new Mago("José", RazaEnum.HUMANO, 14, 18, 90, 70);
            Mago b = new Mago("Voldemort", RazaEnum.ELFO, 14, 18, 90, 80);
            Clerigo c = new Clerigo("Julian", RazaEnum.HUMANO, 19, 15, 90, 80);

            System.out.println("El mago " + a.getNombre() + " aprende 2 hechizos");
            a.addHechizo("abracadrabra");
            a.addHechizo("Lebiosa");
            System.out.println("El mago " + b.getNombre() + " aprende 1 hechizo");
            b.addHechizo("holaMundo");
            System.out.println(a);
            System.out.println(b);

            System.out.println("El mago " + a.getNombre() + " lanza un hechizo sobre el mago " + b.getNombre());
            a.lanzarHechizo(b, "abracadrabra");
            System.out.println("El mago " + b.getNombre() + " lanza un hechizo sobre el mago " + a.getNombre());
            b.lanzarHechizo(a, "holaMundo");
            System.out.println("Clerigo " + c.getNombre() + " cura al mago " + b.getNombre());
            c.addDios_Clerigo("Jesusisto");
            c.curar(b);
            System.out.println("El mago " + a.getNombre() + " lanza un hechizo sobre el mago " + b.getNombre());
            a.lanzarHechizo(b, "Lebiosa");

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);


        } catch (JuegoRolException e) {
            throw new RuntimeException(e);
        }

    }

    // todo -> AltaPersonaje
    public void altaPersonaje() throws JuegoRolException {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que deseas crear? (Mago o Clerigo)");
        String opcion = sc.nextLine();
        if (opcion == "Mago") {
            System.out.println("Introduce el nombre del mago: ");
            String nombre = sc.nextLine();
            System.out.println("Introduce la raza del mago: ");
            System.out.println("1.  HUMANO");
            System.out.println("2.  ORCO");
            System.out.println("3.  ELFO");
            System.out.println("4.  ENANO");
            int opcion_Raza = sc.nextInt();
            System.out.println("Introduce la fuerza del mago: (0 - 15)");
            float fuerza = sc.nextFloat();
            System.out.println("Introduce la inteligencia del mago: (17 - 20)");
            float inteligencia = sc.nextFloat();
            System.out.println("Introduce puntos de vida maximos del personaje: (0 - 100)");
            float puntosMax = sc.nextFloat();
            System.out.println("Introduce puntos de vida actuales del personaje: (0 - " + puntosMax + ")");
            float puntosActual = sc.nextFloat();
            Mago a = new Mago(nombre, RazaEnum.values()[opcion_Raza], fuerza, inteligencia, puntosMax, puntosActual);
        } else if (opcion == "Clerigo") {
            System.out.println("Introduce el nombre del clerigo: ");
            String nombre = sc.nextLine();
            System.out.println("Introduce la raza del mago: ");
            System.out.println("1.  HUMANO");
            System.out.println("2.  ORCO");
            System.out.println("3.  ELFO");
            System.out.println("4.  ENANO");
            int opcion_Raza = sc.nextInt();
            System.out.println("Introduce la fuerza del clerigo: (18 - 20)");
            float fuerza = sc.nextFloat();
            System.out.println("Introduce la inteligencia del mago: (12 - 16)");
            float inteligencia = sc.nextFloat();
            System.out.println("Introduce puntos de vida maximos del personaje: (0 - 100)");
            float puntosMax = sc.nextFloat();
            System.out.println("Introduce puntos de vida actuales del personaje: (0 - " + puntosMax + ")");
            float puntosActual = sc.nextFloat();
            Clerigo c = new Clerigo("Julian", RazaEnum.values()[opcion_Raza], fuerza, inteligencia, puntosMax, puntosActual);
        }
    }

    //todo -> Aprende Hechizo
    public void aprendeHechizo(Mago m) throws JuegoRolException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del mago: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el nombre del hechizo");
        String hechizo = sc.nextLine();

        if (nombre.equals(m.getNombre())) { // Esto signfica que existe
            if (m.getNombreHechizos().contains(hechizo)) {
                throw new JuegoRolException("Error, no puedes aprender el mismo hechizo");
            }else{
                m.addHechizo(hechizo);
            }
        }else{
            throw new JuegoRolException("Error, este mago no existe");
        }

    }

    // todo -> Mago lanza Hechizo
    public void lanzarHechizo(Mago m1, Mago m2 ) throws JuegoRolException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del primer mago: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce el nombre del segundo mago: ");
        String magoSegundo = sc.nextLine();
        if (m1.equals(nombre) && m2.equals(magoSegundo)) {

        }else {
            throw new JuegoRolException("Error, este mago no existe");
        }
    }
}
