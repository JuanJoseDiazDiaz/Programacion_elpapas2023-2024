package Avion;

import java.time.LocalDateTime;

public class avionPrincipal {
    public static void main(String[] args) {
        depositoCombustible d = new depositoCombustible(200.000, 180.000);
        avion a = new avion("A230","AIRBUS", 13, d);
        a.addRevision(new registroRevisiones(LocalDateTime.of(2022,12,21,1,20), true, 10));
        System.out.println(a);
        System.out.println(a.puedeVolar(150000)? "Puedes recorrer esa distancia " : "No puede volar");
    }
}
