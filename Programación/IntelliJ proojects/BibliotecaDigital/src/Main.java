public class Main {
    public static void main(String[] args) {
    Libro Lib1 = new Libro("El Quijote", "Miguel de Cervantes", 1200);
    Libro Lib2 = new Libro("1984","George Orwell",400);
    Libro Lib3 = new Libro("Cien años de soledad","Gabriel García Márquez",450);
    Libro Lib4 = new Libro("El Hobbit","J.R.R Tolkien", 300);

    Lib1.anyadirPaginasLeidas(1300);
    Lib2.anyadirPaginasLeidas(225);
    Lib3.anyadirPaginasLeidas(225);
    Lib4.anyadirPaginasLeidas(225);

    System.out.println("********************************************************");
    System.out.println("Título del libro: " + Lib1.getTitulo());
    System.out.println("Autor: " + Lib1.getAutor());
    System.out.println("Progreso de lectura: " + Lib1.calcularProgresolectura() + "%");
    System.out.println("Estado de Lectura: " + Lib1.mostrarEstadoLectura());
    System.out.println("El precio total del libro es: " + Lib1.calcularPrecioTotal() + "€");
    System.out.println("********************************************************");

    System.out.println("Título del libro: " + Lib2.getTitulo());
    System.out.println("Autor: " + Lib2.getAutor());
    System.out.println("Progreso de lectura: " + Lib2.calcularProgresolectura() + "%");
    System.out.println("Estado de Lectura: " + Lib2.mostrarEstadoLectura());
    System.out.println("El precio total del libro es: " + Lib2.calcularPrecioTotal() + "€");
    System.out.println("********************************************************");

    System.out.println("Título del libro: " + Lib3.getTitulo());
    System.out.println("Autor: " + Lib3.getAutor());
    System.out.println("Progreso de lectura: " + Lib3.calcularProgresolectura() + "%");
    System.out.println("Estado de Lectura: " + Lib3.mostrarEstadoLectura());
    System.out.println("El precio total del libro es: " + Lib3.calcularPrecioTotal() + "€");
    System.out.println("********************************************************");

    System.out.println("Título del libro: " + Lib4.getTitulo());
    System.out.println("Autor: " + Lib4.getAutor());
    System.out.println("Progreso de lectura: " + Lib4.calcularProgresolectura() + "%");
    System.out.println("Estado de Lectura: " + Lib4.mostrarEstadoLectura());
    System.out.println("El precio total del libro es: " + Lib4.calcularPrecioTotal() + "€");
    System.out.println("********************************************************");
    }
}

//System.out.print != System.out.println. El primero no hace salto de linea al terminar.