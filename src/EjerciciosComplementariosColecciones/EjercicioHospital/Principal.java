package EjerciciosComplementariosColecciones.EjercicioHospital;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {
    static List<Paciente> listaColaHospital = new ArrayList<>();
    private static int cont = 0;

    public static void main(String[] args) {
        //Progreso De datos:
        //Añadiendo Paciente a la lista:
        addPaciente();
        addPaciente();


        //Listar De pacientes Por Orden de Prioridad:
        listarPacientesPorOrdenPrioridad();


        //Datos Estadisticos
        listaHospital();

        //Listado de pacientes por edad
        listPacientesOrdenadosPorEdad();


    }

    public static void addPaciente() {
        int dni = MiEntradaSalida.Lectora.leerEnteroPositivo("Introduce tu dni");
        String nombrePaciente = MiEntradaSalida.Lectora.leerCadena("Introduce tu nombre");
        int edad = MiEntradaSalida.Lectora.leerEnteroPositivo("Introduce tu edad");
        int prioridadPaciente = MiEntradaSalida.Lectora.leerEnteroPositivo("Introduce tu estado de mal de 1-5");
        int horaLlegada = MiEntradaSalida.Lectora.leerEnteroPositivo("Introduce tu hora de llegada");
        Paciente paciente = null;
        try {
            paciente = new Paciente(dni, nombrePaciente, edad, prioridadPaciente, horaLlegada);
        } catch (ProblemaPacienteException e) {
            System.out.println(e.getMessage());
        }
        listaColaHospital.add(paciente);
        System.out.println("Ha sido añadido");

        atenderPaciente(paciente);
    }

    public static List<Paciente> listarPacientesPorOrdenPrioridad() {
        List<Paciente> listPacientesPrioridad = new ArrayList<>(listaColaHospital);
        listPacientesPrioridad.sort((paciente1, paciente2) -> paciente1.getPrioridadPaciente() - paciente2.getPrioridadPaciente());
        return listPacientesPrioridad;
    }

    public static void atenderPaciente(Paciente paciente) {
        Iterator<Paciente> iterator = listaColaHospital.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() == paciente) {
                System.out.println(paciente);
                cont++;
                System.out.println("El paciente esta siendo atendido");
            }
        }

    }

    public static void listaHospital() {
        System.out.println(listaColaHospital.size() - cont);
    }

    public static List<Paciente> listPacientesOrdenadosPorEdad() {
        List<Paciente> listOrdenadoPorEdad = listaColaHospital.stream().sorted((a, b) -> a.getEdad() - b.getEdad()).toList();
        return listOrdenadoPorEdad;
    }
}
