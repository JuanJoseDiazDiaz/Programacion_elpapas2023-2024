package boletinRepasoExamen.Avion.EjerciciosRepaso;

import java.util.Scanner;

public class Circulo implements figuraGeometrica{
    Scanner teclado = new Scanner(System.in);
    private int diametro;
    private int radio;

    @Override
    public void playgame() {
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        System.out.println("Area del Circulo");
        System.out.println("Introduce el radio: ");
        radio = teclado.nextInt();
        double Resultado = (radio * radio) * 3.14;
        System.out.println("Este es el area del circulo: "+Resultado);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro del Circulo");
        System.out.println("Introduce el perimetro: ");
        diametro = teclado.nextInt();
        double resultadoP = diametro * 3.14;
        System.out.println("Este es el resultado del perimetro: "+ resultadoP);
    }
}
