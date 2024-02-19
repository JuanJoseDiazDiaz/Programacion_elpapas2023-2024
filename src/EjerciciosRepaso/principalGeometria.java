package boletinRepasoExamen.Avion.EjerciciosRepaso;

public class principalGeometria {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        figuraGeometrica [] figuraGeometricas ={circulo, rectangulo, triangulo};
        EmpiezaAreaPerimetro(figuraGeometricas);
    }
    public static void EmpiezaAreaPerimetro(figuraGeometrica[] figuraGeometricas){
        for (figuraGeometrica f : figuraGeometricas ){
            f.playgame();
        }

    }
}
