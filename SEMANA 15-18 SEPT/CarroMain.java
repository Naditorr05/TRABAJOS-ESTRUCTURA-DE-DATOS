public static void main(String[] args) {
    //crear objetos
    Carro c1 = new Carro("Mazda", "3", 2020, "Rojo");
    Carro c2 = new Carro("Toyota", "Corolla", 2019, "Blanco");
    Carro c3 = new Carro("Renault", "Logan", 2021, "Gris");
    Carro c4 = new Carro("Chevrolet", "Spark", 2018, "Azul");
    Carro c5 = new Carro("Kia", "Picanto", 2023, "Azul");
    Carro c6 = new Carro("Hyundai", "i10", 2020, "Blanco");
    Carro c7 = new Carro("Volkswagen", "Jetta", 2018, "Plata");
    Carro c8 = new Carro("Nissan", "Versa", 2021, "Rojo");
    Carro c9 = new Carro("Ford", "Fiesta", 2017, "Negro");
    Carro c10 = new Carro("Honda", "Civic", 2022, "Azul");
    Carro c11 = new Carro("BMW", "Serie 3", 2020, "Negro");
    Carro c12 = new Carro("Audi", "A3", 2021, "Gris");
    Carro c13 = new Carro("Mercedes-Benz", "Clase A", 2023, "Blanco");
    Carro c14 = new Carro("Renault", "Duster", 2022, "Verde");
    
    //Mostrar info
    System.out.println("\n=== PASO 3: OBJETOS CREADOS ===");
    c1.mostrarInfo();
    c2.mostrarInfo();
    c3.mostrarInfo();
    c4.mostrarInfo();
    c5.mostrarInfo();
    c6.mostrarInfo();
    c7.mostrarInfo();
    c8.mostrarInfo();
    c9.mostrarInfo();
    c10.mostrarInfo();
    c11.mostrarInfo();
    c12.mostrarInfo();
    c13.mostrarInfo();
    c14.mostrarInfo();

    //Referencia vs valor
    System.out.println("\n=== PASO 4: REFERENCIA VS VALOR ===");
    Carro copia = c1; //Copia es una segunda llave hacia el mismo objeto
    copia.modelo = "CX-5";
    System.out.println("c1.modelo " + c1.modelo);

    //Enlazar los carros con "siguiente" 
    System.out.println("\n=== PASO 5-6: ENLAZANDO LOS CARROS ===");
    c1.siguiente = c2;
    c2.siguiente = c3;
    c3.siguiente = c4;
    c4.siguiente = c5;
    c5.siguiente = c6;
    c6.siguiente = c7;
    c7.siguiente = c8;
    c8.siguiente = c9;
    c9.siguiente = c10;
    c10.siguiente = c11;
    c11.siguiente = c12;
    c12.siguiente = c13;
    c13.siguiente = c14;
    c14.siguiente = null;

    //Recorrido de la cedena desde el c1 
    Carro actual = c1;
    while (actual != null){
        actual.mostrarInfo();
        actual = actual.siguiente;
    }

    System.out.println("Llegamos a null: no hay mas carros encadenados.");

}
