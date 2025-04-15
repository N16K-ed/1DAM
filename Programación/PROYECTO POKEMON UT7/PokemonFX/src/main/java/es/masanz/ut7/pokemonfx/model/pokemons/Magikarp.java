package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;

public class Magikarp extends Pokemon implements Agua {


    public Magikarp(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 20;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Gyarados(this.nivel);
        pokemon.setApodo(this.apodo);
        pokemon.setIVs(this.getIvs());
        pokemon.setHpActual(pokemon.getMaxHP());
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {

        Ataque placaje = new Ataque("Placaje", 40, 100, Tipo.NORMAL, false, 35,1);
        asignarAtaque(placaje.getNombre(), placaje);

    }
}
