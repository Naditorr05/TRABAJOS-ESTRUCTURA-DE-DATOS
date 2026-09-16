import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class Materias {
    public void main(String[] args){
        //Creacion ArrayList listMaterias
        List<String> listMaterias = new ArrayList<>();
        listMaterias.add("Calculo");
        listMaterias.add("Fisica");
        listMaterias.add("Piloto Base de datos");
        listMaterias.add("Piloto Arquitectura de computadores");

        //Creacion de Array proveedores
        String [] proveedores ={"Algebra", "Poo", "Estructura de datos"};
        List<String> listProveedores = Arrays.asList(proveedores);

        //Mostrar Lista de proveedores
        System.out.println("\nLISTA DE PROVEEDORES");
        listProveedores.forEach(System.out::println);
        
        //Mostrar lista de materias
        System.out.println("\nMATERIAS DEL SEMESTRE A CURSAR ");
        listMaterias.forEach(System.out::println);

        //Depurar materias piloto
        ListIterator<String> materiasDepurada = listMaterias.listIterator();
        System.out.println("\n");

        while (materiasDepurada.hasNext()){
            String materia = materiasDepurada.next();
            System.out.println("Materia: " + materia + "\n");

            if (materia.startsWith("Piloto")){

                materiasDepurada.remove();
                System.out.println("\nSe elimino la materia " + materia + "\nLista de Materias actualizada para el semestre: " + listMaterias + "\n");

            }
        }
    }     
}
