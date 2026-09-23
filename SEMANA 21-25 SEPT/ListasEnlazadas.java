package com.mycompany.listasenlazadas21sept;

import java.util.LinkedList;

public class ListasEnlazadas21sept {

    public static void main(String[] args) {
        //Crear Lista Enlazada 
        LinkedList<String> materias = new LinkedList<>();
        materias.add("Matemáticas");
        materias.add("Fisica");
        materias.add("Educación Fisica");
        materias.add("Programación");
        
        //Mostrar lista
        System.out.println("LISTA DE MATERIAS");
        materias.forEach(System.out::println);
        
        //Agregar Algoritmos al inicio de la lista
        materias.addFirst("Algoritmos");
        
        //Lista actualizada
        System.out.println("\nMATERIAS ACTUALIZADAS");
        materias.forEach(System.out::println);
        
        //Agregar Algebra al final de la lista
        System.out.println("\nMATERIAS AGREGADA AL FINAL DE LA LISTA");
        materias.addLast("Inteligencia artificial");
        materias.forEach(System.out::println);
        
        //Agregar Estructura de datos en la posicion 2 
        materias.add(2, "Estructura de datos");
        System.out.println(materias);
        
        //Consultar materia que esta en la posicion 3
        System.out.println("\nLA MATERIA QUE ESTA EN LA POSICION 3 ES: " + materias.get(3));
        
        //Consultar primer y ultimo elemento de la lista
        System.out.println("\nEl primer elemento de la lista es: " + materias.getFirst());
        System.out.println("\nEl ultimo elemento de la lista es: " + materias.getLast());
        
        //Confirmar si la materia INGLES Eesta en la lista
        if (materias.contains("Ingles")){
            System.out.println(materias.contains("Ingles"));
        }
        else{
            System.out.println("\nLA LISTA NO CONTIENE LA MATERIA INGLES");
        }
        
        //Consultar la posicion de base de datos
        System.out.println("\nLA MATERIA PROGRAMACIÓN ESTA EN LA POSICION: " + materias.indexOf("Programacón"));
        
    }
}
