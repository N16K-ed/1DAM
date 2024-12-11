public class Main {
    public static void main(String[] args) {
        Tablero tab1 = new Tablero();
        Marcador marc1 = new Marcador("Juan");
        Juego juego1 = new Juego(tab1, marc1);
        juego1.getMarcador().aumentarPuntuacion(30);
    }
}