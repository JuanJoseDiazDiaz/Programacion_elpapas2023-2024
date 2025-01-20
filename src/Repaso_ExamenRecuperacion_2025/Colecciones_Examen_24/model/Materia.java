package Repaso_ExamenRecuperacion_2025.Colecciones_Examen_24.model;



import Repaso_ExamenRecuperacion_2025.Colecciones_Examen_24.exceptions.CursoException;

import java.util.Objects;

public class Materia {
    private String nombre;
    private boolean obligatoria;

    public Materia(String nombre, boolean obligatoria) throws CursoException {
        setNombre(nombre);
        this.obligatoria = obligatoria;
    }

    public String getNombre() {
        return this.nombre;
    }

    /* Este metodo lo que hará es determinar si es optativa o obligatoria
    * */
    public boolean isObligatoria() {
      if (!this.obligatoria) {
          System.out.println("Es Optativa");
      }
      return this.obligatoria;
    }

    public void setNombre(String nombre) throws CursoException {
        if (nombre == null || nombre.isEmpty()) {
            throw new CursoException("El nombre es obligatorio");
        }
        this.nombre = nombre;
    }
}
