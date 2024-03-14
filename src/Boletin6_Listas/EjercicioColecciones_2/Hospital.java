package Boletin6_Listas.EjercicioColecciones_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Stream;

public class Hospital {
    LinkedList<Paciente> colaPaciente;

    public Hospital() {
        this.colaPaciente = new LinkedList<>();
    }

    public void addNuevoPaciente(Paciente nuevoPaciente) throws HospitalException {
        int posPaciente = 0;
        boolean posEncontrada = false;
        Iterator<Paciente> it = colaPaciente.iterator();
        while (it.hasNext() && !posEncontrada){
          Paciente paciente = it.next();
          if ( nuevoPaciente.compareTo(paciente) < 0){
              posEncontrada = true;
          }else {
              posPaciente++;
          }

        }

    }
}
