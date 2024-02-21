package boletinRepasoExamen.Avion.EjerciciosRepaso.GestionBiblioteca;

public class Biblioteca{
    public void prestarElemento(ElementoBibliotecaAbstracto objeto) {
        if (objeto.isPrestado()){
            System.out.println("El "+objeto.getTitulo()+" no ha sido prestado");
        } else {
            objeto.prestar();
            System.out.println("El "+objeto.getTitulo()+" ha sido prestado");
        }

    }
    public void devolverElemento(ElementoBibliotecaAbstracto objeto)  {
        if (objeto.isPrestado()){
            System.out.println("El "+objeto.getClass().getSimpleName()+" no ha sido devuelto");
        } else {
            objeto.devuelto();
            System.out.println("El "+objeto.getClass().getSimpleName()+" ha sido devuelto");
        }
    }


}
