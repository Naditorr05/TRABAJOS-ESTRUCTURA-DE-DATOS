
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listasenlazadas.sept;

import java.util.LinkedList;

/**
 *
 * @author prestamo
 */
public class InventoryApp {

    private Inventory inventory;
    public static void main(String[] args) {
        
        //Crear Objetos
        Product p1 = new Product();
        p1.setID(01);
        p1.setNombre("Papas");
        p1.setExistence(25);
        p1.setPrice(2500);
        
        Product p2 = new Product(02,"Aguacate",30,2000);
        
        //Obtener informacion
        System.out.println(p1.getNombre());
        System.out.println(p1.getExistence());
        p1.setPrice(4000);
        System.out.println(p1.getPrice());
        System.out.println(p1.toString());
        
        LinkedList<String> products = new LinkedList<>;
        
    }

}
