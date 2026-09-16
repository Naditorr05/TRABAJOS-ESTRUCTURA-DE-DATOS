import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ConsultorioMedico {

    public static void main(String[] args) {
        
        // Lista de pacientes en orden de llegada
        List<String> pacientes = new ArrayList<>();
        pacientes.add("Ana");
        pacientes.add("Luis");
        pacientes.add("María");
        pacientes.add("Carlos");
        pacientes.add("Sofía");

        // Reporte inicial: posición de cada paciente
        System.out.println(" Reporte de posiciones en orden de llegada:");
        int posicion = 1;
        for (String paciente : pacientes) {
            System.out.println("Posición " + posicion + ": " + paciente);
            posicion++;
        }

        // Reporte en orden inverso (últimos primero)
        System.out.println("\n Reporte en orden inverso (más recientes primero):");
        ListIterator<String> iteradorInverso = pacientes.listIterator(pacientes.size());
        while (iteradorInverso.hasPrevious()) {
            System.out.println("Paciente: " + iteradorInverso.previous());
        }

        // Inserción de paciente de urgencia después del segundo en la fila
        System.out.println("\n Insertando paciente de urgencia...");
        ListIterator<String> iterador = pacientes.listIterator();
        int contador = 0;
        while (iterador.hasNext()) {
            iterador.next();
            contador++;
            if (contador == 2) { 
                iterador.add("Paciente de Urgencia");
                break;
            }
        }

        // Confirmación del orden final
        System.out.println("\n Fila final con paciente de urgencia incluido:");
        posicion = 1;
        for (String paciente : pacientes) {
            System.out.println("Posición " + posicion + ": " + paciente);
            posicion++;
        }

        // Explicación breve
        System.out.println("\n El paciente de urgencia terminó en la posición 3, " +
                           "porque fue insertado justo después del segundo paciente en la fila.");
    }
}
