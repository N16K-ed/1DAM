
package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Charmeleon extends Pokemon implements Fuego {
    public Charmeleon(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 36;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Charizard(this.nivel);
        pokemon.setApodo(this.apodo);
        pokemon.setIVs(this.getIvs());
        pokemon.setHpActual(pokemon.getMaxHP());
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {

        Ataque furiadragon = new Ataque("Furia Dragón", 0, 100, Tipo.NORMAL, false, 35,1,40);
        asignarAtaque(furiadragon.getNombre(), furiadragon);

        Ataque ascuas = new Ataque("Ascuas", 40, 100, Tipo.FUEGO, true, 25,1);
        asignarAtaque(ascuas.getNombre(), ascuas);

        Ataque lanzallamas = new Ataque("Lanzallamas", 95, 100, Tipo.FUEGO, true, 10,1);
        asignarAtaque(lanzallamas.getNombre(), lanzallamas);

        Ataque cuchillada = new Ataque("Cuchillada", 70, 100, Tipo.NORMAL, false, 20,1);
        asignarAtaque(cuchillada.getNombre(), cuchillada);

    }
}