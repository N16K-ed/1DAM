import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorProductos gestor = new GestorProductos(10);


        gestor.agregarProducto(new Producto("Manzana", 0.5, Categoria.ALIMENTACION, "Manzana roja jugosa"));
        gestor.agregarProducto(new Producto("Televisor", 300.0, Categoria.ELECTRONICA, "Televisor LED 40 pulgadas"));
        gestor.agregarProducto(new Producto("Camisa", 25.0, Categoria.ROPA, "Camisa de algodón blanca"));
        gestor.agregarProducto(new Producto("Silla", 45.0, Categoria.HOGAR, "Silla ergonómica de oficina"));

    }
}