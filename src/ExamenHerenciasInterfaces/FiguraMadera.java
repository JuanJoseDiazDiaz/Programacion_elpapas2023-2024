package ExamenHerenciasInterfaces;

public abstract class FiguraMadera extends Jueguete implements Apilable{
    private String color;
    private int numLados;

    public FiguraMadera(String marca, String nombre, double precio,String color, int numLados) throws JuegueteException {
        super(marca, nombre, precio);
        this.color = color;
        setNumLados(numLados);
    }

    public void setNumLados(int numLados) throws JuegueteException {
        if (numLados < 2){
            throw new JuegueteException("Numero de lados inferior");
        }
        this.numLados = numLados;
    }

    @Override
    public void apilar(Jueguete jueguete) throws JuegueteException {
       Apilable.super.apilar(jueguete);
        System.out.println("Se han apilado los juguetes "+ jueguete.getNombre() + " sobre el jueguete "+ this.getNombre());
    }
}
