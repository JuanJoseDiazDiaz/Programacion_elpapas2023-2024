package Avion;

import java.time.LocalDateTime;
import java.util.Scanner;

public class depositoCombustible {
    Scanner teclado = new Scanner(System.in);
    private double capacidadMAX;
    private double estadoActual;

    public depositoCombustible(double capacidadMAX, double estadoActual) {
        this.capacidadMAX = capacidadMAX;
        setEstadoActual(estadoActual);
    }

    public depositoCombustible(LocalDateTime of, boolean b, int i) {
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
        return estadoActual / capacidadMAX * 100 + "% de un deposito de litros";
    }
}

