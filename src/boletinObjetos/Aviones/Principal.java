package boletinObjetos.Aviones;

import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        Deposito d = new Deposito(200.000, 180.000);
        Avion a = new Avion("A230","AIRBUS", d, 13);
        a.addRevision(new Revision(LocalDateTime.of(2021, 10, 9, 20, 30 ), true, 10));
        System.out.println(a);
        System.out.println(a.puedeVolar(150000)? "Puedes recorrer esa distancia " : "No puede volar");
    }
}
