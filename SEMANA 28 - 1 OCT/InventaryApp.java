import java.util.Scanner;

public class InventoryApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear el inventario
        Inventory inventario = new Inventory();

        // Crear productos
        Product producto1 = new Product(1, "Teclado", 80000);
        Product producto2 = new Product(2, "Mouse", 45000);
        Product producto3 = new Product(3, "Monitor", 650000);
        Product producto4 = new Product(4, "Audífonos", 120000);
        Product producto5 = new Product(5, "Memoria USB", 30000);

        // Agregar productos al inventario
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);

        // Insertar un producto al inicio
        inventario.agregarAlInicio(producto4);

        // Insertar un producto al final
        inventario.agregarProducto(producto5);

        int opcion;

        do {
            System.out.println();
            System.out.println("Inventario de productos");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Mostrar primer producto");
            System.out.println("3. Mostrar último producto");
            System.out.println("4. Consultar producto por posición");
            System.out.println("5. Mostrar cantidad de productos");
            System.out.println("6. Buscar producto");
            System.out.println("7. Modificar producto");
            System.out.println("8. Eliminar primer producto");
            System.out.println("9. Eliminar último producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println();
                    System.out.println("Productos del inventario:");
                    inventario.mostrarProductos();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Primer producto:");
                    System.out.println(inventario.obtenerPrimero());
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Último producto:");
                    System.out.println(inventario.obtenerUltimo());
                    break;

                case 4:
                    System.out.print("Ingrese la posición del producto: ");
                    int posicion = scanner.nextInt();

                    if (posicion >= 0 && posicion < inventario.cantidadProductos()) {
                        System.out.println();
                        System.out.println("Producto encontrado:");
                        System.out.println(inventario.obtenerPorPosicion(posicion));
                    } else {
                        System.out.println("La posición no existe.");
                    }
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Cantidad de productos: "
                            + inventario.cantidadProductos());
                    break;

                case 6:
                    System.out.print("Ingrese el código del producto: ");
                    int codigo = scanner.nextInt();

                    Product productoEncontrado = inventario.buscarProducto(codigo);

                    if (productoEncontrado != null) {
                        System.out.println();
                        System.out.println("Producto encontrado:");
                        System.out.println(productoEncontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 7:
                    System.out.print("Ingrese el código del producto a modificar: ");
                    int codigoModificar = scanner.nextInt();

                    Product productoModificar =
                            inventario.buscarProducto(codigoModificar);

                    if (productoModificar != null) {

                        scanner.nextLine();

                        System.out.print("Ingrese el nuevo nombre: ");
                        String nuevoNombre = scanner.nextLine();

                        System.out.print("Ingrese el nuevo precio: ");
                        double nuevoPrecio = scanner.nextDouble();

                        productoModificar.setNombre(nuevoNombre);
                        productoModificar.setPrecio(nuevoPrecio);

                        System.out.println();
                        System.out.println("Producto modificado:");
                        System.out.println(productoModificar);

                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 8:
                    if (inventario.cantidadProductos() > 0) {
                        Product eliminado = inventario.eliminarPrimero();

                        System.out.println();
                        System.out.println("Producto eliminado:");
                        System.out.println(eliminado);
                    } else {
                        System.out.println("El inventario está vacío.");
                    }
                    break;

                case 9:
                    if (inventario.cantidadProductos() > 0) {
                        Product eliminado = inventario.eliminarUltimo();

                        System.out.println();
                        System.out.println("Producto eliminado:");
                        System.out.println(eliminado);
                    } else {
                        System.out.println("El inventario está vacío.");
                    }
                    break;

                case 0:
                    System.out.println();
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}
