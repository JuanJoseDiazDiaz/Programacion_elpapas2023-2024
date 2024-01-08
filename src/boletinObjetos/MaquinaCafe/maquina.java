package boletinObjetos.MaquinaCafe;

public class maquina {
    public static final int CAP_MAX_DEPOSITO_CAFE = 50;
    public static final int CAP_MAX_DEPOSITO_LECHE = 50;
    public static final int CAP_MAX_DEPOSITO_VASOS = 80;
    public static final double MONEDERO_INICIAL = 10;
    public static final double PRECIO_CAFE = 1;
    public static final double PRECIO_LECHE = 0.8;
    public static final double PRECIO_CAFE_LECHE = 1.5;

    private int cafeRestante;
    private int lecheRestante;
    private int vasosRestante;
    private double monederoIncial;

    public maquina() {
        rellenarDeposito();
        monederoIncial = MONEDERO_INICIAL;
    }
public void rellenarDeposito(){
        cafeRestante = CAP_MAX_DEPOSITO_CAFE;
        lecheRestante = CAP_MAX_DEPOSITO_LECHE;
        vasosRestante = CAP_MAX_DEPOSITO_VASOS;
}
    //QUIERO CAMBIARLO A DOUBLE EL METODO
    public static void ServirCafe (double dineroActual){
        double costeCafe = 1;
        System.out.println("El precio del cafe solo es de 1€");
        double resultado = dineroActual - costeCafe;
        System.out.println("Aqui tienes su cafe");
        if (dineroActual < resultado){
            System.out.println("aqui tiene su cambio");
        }
    }
}

