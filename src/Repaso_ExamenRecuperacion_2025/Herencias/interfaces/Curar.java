package Repaso_ExamenRecuperacion_2025.Herencias.interfaces;

import Repaso_ExamenRecuperacion_2025.Herencias.expections.JuegoRolException;
import Repaso_ExamenRecuperacion_2025.Herencias.model.Personaje;

public interface Curar {
    public void curar(Personaje personaje) throws JuegoRolException;
}
