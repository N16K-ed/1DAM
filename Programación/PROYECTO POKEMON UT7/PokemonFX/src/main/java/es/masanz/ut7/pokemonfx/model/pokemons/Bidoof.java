package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Normal;

public class Bidoof extends Pokemon implements Normal {

    public Bidoof(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 15;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Bibarel(this.nivel);
        pokemon.setApodo(this.apodo);
        pokemon.setIVs(this.getIvs());
        pokemon.setHpActual(pokemon.getMaxHP());
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {
        Ataque aranazo = new Ataque("Arañazo", 40, 100, Tipo.NORMAL, false, 35);
        asignarAtaque(aranazo.getNombre(), aranazo);

        Ataque corte = new Ataque("Corte", 50, 95, Tipo.NORMAL, false, 30);
        asignarAtaque(corte.getNombre(), corte);

        Ataque bofetonLodo = new Ataque("Bofetón Lodo", 20, 100, Tipo.TIERRA, true, 10);
        asignarAtaque(bofetonLodo.getNombre(), bofetonLodo);
    }

}