import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class DepuracionDeMaterias {

    public void main (String[] args){
        
        //Creacion de ArrayList Materias
        List<String> materias = new ArrayList<>();
        materias.add("Matematicas");
        materias.add("Fisica");
        materias.add("Quimica");
        materias.add("Piloto Arquitectura de computadores");
        materias.add("Piloto Base de datos");

        //Mostrar lista de materias
        System.out.println("\nMATERIAS DEL SEMESTRE A CURSAR \n");
        materias.forEach(System.out::println);

        //Depurar materias piloto
        ListIterator<String> materiasDepurada = materias.listIterator();
        System.out.println("\n");
        while (materiasDepurada.hasNext()){

            String materia = materiasDepurada.next();
            System.out.println("Materia: " + materia + "\n");

            if (materia.equals("Piloto Arquitectura de computadores") || materia.equals("Piloto Base de datos")){

                materiasDepurada.remove();
                System.out.println("\nSe elimino la materia " + materia + "\nLista de Materias actualizada para el semestre: " + materias + "\n");

            }
        }

    }
}
