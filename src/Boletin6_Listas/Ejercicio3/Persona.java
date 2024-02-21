package Boletin6_Listas.Ejercicio3;

import boletinObjetos.Mensajeria.MensajeException;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
   private  String nombre;
   private List<Mensaje> bandejaDeEntrada;

    public Persona(String nombre) {
        this.nombre = nombre;
        bandejaDeEntrada = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void enviarMensaje (Persona recepetor, String mensaje) throws MensajeException {
        recepetor.bandejaDeEntrada.add(new Mensaje(this, mensaje));
    }
    public String leerMensajes(){
        StringBuilder mensajes = new StringBuilder();
        for (int i = 0; i < bandejaDeEntrada.size(); i++){
            mensajes.append("Mensaje : ").append(i + 1).append("\n");
        }
        return mensajes.toString();
    }

}
