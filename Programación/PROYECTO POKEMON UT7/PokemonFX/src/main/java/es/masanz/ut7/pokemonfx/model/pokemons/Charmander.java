package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Charmander extends Pokemon implements Fuego {

    public Charmander(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 16;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Charmeleon(this.nivel);
        pokemon.setApodo(this.apodo);
        pokemon.setIVs(this.getIvs());
        pokemon.setHpActual(pokemon.getMaxHP());
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {

        Ataque aranazo = new Ataque("Arañazo", 40, 100, Tipo.NORMAL, false, 35,1);
        asignarAtaque(aranazo.getNombre(), aranazo);

        Ataque ascuas = new Ataque("Ascuas", 40, 100, Tipo.FUEGO, true, 25,1);
        asignarAtaque(ascuas.getNombre(), ascuas);

        Ataque lanzallamas = new Ataque("Lanzallamas", 95, 100, Tipo.FUEGO, true, 10,1);
        asignarAtaque(lanzallamas.getNombre(), lanzallamas);

        Ataque cuchillada = new Ataque("Cuchillada", 70, 100, Tipo.NORMAL, false, 20,1);
        asignarAtaque(cuchillada.getNombre(), cuchillada);

    }

}