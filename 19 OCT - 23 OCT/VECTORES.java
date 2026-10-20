import java.util.Vector;

/**
 *
 * @author prestamo
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        System.out.println("ESTUDIANTES\n");
        Vector<String> estudiantes = new Vector<>(2);
        estudiantes.add("Luis"); estudiantes.add("Ana"); estudiantes.add("Marco");
        //Mostrar de la pocision 0
        System.out.println(estudiantes.get(0));
        //mostrar tamaño del vector
        //Un vector puede tener capacidad de 5 pero un tamaño de 3 objetos
        System.out.println(estudiantes.size());
        //Mostrar capacidad
        System.out.println(estudiantes.capacity());
        //Añadir al vector
        System.out.println(estudiantes.add("Pedro"));
        //Remover posicion
        System.out.println(estudiantes.remove(0));
        //Remover valor 
        System.out.println(estudiantes.remove("Ana"));
        
        //EJERCICIO
        System.out.println("\n\n MATERIAS.\n");
        Vector<String> materias = new Vector<>(2);
        materias.add("Álgebra"); materias.add("Inglés"); materias.add("Programación");
        //Mostrar de la pocision 0
        System.out.println(materias.get(0));
        //mostrar tamaño del vector
        //Un vector puede tener capacidad de 5 pero un tamaño de 3 objetos
        System.out.println(materias.size());
        //Mostrar capacidad
        System.out.println(materias.capacity());
        //Añadir al vector
        System.out.println(materias.add("Fisica"));
        //Remover posicion
        System.out.println(materias.remove(0));
        //Remover valor 
        System.out.println(materias.remove("Matematicas"));
        //Modificar valor por pocision
        System.out.println(materias.set(1, "Ingles 2"));
         
         
    
    
    
    }
}
