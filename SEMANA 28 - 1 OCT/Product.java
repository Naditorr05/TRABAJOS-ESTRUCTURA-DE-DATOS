
package com.mycompany.inventoryapp;

public class Product {

    private int ID;
    private String name;
    private int existence;
    private double price;
    private String categoria;

    // Constructor para buscar un producto por ID
    public Product(int ID) {
        this.ID = ID;
    }

    // Constructor para crear un producto completo
    public Product(int ID, String name, int existence,
                   double price, String categoria) {
        this.ID = ID;
        this.name = name;
        this.existence = existence;
        this.price = price;
        this.categoria = categoria;
    }

    // GET: consultar los datos

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getExistence() {
        return existence;
    }

    public double getPrice() {
        return price;
    }

    public String getCategoria() {
        return categoria;
    }

    // SET: modificar los datos

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExistence(int existence) {
        this.existence = existence;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Comparar productos por su ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Product other = (Product) obj;
        return this.ID == other.ID;
    }

    // Mostrar todos los datos del producto
    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name=" + name +
                ", existence=" + existence +
                ", price=" + price +
                ", categoria=" + categoria +
                '}';
    }
}
