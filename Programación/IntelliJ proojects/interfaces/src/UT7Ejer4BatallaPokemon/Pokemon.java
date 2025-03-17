package UT7Ejer4BatallaPokemon;

interface Pokemon {
    void atacar(Pokemon enemigo);
    void recibirAtaque(Pokemon agresor, int danoBase);
    String getNombre();
}
