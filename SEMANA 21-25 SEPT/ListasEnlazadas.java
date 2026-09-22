package com.mycompany.listasenlazadas.sept;

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
        
        
    }
}
