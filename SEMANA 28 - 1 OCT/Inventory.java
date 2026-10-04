import java.util.LinkedList;

public class Inventory {

    // Lista enlazada que almacena objetos Product
    private LinkedList<Product> productos;

    // Constructor
    public Inventory() {
        productos = new LinkedList<>();
    }

    // Agregar producto al final
    public void agregarProducto(Product producto) {
        productos.addLast(producto);
    }

    // Agregar producto al inicio
    public void agregarAlInicio(Product producto) {
        productos.addFirst(producto);
    }

    // Obtener el primer producto
    public Product obtenerPrimero() {
        return productos.getFirst();
    }

    // Obtener el último producto
    public Product obtenerUltimo() {
        return productos.getLast();
    }

    // Obtener un producto según su posición
    public Product obtenerPorPosicion(int posicion) {
        return productos.get(posicion);
    }

    // Obtener cantidad de productos
    public int cantidadProductos() {
        return productos.size();
    }

    // Mostrar todos los productos
    public void mostrarProductos() {
        for (Product producto : productos) {
            System.out.println(producto);
        }
    }

    // Buscar un producto por código
    public Product buscarProducto(int codigo) {

        for (Product producto : productos) {

            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }

        return null;
    }

    // Eliminar el primer producto
    public Product eliminarPrimero() {
        return productos.removeFirst();
    }

    // Eliminar el último producto
    public Product eliminarUltimo() {
        return productos.removeLast();
    }
}
