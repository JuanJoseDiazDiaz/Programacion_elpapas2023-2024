<<<<<<< HEAD
package boletin5;
=======
package boletin4;
>>>>>>> origin/master

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner teclado = new Scanner(System.in);
        System.out.println("los siguientes son salidas esperadas para las entradas: ");
        System.out.println("introduce hora base: ");
        int horaBase = teclado.nextInt();
        System.out.println("introduce los minutos base: ");
        int minBase = teclado.nextInt();
        System.out.println("introduce los segundos base: ");
        int segBase = teclado.nextInt();
        System.out.println("¿Cuántas horas quieres sumar?");
        int horasSumar = teclado.nextInt();
        System.out.println("¿Cuántos minutos quieres sumar?");
        int minSumar = teclado.nextInt();
        System.out.println("¿Cuántos segundos quieres sumar?");
        int segSumar = teclado.nextInt();

        horaBase = horaBase + horasSumar;
        minBase = minSumar + minBase;
        segBase = segBase + segSumar;
        while(segBase <59){
            minBase = minBase + 1;
            segBase = segBase -60;
        }
        while (minBase <59){
            horaBase = horaBase +1;
            minBase = minBase -60;
        }
        if (horaBase > 23){
            while (horaBase > 23){
                horaBase = horaBase -24;
            }
        }

        System.out.println("La hora resultante es: "+ (horaBase+horasSumar) + ":" + (minBase+minSumar)+ ":" + (segBase+segSumar));
    }
}
=======
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
>>>>>>> origin/master
