
package com.mycompany.inventoryapp;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Product> products;

    // Constructor
    public Inventory() {
        products = new LinkedList<>();
    }

    // Agregar un producto nuevo
    public void newProduct(int ID, String name, int existence,
                           double price, String categoria) {

        // Evitar IDs duplicados
        if (getProduct(ID) != null) {
            System.out.println("Ya existe un producto con ese ID.");
            return;
        }

        Product newProduct = new Product(
                ID, name, existence, price, categoria
        );

        products.add(newProduct);

        System.out.println(
                "El producto " + name + " se añadió satisfactoriamente."
        );
    }

    // Buscar un producto por su ID
    public Product getProduct(int ID) {
        int productIndex = products.indexOf(new Product(ID));

        if (productIndex == -1) {
            return null;
        }

        return products.get(productIndex);
    }

    // Consultar un producto por su ID
    public void consultProduct(int ID) {
        Product product = getProduct(ID);

        if (product == null) {
            System.out.println("El producto no existe.");
        } else {
            System.out.println("DATOS DEL PRODUCTO");
            System.out.println(product);
        }
    }

    // Agregar existencia
    public void addProduct(int ID) {
        Product product = getProduct(ID);

        if (product == null) {
            System.out.println("El producto no existe.");
            return;
        }

        product.setExistence(product.getExistence() + 1);

        System.out.println(
                "Se agregó una unidad de " + product.getName()
        );
    }

    // Mostrar todos los productos
    public void printProducts() {
        System.out.println("PRODUCTOS EN EL ALMACÉN");

        if (products.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        products.forEach(System.out::println);
        System.out.println();
    }

    // Actualizar el precio
    public void updateProduct(int ID, double price) {
        Product product = getProduct(ID);

        if (product == null) {
            System.out.println("El producto no existe.");
            return;
        }

        product.setPrice(price);

        System.out.println("Precio actualizado correctamente.");
    }

    // Actualizar la categoría
    public void updateCategoria(int ID, String categoria) {
        Product product = getProduct(ID);

        if (product == null) {
            System.out.println("El producto no existe.");
            return;
        }

        product.setCategoria(categoria);

        System.out.println("Categoría actualizada correctamente.");
    }

    // Consultar la categoría
    public void printCategoria(int ID) {
        Product product = getProduct(ID);

        if (product == null) {
            System.out.println("El producto no existe.");
            return;
        }

        System.out.println(
                "Categoría del producto: " + product.getCategoria()
        );
    }

    // Eliminar un producto
    public void deleteProduct(int ID) {
        Product product = getProduct(ID);

        if (product == null) {
            System.out.println("El producto no existe.");
            return;
        }

        products.remove(product);

        System.out.println(
                "El producto " + product.getName() + " se eliminó."
        );
    }
}
