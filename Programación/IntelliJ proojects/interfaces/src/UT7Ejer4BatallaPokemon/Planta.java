package UT7Ejer4BatallaPokemon;
interface Planta {
    default int aplicarResistencia(Pokemon agresor, int dano) {
        if (agresor instanceof Agua) {
            return dano / 2; // Resistente a Agua
        } else if (agresor instanceof Fuego) {
            return dano * 2; // Planta es débil contra Fuego
        } else if (agresor instanceof Planta) {
            return dano / 2; // Mismo tipo reduce daño
        }
        return dano;
    }
}