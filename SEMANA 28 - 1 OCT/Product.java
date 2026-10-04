public class Product {

    // Atributos del producto
    private int codigo;
    private String nombre;
    private double precio;

    // Constructor
    public Product(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Mostrar información del producto
    @Override
    public String toString() {
        return "Código: " + codigo
                + " | Nombre: " + nombre
                + " | Precio: $" + precio;
    }
}
