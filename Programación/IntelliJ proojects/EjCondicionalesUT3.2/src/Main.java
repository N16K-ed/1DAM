public class Main {
    public static void main(String[] args) {
    anyoBisisesto(1404);
    }
    private static void anyoBisisesto(int anyo){

        if (anyo % 4 == 0 && anyo % 100 != 0) {
            System.out.println("El año es bisiesto.");
        } else if (anyo % 4 == 0 && anyo % 100 == 0 && anyo % 400 == 0){
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }
}