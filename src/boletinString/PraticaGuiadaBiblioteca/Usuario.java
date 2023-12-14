package boletinString.PraticaGuiadaBiblioteca;

import java.util.Objects;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String dni;
    private String numSocio;

    public Usuario(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public void setNumSocio(String numSocio) {
        this.numSocio = numSocio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(dni, usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
