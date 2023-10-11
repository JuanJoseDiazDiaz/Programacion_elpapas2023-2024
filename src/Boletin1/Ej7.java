package Boletin1;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String estadoCivil;

        int edad;
        do {
            System.out.println(" si introduces salir puedes salir");
            System.out.println("introduce tu estado civil:(S-Soltero, CCasado, V-Viudo y D-Divorciado");
            estadoCivil = teclado.nextLine();
            System.out.println("introduce tu edad ");
            edad = teclado.nextInt();
            if (estadoCivil == "Salir" || estadoCivil =="salir"){
                System.out.println("ADIOS CHAVAL");
                break;
            }
        } while (estadoCivil == "Salir" || estadoCivil =="salir");

        if (estadoCivil == "C" || estadoCivil == "V"){
            if (edad < 35 ){
                System.out.println(" tiene un porcentaje de 11.3%");
            }
        }
        if (estadoCivil == "S" || estadoCivil == "D"){
            if (edad < 35) {
                System.out.println("tiene un porcentaje de 12%");

            }
        }
        if (edad > 50 ){
            System.out.println("tiene un porcentaje de 8.5%");
        }
        if (edad < 0 || edad > 100){
        }



    }
}
