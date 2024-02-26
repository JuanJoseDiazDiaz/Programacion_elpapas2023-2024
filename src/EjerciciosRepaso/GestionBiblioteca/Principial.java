package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionBiblioteca;

public class Principial {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos libros y revistas
        libros libro1 = new libros("El principito", "Antoine de Saint-Exupéry");
        libros libro2 = new libros("Harry Potter y la piedra filosofal", "J.K. Rowling");
        Revista revista1 = new Revista("National Geographic", "Jane Goodall");
        Revista revista2 = new Revista("Time", "Edward Felsenthal");

        // Prestar algunos elementos
        biblioteca.prestarElemento(libro1);
        biblioteca.prestarElemento(libro2);
        biblioteca.prestarElemento(revista1);

        // Intentar prestar un elemento que ya está prestado
        biblioteca.prestarElemento(libro1);

        // Devolver algunos elementos
        biblioteca.devolverElemento(libro1);
        biblioteca.devolverElemento(libro2);

        // Intentar devolver un elemento que no está prestado
        biblioteca.devolverElemento(libro1);
    }


}
