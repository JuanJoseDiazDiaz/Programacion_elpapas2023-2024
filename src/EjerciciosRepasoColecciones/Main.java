package EjerciciosRepasoColecciones;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear una instancia de la biblioteca
            Biblioteca biblioteca = new Biblioteca();

            // Crear algunos libros
            Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 123);
            Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 456);
            Libro libro3 = new Libro("Don Quijote", "Miguel de Cervantes", 789);
            Libro libro4 = new Libro("1984", "George Orwell", 101112);
            Libro libro5 = new Libro("Matar a un ruiseñor", "Harper Lee", 131415);

            // Añadir libros a la biblioteca
            biblioteca.addLibros(libro1);
            biblioteca.addLibros(libro2);
            biblioteca.addLibros(libro3);
            biblioteca.addLibros(libro4);
            biblioteca.addLibros(libro5);

            // Intentar añadir un libro duplicado
            try {
                biblioteca.addLibros(libro1);
            } catch (LibroException e) {
                System.out.println(e.getMessage());
            }

            // Eliminar un libro por ISBN
            biblioteca.removeLibros(libro1);

            // Buscar libros por autor
            List<Libro> librosDeCervantes = biblioteca.listadoDeLibrosPorAutor("Miguel de Cervantes");
            System.out.println("Libros de Miguel de Cervantes:");
            for (Libro libro : librosDeCervantes) {
                System.out.println(libro.getTitulo() + " - " + libro.getIsbn());
            }

            // Listar todos los libros
            biblioteca.listadoDeTodosLibros();


        } catch (LibroException e) {
            System.out.println(e.getMessage());
        }
    }
}
