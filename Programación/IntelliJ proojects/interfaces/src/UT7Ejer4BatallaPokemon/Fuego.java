package UT7Ejer4BatallaPokemon;

interface Fuego {
    default int aplicarResistencia(Pokemon agresor, int dano) {
        if (agresor instanceof Planta) {
            return dano / 2; // Resistente a Planta
        } else if (agresor instanceof Agua) {
            return dano * 2; // Fuego es débil contra Agua
        } else if (agresor instanceof Fuego) {
            return dano / 2; // Mismo tipo reduce daño
        }
        return dano;
    }
}