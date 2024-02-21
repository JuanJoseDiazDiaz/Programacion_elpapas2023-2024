package Boletin6_Listas.Ejercicio3;

import boletinObjetos.Mensajeria.MensajeException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Alumno extends Persona{
    private static final int MAYORIA_EDAD = 18;
    private LocalDate fechaDeNacimiento;
    private Persona Alumno;

    public Alumno(String nombre, LocalDate fechaDeNacimiento) {
        super(nombre);
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public void enviarMensaje(Persona recepetor, String mensaje) throws MensajeException {
        LocalDate fechaMinima = LocalDate.now().minusYears(MAYORIA_EDAD);
        if (recepetor instanceof  Alumno && fechaDeNacimiento.isAfter(fechaMinima)){
            throw new MensajeException("Los alumnos menores no pueden enviar mensajes a otros alumnos");
        }
        super.enviarMensaje(recepetor, mensaje);
    }
}
