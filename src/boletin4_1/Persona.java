package boletinRepasoExamen.Avion.boletin4_1;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaDeNacimiento = LocalDate.of(2004, 03, 3);
    private int dni;
    private char Sexo;
    private float altura;
    private float peso;
    private char letradni;


    public Persona(String nombre, int dni, char sexo, float altura, float peso, char letradni) {
        this.nombre = nombre;
        this.dni = dni;
        this.Sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.letradni = letradni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public char getSexo() {
        return Sexo;
    }

    public void getLetraDni(char letradni){
        System.out.println("Esta es la letra de su dni: "+letradni);
    }

    public void getIMC (float peso, float altura){
        float resultado = peso / (altura * altura);
        System.out.println("aqui tiene indice de masa corporal que es: "+resultado+ " %");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", dni=" + dni +
                ", Sexo=" + Sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                ", letradni=" + letradni +
                '}';
    }
}
