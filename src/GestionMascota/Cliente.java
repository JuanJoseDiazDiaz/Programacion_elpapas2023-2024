package GestionMascota;

import java.util.Objects;

public class Cliente {
    private String nombreCliente;
    private int idCliente;
    private static int cont = 0;

    public Cliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.idCliente = cont++;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idCliente == cliente.idCliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}


