public class Main {
    public static void main(String[] args) {
        Punto puntoA = new Punto("puntoA", 0, 0);
        Punto puntoB = new Punto("puntoB", 3,4);

        puntoA.moverX(5);
        puntoA.moverY(7);

        puntoB.moverX(-7);
        puntoB.moverY(2);

        puntoA.posicionX();
        puntoA.posicionY();

        puntoB.posicionX();
        puntoB.posicionY();
    }
}