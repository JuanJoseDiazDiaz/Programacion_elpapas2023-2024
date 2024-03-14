package boletinRepasoExamen.Avion.EjerciciosRepaso.EjercicioHospital;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Hospital {

    LinkedList<Paciente> colaPaciente;

    public Hospital() {
        this.colaPaciente = new LinkedList<>();
    }

    public void addNuevoPaciente(Paciente nuevoPaciente) {
        int posPaciente = 0;
        boolean posEncontrada = false;
        Iterator<Paciente> it = colaPaciente.iterator();
        while (it.hasNext() && !posEncontrada){
            colaPaciente.add(nuevoPaciente);
            Paciente paciente = it.next();
            if (nuevoPaciente.compareTo(paciente) < 0){
                posEncontrada = true;
            }else {
                posPaciente++;
            }

        }
    }

    public LinkedList<Paciente> listadoPacientes(){
        LinkedList<Paciente> list = (LinkedList<Paciente>) colaPaciente.stream().sorted((a, b) -> a.getPrioridadPaciente() - b.getPrioridadPaciente()).toList();
        return list;
    }

    public void atenderPaciente() throws HospitalException {
        if (!colaPaciente.isEmpty()){
            Paciente pacienteAAtender = colaPaciente.poll();
            System.out.println("Paciente a atender:");
            System.out.println("DNI: " + pacienteAAtender.getDniPaciente());
            System.out.println("Nombre: " + pacienteAAtender.getNombrePaciente());
            System.out.println("Edad: " + pacienteAAtender.getEdadPaciente());
            System.out.println("Prioridad: " + pacienteAAtender.getPrioridadPaciente());
            System.out.println("Hora De Llegada: " + pacienteAAtender.getOrdenDeLLegada());
        }else {
            throw new HospitalException("No hay pacientes en espera.");
        }

    }

    public void datosEstadisticos(){
        int recuentoPaciente = 0;
        for (Paciente paciente1 : colaPaciente) {
            Paciente paciente = colaPaciente.poll();
            if (paciente.compareTo(paciente1) < 0) {
                recuentoPaciente++;
            }
        }
        System.out.println("Los pacientes que hay en la cola son: " + recuentoPaciente);
    }
    public LinkedList<Paciente> listadoPacientesOrdenadosPorEdad(){
        return (LinkedList<Paciente>) colaPaciente.stream().sorted((a, b) -> a.getEdadPaciente() - b.getEdadPaciente()).toList();
    }
    public void menuHospital() throws HospitalException {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Nuevo paciente");
            System.out.println("2. Listado de pacientes por el orden en que se atenderán");
            System.out.println("3. Atender a un paciente");
            System.out.println("4. Datos Estadísticos");
            System.out.println("5. Listado de pacientes a atender ordenados por la edad");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese DNI del paciente:");
                    int dni = scanner.nextInt();
                    System.out.println("Ingrese nombre del paciente:");
                    String nombre = scanner.next();
                    System.out.println("Ingrese edad del paciente:");
                    int edad = scanner.nextInt();
                    System.out.println("Ingrese prioridad del paciente (1-5):");
                    int prioridad = scanner.nextInt();
                    System.out.println("Ingrese la hora de llegada al hospital:");
                    int horaDeLlegada = scanner.nextInt();
                    Paciente nuevoPaciente = new Paciente(dni, nombre, edad, prioridad,horaDeLlegada);
                    addNuevoPaciente(nuevoPaciente);
                    break;
                case 2:
                    System.out.println("Listado de pacientes por el orden en que se atenderán:");
                    listadoPacientes();
                    break;
                case 3:
                    atenderPaciente();
                    break;
                case 4:
                   datosEstadisticos();
                    break;
                case 5:
                    listadoPacientesOrdenadosPorEdad();
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }
}