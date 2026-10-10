
package com.mycompany.inventoryapp;

import java.util.Scanner;

public class InventoryApp {

    private Scanner sc = new Scanner(System.in);
    private Inventory inventory;

    public static void main(String[] args) {
        InventoryApp app = new InventoryApp();
        app.init();
    }

    // Iniciar el programa
    public void init() {
        inventory = new Inventory();
        int op;

        do {
            System.out.println("\nMENU");
            System.out.println("MANEJO DE INVENTARIOS");
            System.out.println("1. Nuevo producto");
            System.out.println("2. Agregar existencia");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Actualizar precio");
            System.out.println("5. Mostrar productos");
            System.out.println("6. Consultar producto");
            System.out.println("7. Actualizar categoría");
            System.out.println("8. Salir");
            System.out.println("Seleccione una opción:");

            op = sc.nextInt();

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
                    consultProduct();
                    break;

                case 7:
                    updateCategoria();
                    break;

                case 8:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (op != 8);

        sc.close();
    }

    // Opción 1: nuevo producto
    private void newProduct() {
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        System.out.println("Nombre del producto:");
        String name = sc.next();

        System.out.println("Existencia inicial:");
        int existence = sc.nextInt();

        System.out.println("Precio del producto:");
        double price = sc.nextDouble();

        System.out.println("Categoría del producto:");
        String categoria = sc.next();

        inventory.newProduct(
                ID, name, existence, price, categoria
        );
    }

    // Opción 2: agregar existencia
    private void addProduct() {
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        inventory.addProduct(ID);
    }

    // Opción 3: eliminar producto
    private void deleteProduct() {
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        inventory.deleteProduct(ID);
    }

    // Opción 4: actualizar precio
    private void updateProduct() {
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        System.out.println("Nuevo precio:");
        double price = sc.nextDouble();

        inventory.updateProduct(ID, price);
    }

    // Opción 5: mostrar todos los productos
    private void printProduct() {
        inventory.printProducts();
    }

    // Opción 6: consultar producto por ID
    private void consultProduct() {
        System.out.println("Ingrese el ID del producto:");
        int ID = sc.nextInt();

        inventory.consultProduct(ID);
    }

    // Opción 7: actualizar categoría
    private void updateCategoria() {
        System.out.println("Ingrese el ID del producto:");
        int ID = sc.nextInt();

        System.out.println("Ingrese la nueva categoría:");
        String categoria = sc.next();

        inventory.updateCategoria(ID, categoria);
    }
}
