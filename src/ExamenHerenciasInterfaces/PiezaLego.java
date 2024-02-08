package ExamenHerenciasInterfaces;

public class PiezaLego extends JueguetePlastico implements Apilable{
    private  int longitud;
    private  String color;

    public PiezaLego(String marca, String nombre, double precio, TPlastico pvc, int longitud,  String color) throws JuegueteException {
        super(marca, nombre, precio, TPlastico.ABS);
        setLongitud(longitud);
        this.color = color;

    }

    public void setLongitud(int longitud) throws JuegueteException {
        if (longitud < 1 ){
            throw  new  JuegueteException("Longitud incorrecta");
        }
        this.longitud = longitud;
    }
    @Override
    public void apilar(Jueguete jueguete) throws JuegueteException {
        Apilable.super.apilar(jueguete);
        System.out.println("Se han apilado los juguetes "+ jueguete.getNombre() + " sobre el jueguete "+ this.getNombre());
    }
}
