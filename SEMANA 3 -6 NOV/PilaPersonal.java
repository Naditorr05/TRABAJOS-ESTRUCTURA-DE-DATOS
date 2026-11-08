import java.util.Stack;

public class PilaPersonal {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        // TODO 1: Mete con push() tus 3 datos en este orden:
        //         número de lista, día de cumpleaños, mes de cumpleaños.
        //         Después de cada push, llama a imprimirPila(pila);
        pila.push(1);
        imprimirPila(pila);
        pila.push(31);
        imprimirPila(pila);
        pila.push(8);
        imprimirPila(pila);

        // TODO 2: Busca tu número de lista con search() e imprime la posición.
        System.out.println("\nLa posicion de mi numero de lista es " + pila.search(1));


        // TODO 3: Vacía la pila de forma segura.
        //         Mientras NO esté vacía: saca con pop(), imprime "Se saco X"
        //         y llama a imprimirPila(pila);
        System.out.println("\nEliminando datos con pop()");
        while (!pila.empty()){
            pila.pop();
            imprimirPila(pila);

        }

    }

    // Este método ya está completo: muestra la cima y el contenido
    private static void imprimirPila(Stack<Integer> pila) {
        if (pila.empty()) {
            System.out.println("La pila esta vacia\n");
        } else {
            System.out.println("Cima: " + pila.peek());
            System.out.println("Contenido: " + pila + "  <- la cima es el de la derecha\n");
        }
    }
}
