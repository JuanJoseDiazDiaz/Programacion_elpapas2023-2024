package GestionGranja;

import java.util.ArrayList;
import java.util.List;

public class Granja {
    private String nombreGranja;
    private List<Animal> listaAnimales;

    public Granja(String nombreGranja) {
        this.nombreGranja = nombreGranja;
        this.listaAnimales = new ArrayList<>();
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }


    public void addAnimal(int idAnimal, AnimalesGranja animalesGranja, String tipoAlimentacion, int edad, int salud){
        Animal a = new Animal(idAnimal, animalesGranja, tipoAlimentacion, edad, salud);
        listaAnimales.add(a);
    }

    public List<Animal> registrarAlimentacion(){
      return listaAnimales.stream().filter(animal -> Boolean.parseBoolean(animal.getAlimentacionTipoAnimales())).toList();
    }

    public List<Animal> checkSaludAnimal(){
        return listaAnimales.stream().filter(animal -> animal.getCheckSalud() > 0).toList();
    }

}
