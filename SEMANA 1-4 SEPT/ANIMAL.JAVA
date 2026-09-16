/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal.Animal;

/**
 *
 * @author prestamo
 */
public class Animal {
    
    //Atributos
    String nombre;
    String raza;
    int edad;
    String sonido;
    //Atributo que hace referencia a siguiente
    Animal siguiente;
    
    //constructor
    public Animal(String nombre, String raza, int edad, String sonido){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sonido = sonido;
        this.siguiente = null;
    }
    
    //metodo
    public void mostrarInfo(){
        System.out.println(" Nombre: " + nombre + " Raza: " + raza + " Edad: " + edad + " Sonido: " + sonido);
    }
    
    public void mostrarSonido(){
        System.out.println("El sonido del animal " + raza + " es " + sonido);
    }
}
