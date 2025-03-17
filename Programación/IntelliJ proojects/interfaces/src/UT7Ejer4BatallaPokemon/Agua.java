package UT7Ejer4BatallaPokemon;


interface Agua {
    default int aplicarResistencia(Pokemon agresor, int dano) {
        if (agresor instanceof Fuego) {
            return dano / 2; // Resistente a Fuego
        } else if (agresor instanceof Planta) {
            return dano * 2; // Agua es débil contra Planta
        } else if (agresor instanceof Agua) {
            return dano / 2; // Mismo tipo reduce daño
        }
        return dano;
    }
}
