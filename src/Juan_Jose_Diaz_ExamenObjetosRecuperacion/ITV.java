package Juan_Jose_Diaz_ExamenObjetosRecuperacion;

import Boletin6_Listas.Ejercicio6.Caja;

public class ITV {
    public static void main(String[] args) {
        //TODO -> COCHE NO ARRANCA
        System.out.println("Coche 1 -> ");
        Coche coche = new Coche("Opel", "Vestra", ColoresCoche.BLANCO, new Motor("renaul", "434", "sgsdgs33", 97, 100.000, 50, 96), new Bateria(50, 12, 14), new DepositoGasolina(100, 60, true), new CajaCambios(7));
        coche.arrancarCoche();
        System.out.println(coche);

        //TODO -> COCHE QUE ARRANCA
        System.out.println("\n");
        System.out.println("Coche 2 -> ");
        Coche coche2 = new Coche("ferrari", "F1", ColoresCoche.NEGRO, new Motor("ferrarri", "434", "sgsdgs33", 97, 100.000, 90, 96), new Bateria(50, 12, 14), new DepositoGasolina(100, 60, true), new CajaCambios(7));
        coche2.arrancarCoche();
        System.out.println(coche2);


        //TODO -> COCHE NO ARRANCA
        System.out.println("\n");
        System.out.println("Coche 3 -> ");
        Coche coche3 = new Coche("Ford", "ka", ColoresCoche.AMARILLO, new Motor("Ford", "434", "sgsdgs33", 97, 100.000, 90, 96), new Bateria(50, 10, 14), new DepositoGasolina(100, 60, false), new CajaCambios(7));
        coche3.arrancarCoche();
        System.out.println(coche3);
        
    }


}
