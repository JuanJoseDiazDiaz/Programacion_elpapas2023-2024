package boletinObjetos.Aviones;

import java.util.Scanner;

public class Deposito {
    Scanner teclado = new Scanner(System.in);
    private double capacidadMAX;
    private double estadoActual;

    public Deposito(double capacidadMAX, double estadoActual) {
        this.capacidadMAX = capacidadMAX;
        setEstadoActual(estadoActual);
    }

    public void setEstadoActual(double estadoActual) {
        if (estadoActual < capacidadMAX && estadoActual > 0) {
            this.estadoActual = estadoActual;
        }
    }

    public double getCapacidadMAX() {
        return capacidadMAX;
    }

    public double getEstadoActual() {
        return estadoActual;
    }

    @Override
    public String toString() {
        return estadoActual /capacidadMAX * 100 + "% de un deposito de litros";
    }
}
