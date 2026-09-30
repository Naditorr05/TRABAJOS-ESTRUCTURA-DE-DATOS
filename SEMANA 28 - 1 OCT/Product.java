/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listasenlazadas.sept;

import java.util.Objects;


/**
 *
 * @author prestamo
 */
public class Product {
    //Atributos
    private int ID;
    private String nombre;
    private int existence;
    private double price;
    
    //Constructores
    public Product(int ID, String nombre, int existence, double price) {
        this.ID = ID;
        this.nombre = nombre;
        this.existence = existence;
        this.price = price;
    }

    public Product(int ID) {
        this.ID = ID;
    }
    //Constructor vacio
    public Product() {
    }
    
    
    //Getter and setter
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getExistence() {
        return existence;
    }
    public void setExistence(int existence) {
        this.existence = existence;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    //Equals comparar objetos (Duplicados o vacios)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (this.existence != other.existence) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    //Metodo mostrarInfo
    public String mostrarInfo(){
        return "El producto con ID "+ID+" llamado "+nombre+" tiene "+existence+" existencias con un valor de "+price;
    }
    
    
}
