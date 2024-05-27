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


    public void addAnimal(int idAnimal,String nombreAnimal, AnimalesGranja animalesGranja, String tipoAlimentacion, int edad, int salud){
        Animal a = new Animal(idAnimal,nombreAnimal, animalesGranja, tipoAlimentacion, edad, salud);
        listaAnimales.add(a);
    }

    public void registrarAlimentacion(Animal a){
      for (Animal animal : listaAnimales){
          if (animal.equals(a)){
              animal.registrarAlimentacion();
              System.out.println("Alimentación registrada para " + a.getNombreAnimal());
              return;
          }
      }
        System.out.println("Animal no encontrado: " + a.getNombreAnimal());
    }

    public void checkSaludAnimal(Animal a){
        for (Animal animal : listaAnimales){
            if (animal.equals(a)){
                animal.registrarChequeo();
                System.out.println("Chequeo registrado para " + a.getNombreAnimal());
                return;
            }
        }
        System.out.println("Animal no encontrado: " + a.getNombreAnimal());
    }

}
