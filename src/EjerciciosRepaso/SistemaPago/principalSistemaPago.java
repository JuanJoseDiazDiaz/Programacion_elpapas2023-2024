package boletinRepasoExamen.Avion.EjerciciosRepaso.SistemaPago;

public class principalSistemaPago {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Pagable [] pagables = {empleado};
        PagoEmpieza(pagables);
    }

    public static void PagoEmpieza(Pagable[] pagables){
        for (Pagable p :pagables){
            p.playGame();
        }
    }
}
