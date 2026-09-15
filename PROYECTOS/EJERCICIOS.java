System.out.println("INVENTARIO CON BUCLE FOR CORTO");
for(String producto:inventario){
    System.out.println("-" + producto);
  }

System.out.println("\n INVENTARIO ");
for(int i=0 ; i<inventario.size ; i++){
  System.out.println(inventario.get(i));
}

String [] inventario2 = {"Mango", "Pera", "Fresa", "Uva"};
inventario2.for.each(System.out::println);
