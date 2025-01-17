public class Producto {

    private String nombre;
    private double precio;
    private Categoria categoria;
    private String descripcion;

    // Constructor para inicializar el producto
    public Producto(String nombre, double precio, Categoria categoria, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    // Getters para los atributos del producto
    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    // Método toString para representar el producto como una cadena
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nPrecio: " + precio + "\nCategoría: " + categoria + "\nDescripción: " + descripcion;
    }
}
