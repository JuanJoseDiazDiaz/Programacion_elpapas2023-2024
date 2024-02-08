package ExamenHerenciasInterfaces;

public abstract class JugueteMadera extends Jueguete{
    private String paisOrigen;
    private int year;
    public JugueteMadera(String marca, String nombre, double precio, String paisOrigen, int year) throws JuegueteException {
        super(marca, nombre, precio);
        this.paisOrigen = paisOrigen;
        setYear(year);
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws JuegueteException {
        if (year < 0 ){
            throw new JuegueteException("Ano Incorrecto");
        }
        this.year = year;
    }
}
