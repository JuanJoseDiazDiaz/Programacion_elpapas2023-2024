package boletinRepasoExamen.Avion.EjerciciosRepaso;

import java.util.Scanner;

public class Triangulo implements figuraGeometrica{
    Scanner teclado = new Scanner(System.in);
    private int lado1;
    private int lado2;
    private int lado3;
    private int base;
    private int altura;

    @Override
    public void playgame() {
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        System.out.println("Area del Triangulo");
        System.out.println("Introduce los lados: ");
       base = teclado.nextInt();
       altura = teclado.nextInt();
        int areaTriangulo = (base * altura)/2;
        System.out.println("esta es el area de un triangulo :"+ areaTriangulo);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro del Triangulo");
        System.out.println("Introduce los lados: ");
        lado1 = teclado.nextInt();
        lado2 = teclado.nextInt();
        lado3 = teclado.nextInt();
        int perimetroTriangulo = lado1 + lado2 + lado3;
        System.out.println("esta es el perimetro de un triangulo :"+ perimetroTriangulo);
    }
}
