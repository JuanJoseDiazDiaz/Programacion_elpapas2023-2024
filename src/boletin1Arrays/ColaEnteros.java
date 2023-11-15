package boletin1Arrays;

import java.util.Arrays;

public class ColaEnteros {
    private static final int TAMANO_MAXIMO = 10;
    private int[] cola;
    private int frente;
    private int fin;
    private int tamaño;

    public ColaEnteros() {
        cola = new int[TAMANO_MAXIMO];
        frente = -1;
        fin = -1;
        tamaño = 0;
    }

    public void encolar(int elemento) {
        if (tamaño < TAMANO_MAXIMO) {
            if (frente == -1) {
                frente = 0;
            }
            fin = (fin + 1) % TAMANO_MAXIMO;
            cola[fin] = elemento;
            tamaño++;
            mostrarCola();
        } else {
            System.out.println("La cola está llena, no puedo encolar el elemento " + elemento);
        }
    }

    public void desencolar() {
        if (tamaño > 0) {
            int elementoDesencolado = cola[frente];
            frente = (frente + 1) % TAMANO_MAXIMO;
            tamaño--;
            System.out.println("Elemento desencolado: " + elementoDesencolado);
            mostrarCola();
        } else {
            System.out.println("No hay elementos en la cola");
        }
    }

    public void mostrarCola() {
        System.out.print("Cola -> [");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(cola[(frente + i) % TAMANO_MAXIMO]);
            if (i < tamaño - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ColaEnteros cola = new ColaEnteros();

        cola.encolar(3);
        cola.encolar(12);
        cola.desencolar();
        cola.desencolar();
        cola.desencolar();

        // Imagina el siguiente estado
        cola.encolar(3);
        cola.encolar(5);
        cola.encolar(8);
        cola.encolar(0);
        cola.encolar(-1);
        cola.encolar(222);
        cola.encolar(9);
        cola.encolar(44);
        cola.encolar(3);
        cola.encolar(1);
        cola.encolar(23);
    }
}

