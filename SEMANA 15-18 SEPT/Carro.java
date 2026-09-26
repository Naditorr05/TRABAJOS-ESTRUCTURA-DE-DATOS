public class Carro{
    //Atributos
    String marca;
    String modelo;
    int anio;
    String color;
    
    //Atributo de REFERENCIA hacia otro Carro (el "puente" a otro Nodo)
    Carro siguiente; //por defecto queda en null hasta que se asigne

    //Constructor 
    Carro(String marca, String modelo, int anio, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.siguiente = null; //Al crearse, no apunta a nadie todavia
    }
    
    //Metodos (unico, sin parametros, sin retorno)
    void mostrarInfo(){
        System.out.println("Marca: " + marca + " Modelo: " + modelo + " Año: " + anio + " Color: " + color);
    }
}
