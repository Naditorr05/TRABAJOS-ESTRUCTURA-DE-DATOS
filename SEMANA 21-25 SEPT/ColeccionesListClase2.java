/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package colecciones.list.clase2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author patri
 */
public class ColeccionesListClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREACION DE UN ArrayList
        List <String> ListaColores =new ArrayList<>();
        
        //CREACION MEDIANTE LA CLASE ARRAY
        String [] nombres={"Arturo","Daniel","Sofia","María"};
        List <String> ListaNombres =Arrays.asList(nombres);
        
        //ADICION DE ELEMENTOS AL ARRAYSlIST DE FORMA INDIVIDUAL
        ListaColores.add("Azul");
        ListaColores.add("Verde");
        ListaColores.add("Amarillo");
        ListaColores.add("Rojo");
        
        //CREAR OTRA LISTA A PARTIR DE OTRA LISTA
        List<String> elementos =new ArrayList<>(ListaColores);
        
        //ADICIONAR ELEMENTOS DE OTRA COLECCION
        elementos.addAll(ListaNombres);
        
        //VISIBILIZAR LAS LISTAS CREADAS A TRAVES DE UN METODO REFERENCIADO
        // listasNombres.forEach(nombre -> System.out.println(nombre)); expresion lambda
        // for (String nombre : listasNombres) {
        // System.out.println(nombre);
        //}
        System.out.println("\nLISTA DE NOMBRES");
        ListaNombres.forEach(System.out::println);
        System.out.println("\nLISTA DE ELEMENTOS");
        elementos.forEach(System.out::println);
        System.out.println("\nLISTA DE COLORES");
        ListaColores.forEach(System.out::println);
        
        //ITERACION A TRAVÉS DEL ArrayList
        //hasNext(), next(), remove(), hasPrevious(), previous() nextIndex(), 

        
        System.out.println("\nLISTA PRESENTADA A TRAVES DEL METODO ListIterator");
        
        //Iterador para recorres y eliminar elementos de la lista
        ListIterator<String> iterador = ListaColores.listIterator();
        while (iterador.hasNext()) {
            String color = iterador.next();
            System.out.println("Color:" + color);

            if (color.equals("Amarillo")) {
                iterador.remove();
                System.out.println("\nSe eliminó \"" + color + "\". Lista actualizada: " + ListaColores);
            }
        }

        System.out.println("\nLISTA CON ListIterator mostrada de atrás hacia adelante");
        while (iterador.hasPrevious()) {
            System.out.println("Color:" + iterador.previous());
        }
        //BORRAR DINÁMICAMENTE EN EL MOMENTO DE ESTAR ITERANDO
        
        
                
    }
    
}
