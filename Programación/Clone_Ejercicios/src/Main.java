public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Persona p1 = new Persona("Awiwi", 17);
        Object p2 = p1.clone();
        Jugador j1 = new Jugador("Pepe", 1);
        j1.juegosJugados.add("Minecraft");
        j1.juegosJugados.add("Valorant");
        j1.juegosJugados.add("Pokémon");
        j1.juegosJugados.add("Fortnite");
        j1.juegosJugados.add("Elden Ring");
        Object j2 = j1.clone();
        System.out.println("Mira los valores...");
    }
}