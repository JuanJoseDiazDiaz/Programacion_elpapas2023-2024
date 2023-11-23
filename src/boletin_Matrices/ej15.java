package boletin_Matrices;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
      int [][] matriz =  {
              {1,  2,  3,   4,  5,  6},
              {7,  8,  9,  10, 11, 12},
              {13, 14, 15, 16, 17, 18},
              {19, 20, 21, 25, 23, 24},
              {25, 26, 27, 28, 29, 30}
      };
        Scanner teclado = new Scanner(System.in);
        int fila;
        do {
            System.out.println("Introduce la fila empezando en 0 (la matriz tiene "+ matriz.length+" filas): ");
            fila = teclado.nextInt();
        }while (fila < 0 || fila >= matriz.length);

        int columna;
        do {
            System.out.printf("Introduce la columna empezando en 0 (la matriz tiene "+ matriz[0].length+" filas): ");
            columna = teclado.nextInt();
        }while (columna < 0 || columna >= matriz[0].length);

        int posicion = obtenerPosicion(matriz, fila, columna);
        System.out.printf("Esta entre las casillas %d y %d, la posición que ocupa es: %d", fila, columna, posicion);
    }
    public static int obtenerPosicion (int [][] matriz, int fila , int columnas){
        return (fila * matriz[0].length) + columnas + 1;
    }
}
