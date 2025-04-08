
package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;
import es.masanz.ut7.pokemonfx.model.type.Volador;

public class Charizard extends Pokemon implements Fuego, Volador {
    public Charizard(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return -1;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }

    @Override
    protected void asignarAtaques() {

        Ataque tajoAereo = new Ataque("Tajo aéreo", 75, 95, Tipo.VOLADOR, true, 15,1);
        asignarAtaque(tajoAereo.getNombre(), tajoAereo);

        Ataque ascuas = new Ataque("Ascuas", 40, 100, Tipo.FUEGO, true, 25,1);
        asignarAtaque(ascuas.getNombre(), ascuas);

        Ataque lanzallamas = new Ataque("Lanzallamas", 95, 100, Tipo.FUEGO, true, 10,1);
        asignarAtaque(lanzallamas.getNombre(), lanzallamas);

        Ataque cuchillada = new Ataque("Cuchillada", 70, 100, Tipo.NORMAL, false, 20,1);
        asignarAtaque(cuchillada.getNombre(), cuchillada);

    }
}