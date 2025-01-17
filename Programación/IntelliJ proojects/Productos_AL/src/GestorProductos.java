import java.util.Scanner;

public class GestorProductos {

    private Producto[] productos;
    private int contador;

    // Constructor para inicializar el array de productos
    public GestorProductos(int tamano) {
        this.productos = new Producto[tamano];
        this.contador = 0;
    }

    // Método para agregar un nuevo producto al array
    public void agregarProducto(Producto producto) {
        if (contador < productos.length){
            productos[contador] = producto;
        }
    }

    // Método para buscar un producto por su nombre
    public Producto buscarPorNombre(String nombre) {
        for (int i = 0; i < productos.length; i++){
            if (productos[i].getNombre().equals(nombre)){
                return productos[i];
            }
        } return null;
    }

    // Método para buscar productos por categoría
    public Producto buscarPorCategoria(Categoria categoria) {
        for (int i = 0; i < productos.length; i++){
            if (productos[i].getCategoria().equals(categoria)){
                return productos[i];
            }
        } return null;
    }

    // Método para ordenar los productos por precio en orden ascendente
    public void ordenarPorPrecio() {

    }

    // Método para ordenar los productos por nombre en orden alfabético
    public void ordenarPorNombre() {

    }

    // Método para mostrar todos los productos en el array
    public void mostrarProductos() {
        int numero = 0;
        System.out.println("****************************");
        for (int i = 0; i < productos.length; i++){
            System.out.println("****************************");
            System.out.println("Producto " + numero);
            System.out.println("Nombre: " + productos[i].getNombre());
            System.out.println("Precio: " + productos[i].getPrecio() + "€");
            System.out.println("Categoria: " + productos[i].getCategoria());
            //System.out.println("Descripción: " + productos[i].getDescripcion); no hay un getter de descripción.
            System.out.println("****************************");
        }
    }

    // Método para buscar un producto por nombre usando Scanner para la entrada
    public void buscarPorNombre(Scanner scanner) {
        scanner = new Scanner(System.in);
        System.out.print("Introduzca el nombre del producto: ");
        String nombreTeclado = scanner.nextLine();
        for (int i = 0; i < productos.length; i++){
            if (productos[i].getNombre().equals(nombreTeclado)){
                System.out.println(productos[i]);
            }else{
                System.out.println("No existe el producto " + nombreTeclado + " en nuestra base de datos.");
            }
        }

    }

    // Método para buscar productos por categoría usando Scanner para la entrada
    public void buscarPorCategoria(Scanner scanner) {
        scanner = new Scanner(System.in);
        System.out.print("Introduzca la categoría de los productos (ALIMENTACION, ELECTRONICA, ROPA, HOGAR): ");
        String nombreTeclado = scanner.nextLine();
        String nuevoNombre;
        if (nombreTeclado.equalsIgnoreCase("ALIMENTACIÓN")){//Ignora la tilde en ALIMENTACI ("Ó") N
            nuevoNombre = "ALIMENTACION";
        }else{
            nuevoNombre = nombreTeclado;
        }
        System.out.println();
        for (int i = 0; i < productos.length; i++){
            if (productos[i].getCategoria().equals(Categoria.ALIMENTACION) && nombreTeclado.equalsIgnoreCase(Categoria.ALIMENTACION.toString())){
                System.out.println(productos[i]);
            }else if (productos[i].getCategoria().equals(Categoria.ELECTRONICA) && nombreTeclado.equalsIgnoreCase(Categoria.ELECTRONICA.toString())){
                System.out.println(productos[i]);
            }else if (productos[i].getCategoria().equals(Categoria.ROPA) && nombreTeclado.equalsIgnoreCase(Categoria.ROPA.toString())){
                System.out.println(productos[i]);
            }else if (productos[i].getCategoria().equals(Categoria.HOGAR) && nombreTeclado.equalsIgnoreCase(Categoria.HOGAR.toString())){
                System.out.println(productos[i]);
            }else{
                System.out.println("No existen productos de la categoría " + nombreTeclado);
            }
        }
    }
}
