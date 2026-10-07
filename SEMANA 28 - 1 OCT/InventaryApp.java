/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventoryapp;

import java.util.Scanner;

public class InventoryApp {

    // Permite leer datos del usuario
    private Scanner sc = new Scanner(System.in);

    // Objeto que administra el inventario
    private Inventory inventory;

    // ============================================================
    // MÉTODO PRINCIPAL
    // ============================================================

    public static void main(String[] args) {

        // Crea un objeto de InventoryApp
        InventoryApp app = new InventoryApp();

        // Inicia el programa
        app.init();
    }
    // INICIAR EL PROGRAMA
    //==============================================

    public void init() {
        // Crea el inventario
        inventory = new Inventory();
        int op;

        // Repite el menú hasta seleccionar 6
        do {
            System.out.println("\n\t MENU");
            System.out.println("MANEJO DE INVENTARIOS     ");
            System.out.println("1. Nuevo producto");
            System.out.println("2. Agregar existencia");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Actualizar precio");
            System.out.println("5. Mostrar productos");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción:");

            op = sc.nextInt();

            // Ejecuta la opción seleccionada
            switch (op) {
                case 1:
                    newProduct();
                    break;

                case 2:
                    addProduct();
                    break;

                case 3:
                    deleteProduct();
                    break;

                case 4:
                    updateProduct();
                    break;

                case 5:
                    printProduct();
                    break;
                
                case 6:
                    printCategoria();
                    break;
            }

        } while (op != 6);
    }
    // ================================================================
    // OPCIÓN 1 - NUEVO PRODUCTO
    // ================================================================

    private void newProduct() {
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        System.out.println("Nombre del producto:");
        String name = sc.next();

        System.out.println("Existencia inicial:");
        int existence = sc.nextInt();

        System.out.println("Precio del producto:");
        double price = sc.nextDouble();
        
        System.out.println("Categoria del producto:");
        String categoria = sc.next();

        // Envía los datos a Inventory
        inventory.newProduct(
            ID, name, existence, price, categoria);
    }
    // ============================================================
    // OPCIÓN 2 - AGREGAR EXISTENCIA
    // ============================================================

    private void addProduct() {
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        // Inventory aumenta la existencia
        inventory.addProduct(ID);
    }


    // ============================================================
    // OPCIÓN 3 - ELIMINAR PRODUCTO
    // ============================================================

    private void deleteProduct() {

        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        // Inventory elimina el producto
        inventory.deleteProduct(ID);
    }
    // =====================================================
    // OPCIÓN 4 - ACTUALIZAR PRECIO
    // =====================================================

    private void updateProduct() {

        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        System.out.println("Nuevo precio:");
        double price = sc.nextDouble();

        // Inventory modifica el precio
        inventory.updateProduct(ID, price);
    }


    // =====================================================
    // OPCIÓN 5 - MOSTRAR PRODUCTOS
    // =====================================================

    private void printProduct() {

        // Inventory muestra la lista
        inventory.printProducts();
    }
    
    // =====================================================
    // OPCIÓN 6 - MOSTRAR CATEGORIA DE PRODUCTOS
    // =====================================================
    
    public void printCategoria(){
        int ID = sc nextInt();
        
        System.out.println(inventory.getCategoria);
    }
    
}
