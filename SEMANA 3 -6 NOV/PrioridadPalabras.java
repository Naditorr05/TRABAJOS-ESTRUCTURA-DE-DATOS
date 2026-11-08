import java.util.PriorityQueue;

public class PrioridadPalabras {

    public static void main(String[] args) {

        PriorityQueue<String> cola = new PriorityQueue<>();

        // TODO 1: Mete con offer() 4 palabras: tu nombre, tu ciudad,
        //         tu carrera y tu lenguaje de programación favorito.
        //         Luego imprime la cola completa con System.out.println(cola);
        cola.offer("Naren");
        cola.offer("Bogota");
        cola.offer("Tecnologia Informatica");
        cola.offer("Java");
        System.out.println(cola);


        // TODO 2: ANTES de ejecutar, escribe aquí en un comentario
        //         cuál crees que será la cabeza. Luego imprímela con peek().
        //         Mi predicción: 
        //La cabeza sera mi nombre
        System.out.println(cola.peek());


        // TODO 3: Vacía la cola con isEmpty() y poll(), imprimiendo cada palabra.
        while (!cola.isEmpty()){
            System.out.println("Sale " + cola.poll());

        }

    }
}
