package boletinRepasoExamen.Avion.boletin4_1;

public class PrincipalPersona {
    public static void main(String[] args) {
        Persona nuevaPersona = new Persona("lola",4324343, 'M',1.5f, 60.05f, 'F');
        System.out.println(nuevaPersona);
        nuevaPersona.getIMC(60.05f,1.5f);
        nuevaPersona.getLetraDni('A');

    }
}
