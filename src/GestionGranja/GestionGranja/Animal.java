package GestionGranja;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Animal {
    private int idAnimal;
    private  String nombreAnimal;
    private  AnimalesGranja animalesGranja;
    private String tipoAlimentacion;
    private int edad;
    private int salud;

    private List<String> listaRegistroAlimentacion;
    private List<String> listaRegistroChequeos;

    public Animal(int idAnimal, String nombreAnimal, AnimalesGranja animalesGranja, String tipoAlimentacion, int edad, int salud) {
        this.idAnimal = idAnimal;
        this.nombreAnimal = nombreAnimal;
        this.animalesGranja = animalesGranja;
        this.tipoAlimentacion = tipoAlimentacion;
        this.edad = edad;
        this.salud = salud;
        this.listaRegistroAlimentacion = new ArrayList<>();
        this.listaRegistroChequeos = new ArrayList<>();
    }

    public int getRegistroIdAnimal() {
        return idAnimal;
    }

    public void registrarAlimentacion() {
        int idAnimal = MiEntradaSalida.Lectora.leerEnteroPositivo("introduce el id del Animal: ");
        String tipoAlimento = MiEntradaSalida.Lectora.solicitarCadenaMinus("introduce el tipo de alimento del Animal: ");
        listaRegistroAlimentacion.add("Id del Animal: " + idAnimal + ", Tipo de alimento: " + tipoAlimento);
    }
    public void registrarChequeo() {
        int idAnimal = MiEntradaSalida.Lectora.leerEnteroPositivo("introduce el id del Animal: ");
        int salud = MiEntradaSalida.Lectora.leerEnteroPositivo("introduce cuanto tiene de salud su animal: ");
        listaRegistroChequeos.add("Id del Animal: " + idAnimal + ", La Salud del animal es: " + salud);
    }


    public List<String> getListaRegistroAlimentacion() {
        return listaRegistroAlimentacion;
    }

    public List<String> getListaRegistroChequeos() {
        return listaRegistroChequeos;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal=" + idAnimal +
                ", nombreAnimal='" + nombreAnimal + '\'' +
                ", animalesGranja=" + animalesGranja +
                ", tipoAlimentacion='" + tipoAlimentacion + '\'' +
                ", edad=" + edad +
                ", salud=" + salud +
                '}';
    }
}
