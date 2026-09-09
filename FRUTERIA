package com.mycompany.fruteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.ListIterator;

public class Fruteria {

    public static void main(String[] args) {
        //creacion de ArrayList nuevoinventario
        List<String> nuevoinventario = new ArrayList<>();
        
        //Adicion de objetos frutas
        nuevoinventario.add("Manzana");
        nuevoinventario.add("Naranja");
        nuevoinventario.add("Uva");
        nuevoinventario.add("Guayaba");
        
        //CREACION MEDIANTE LA CLASE ARRAY PROVEEDORES
        String [] proveedores={"Manzaneria","Naranjeria","Don uvas"};
        List <String> listaProveedores = Arrays.asList(proveedores);
        
        //Combinar INVENTARIO Y PROVEEDORES
        List<String> elementos = new ArrayList<>(nuevoinventario);
        elementos.addAll(listaProveedores);
        
        //SALIDA
        System.out.println("\nINVENTARIO DE FRUTAS ");
        nuevoinventario.forEach(System.out::println);
        System.out.println("\nLISTA DE PROVEEDORES");
        listaProveedores.forEach(System.out::println);
        System.out.println("\nLISTA DE ELEMENTOS");
        elementos.forEach(System.out::println);
        
    }
}
