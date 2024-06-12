package EjerciciosRepasoColecciones.GestionEstudiante;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SistemaEstudiante sistema = new SistemaEstudiante();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Añadir estudiante");
            System.out.println("2. Asignar nota a estudiante");
            System.out.println("3. Calcular promedio de estudiante");
            System.out.println("4. Listar todos los estudiantes y sus promedios");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el ID del estudiante: ");
                    int id = scanner.nextInt();
                    Estudiante estudiante = new Estudiante(nombre, id);
                    try {
                        sistema.addEstudiante(estudiante);
                    } catch (SistemaAlumadoException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    System.out.print("Introduce el ID del estudiante: ");
                    int id2 = scanner.nextInt();
                    System.out.print("Introduce la nota: ");
                    int nota = scanner.nextInt();
                    try {
                        sistema.asignarNotaAlumno(id2, nota);
                    } catch (SistemaAlumadoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    sistema.mediaEstudiante();
                    break;
                case 4:
                    sistema.estudianteList();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
