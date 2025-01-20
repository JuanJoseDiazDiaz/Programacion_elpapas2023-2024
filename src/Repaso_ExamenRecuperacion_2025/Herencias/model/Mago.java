package Repaso_ExamenRecuperacion_2025.Herencias.model;

import Repaso_ExamenRecuperacion_2025.Herencias.JuegoRolException;
import Repaso_ExamenRecuperacion_2025.Herencias.RazaEnum;

import java.util.HashSet;
import java.util.Set;

public class Mago extends Personaje{
    private Set<String> nombreHechizos;


    public Mago(String nombre, RazaEnum raza_personaje, float fuerza_personaje, float inteligencia_personaje, float puntoVidaMax_personaje, float puntoVidaActual_personaje) throws JuegoRolException {
        super(nombre, raza_personaje, fuerza_personaje, inteligencia_personaje, puntoVidaMax_personaje, puntoVidaActual_personaje);
        this.nombreHechizos = new HashSet<>();
        setNombreHechizos(nombreHechizos);
        setFuerza_personaje(fuerza_personaje);
        setInteligencia_personaje(inteligencia_personaje);
    }

    @Override
    public void setFuerza_personaje(float fuerza_personaje) throws JuegoRolException {
        if (fuerza_personaje > 15){
            throw new JuegoRolException("Error, Valor no valido");
        }
        super.setFuerza_personaje(fuerza_personaje);
    }

    @Override
    public void setInteligencia_personaje(float inteligencia_personaje) throws JuegoRolException {
        if (inteligencia_personaje < 17){
            throw new JuegoRolException("Error, Valor no valido");
        }
        super.setInteligencia_personaje(inteligencia_personaje);
    }

    public void setNombreHechizos(Set<String> nombreHechizos) throws JuegoRolException {
        if (nombreHechizos.size() > 4){
            throw new JuegoRolException("Error, no puedes memorizar 4 hechizos a la vez");
        }
        this.nombreHechizos = nombreHechizos;
    }

    public void addHechizo (String hechizo) throws JuegoRolException {
       if (nombreHechizos.contains(hechizo)|| nombreHechizos.isEmpty()){
           throw new JuegoRolException("Error, datos no validos");
       }
       nombreHechizos.add(hechizo);
    }

    public void lanzarHechizos(Personaje personaje, String hechizo) throws JuegoRolException {
        float vidaActualDañada = 0;
        if (nombreHechizos.contains(hechizo)){
            vidaActualDañada = personaje.getPuntoVidaActual_personaje() - 10;
            nombreHechizos.remove(hechizo);
            System.out.println("Hechizo olvidado!");
        }else {
            throw new JuegoRolException("Error, datos no validos");
        }
        System.out.println("Personaje " + personaje.getNombre() + "su vida actual es de: "+ vidaActualDañada);
    }

}
