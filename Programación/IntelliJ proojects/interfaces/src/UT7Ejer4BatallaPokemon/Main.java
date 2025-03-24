package UT7Ejer4BatallaPokemon;

public class Main {
    public static void main(String[] args) {
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();

        // Simulación de combate
        charmander.atacar(squirtle);
        squirtle.atacar(bulbasaur);
        bulbasaur.atacar(charmander);
        System.out.println();
        charmander.atacar(bulbasaur);
        squirtle.atacar(charmander);
        bulbasaur.atacar(squirtle);
        System.out.println("\n¡¡¡Los Pokémon están confusos, se atacan a si mismos!!!\n");
        charmander.atacar(charmander);
        squirtle.atacar(squirtle);
        bulbasaur.atacar(bulbasaur);
    }
}
