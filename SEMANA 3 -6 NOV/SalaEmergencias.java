import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

// Clase Paciente: va en el mismo archivo, sin "public"
class Paciente implements Comparable<Paciente> {
    // PASO 1: atributos, constructor y getters
    private String nombre;
    private int gravedad;

    public Paciente(String nombre, int gravedad){
        this.nombre = nombre;
        this.gravedad = gravedad;

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getGravedad(){
        return gravedad;
    }
    public void setGravedad(int gravedad){
        this.gravedad = gravedad;
    }

    // PASO 2: getGravedadTexto() y toString()
    public String getGravedadTexto(){
        switch (gravedad) {
            case 1:
                return "Leve";
            case 2:
                return "Moderado";
            case 3:
                return "Grave";
            case 4:
                return "Muy grave";
        
            default:
                return "Desconocido";
        }
    }
    @Override
    public String toString(){
        return "Paciente " + nombre + " en estado " + getGravedadTexto();
    }

    // PASO 5: compareTo()
    @Override
    public int compareTo(Paciente otro) {
        // TODO: completa esta línea
        return Integer.compare(otro.gravedad, this.gravedad);
    }

}

public class SalaEmergencias {

    public static void main(String[] args) {

        // PASO 1 y 2: prueba tu clase Paciente aquí
        Paciente p = new Paciente("Juan", 1);
        System.out.println(p.getNombre() + " - Gravedad " + p.getGravedad());

        System.out.println(p);

        // PASO 3: sala de espera
        Queue<Paciente> salaEspera = new LinkedList<>();
        salaEspera.offer(new Paciente("Juan", 1));
        salaEspera.offer(new Paciente("Raquel", 3));
        salaEspera.offer(new Paciente("Ignacio", 2));
        salaEspera.offer(new Paciente("Omar", 4));
        salaEspera.offer(new Paciente("Beatriz", 3));
        salaEspera.offer(new Paciente("Xochilt", 1));
        //Paso 7 ¿Es justa?
        salaEspera.offer(new Paciente("Simon", 3));
        salaEspera.offer(new Paciente("Rodolfo", 3));
        salaEspera.offer(new Paciente("Brenda", 3));
        System.out.println("Orden de llegada " + salaEspera);

        // PASO 4: triage
        PriorityQueue<Paciente> triage = new PriorityQueue<>();
        while (!salaEspera.isEmpty()) {
            triage.offer(salaEspera.poll());
        }
        System.out.println(triage.peek()+"\n");

        // PASO 6: atención e historial
        Stack<Paciente> historial = new Stack<>();
        while (!triage.isEmpty()) {
            Paciente atendido = triage.poll();
            System.out.println("Atenciendo a " + atendido);
            historial.push(atendido);
        }
        System.out.println("\nUltimo paciente atendido: "+historial.peek());
        System.out.println("Total de pacientes atendidos: "+historial.size());

    }
}
