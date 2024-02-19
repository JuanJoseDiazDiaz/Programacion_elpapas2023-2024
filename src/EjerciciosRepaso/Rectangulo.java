package boletinRepasoExamen.Avion.EjerciciosRepaso;

import java.util.Scanner;

public class Rectangulo implements figuraGeometrica{
    Scanner teclado = new Scanner(System.in);
    private int largo;
    private int ancho;

    @Override
    public void playgame() {
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        System.out.println("Area del Rectangulo");
        System.out.println("Introduce el largo y el ancho");
        largo = teclado.nextInt();
        ancho = teclado.nextInt();
        int areaRectangulo = largo * ancho;
        System.out.println("esta es el area de un rectangulo :"+ areaRectangulo);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro del Rectangulo");
        System.out.println("Introduce el largo y el ancho");
        largo = teclado.nextInt();
        ancho = teclado.nextInt();
        int perimetroRectangulo = (largo + ancho) ^ 2;
        System.out.println("esta es el perimetro de un rectangulo :"+ perimetroRectangulo);
    }
}
