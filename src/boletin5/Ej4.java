package boletin4;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                System.out.print("Introduce la hora base: ");
                int horaBase = scanner.nextInt();
                System.out.print("Introduce los minutos base: ");
                int minutosBase = scanner.nextInt();
                System.out.print("Introduce los segundos base: ");
                int segundosBase = scanner.nextInt();


                System.out.print("¿Cuántas horas quieres sumar?: ");
                int horasASumar = scanner.nextInt();
                System.out.print("¿Cuántos minutos quieres sumar?: ");
                int minutosASumar = scanner.nextInt();
                System.out.print("¿Cuántos segundos quieres sumar?: ");
                int segundosASumar = scanner.nextInt();


                int segundosTotalesBase = horaBase * 3600 + minutosBase * 60 + segundosBase;
                int segundosTotalesASumar = horasASumar * 3600 + minutosASumar * 60 + segundosASumar;
                int segundosTotalesResultantes = segundosTotalesBase + segundosTotalesASumar;


                int nuevaHora = (segundosTotalesResultantes / 3600) % 24;
                int nuevosMinutos = (segundosTotalesResultantes % 3600) / 60;
                int nuevosSegundos = segundosTotalesResultantes % 60;


                System.out.printf("La hora resultante es: %02d:%02d:%02d\n", nuevaHora, nuevosMinutos, nuevosSegundos);


                if (segundosTotalesResultantes >= 86400) {
                    System.out.println("La hora resultante es del día siguiente");
                }
            }
        }
