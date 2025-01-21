package Repaso_ExamenRecuperacion_2025.Herencias.interfaces;

import Repaso_ExamenRecuperacion_2025.Herencias.expections.JuegoRolException;
import Repaso_ExamenRecuperacion_2025.Herencias.model.Personaje;

public interface Lanzar {
    public void lanzarHechizo(Personaje personaje, String hechizo) throws JuegoRolException;
}
