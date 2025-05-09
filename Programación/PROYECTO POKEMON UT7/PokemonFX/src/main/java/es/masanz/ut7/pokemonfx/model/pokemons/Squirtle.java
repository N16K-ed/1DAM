package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;

public class Squirtle extends Pokemon implements Agua {

    public Squirtle(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 16;
    }//-1 para q no evoucione.

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Wartortle(this.nivel);
        pokemon.setApodo(this.apodo);
        pokemon.setIVs(this.getIvs());
        pokemon.setHpActual(pokemon.getMaxHP());
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {
        // Nivel 1: Placaje
        Ataque placaje = new Ataque("Placaje", 35, 95, Tipo.NORMAL, false, 35,1);
        asignarAtaque(placaje.getNombre(), placaje);

        // Nivel 7: Burbuja
        Ataque burbuja = new Ataque("Burbuja", 20, 100, Tipo.AGUA, true, 30,1);
        asignarAtaque(burbuja.getNombre(), burbuja);

        // Nivel 15: Pistola Agua
        Ataque pistolaAgua = new Ataque("Pistola agua", 40, 90, Tipo.AGUA, true, 20,1);
        asignarAtaque(pistolaAgua.getNombre(), pistolaAgua);

        // Nivel 20: Mordisco
        Ataque mordisco = new Ataque("Mordisco", 60, 90, Tipo.SINIESTRO, false, 25,1);
        asignarAtaque(mordisco.getNombre(), mordisco);

        // Nivel 31: Hidropulso
        Ataque hidropulso = new Ataque("Hidropulso", 60, 85, Tipo.AGUA, true, 20,1);
        asignarAtaque(hidropulso.getNombre(), hidropulso);

        // Nivel 37: Cabezazo
        Ataque cabezazo = new Ataque("Cabezazo", 70, 90, Tipo.NORMAL, false, 15,1);
        asignarAtaque(cabezazo.getNombre(), cabezazo);

        // Nivel 43: Hidrobomba
        Ataque hidrobomba = new Ataque("Hidrobomba", 110, 80, Tipo.AGUA, true, 5,1);
        asignarAtaque(hidrobomba.getNombre(), hidrobomba);

    }

}