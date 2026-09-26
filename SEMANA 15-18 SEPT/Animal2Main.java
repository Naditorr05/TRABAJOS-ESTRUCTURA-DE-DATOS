package Animal.Animal;


/**
 *
 * @author prestamo
 */
public class MainAnimal {

    public static void main(String[] args) {
        //crear objetos
        Animal a1 = new Animal("Firulais", "Perro", 6, "Guau");
        Animal a2 = new Animal("Blue", "Loro", 10, "Curru");
        Animal a3 = new Animal("Grapas", "Leon", 1, "Grr");
        Animal a4 = new Animal("Hochy", "Perro", 9, "Guau");
        Animal a5 = new Animal("Julia", "Gato", 13, "Miau");
        
        //Llamar metodos
        System.out.println("LISTA DE ANIMALES. ");
        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();
        a4.mostrarInfo();
        a5.mostrarInfo();
        
        System.out.println("\n SONIDOS DE ANIMALES. ");
        a1.mostrarSonido();
        a2.mostrarSonido();
        a3.mostrarSonido();
        a4.mostrarSonido();
        a5.mostrarSonido();
    }
    
}
