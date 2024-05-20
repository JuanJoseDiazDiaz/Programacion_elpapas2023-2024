package GestionGranja;

public class Animal {
    private int idAnimal;
    private  AnimalesGranja animalesGranja;
    private String tipoAlimentacion;
    private int edad;
    private int salud;

    public Animal(int idAnimal, AnimalesGranja animalesGranja, String tipoAlimentacion, int edad, int salud) {
        this.idAnimal = idAnimal;
        this.tipoAlimentacion = tipoAlimentacion;
        this.edad = edad;
        this.salud = salud;
    }

    public int getRegistroIdAnimal() {
        return idAnimal;
    }

    public String getAlimentacionTipoAnimales() {
        return tipoAlimentacion;
    }

    public int getCheckSalud() {
        return salud;
    }


}
