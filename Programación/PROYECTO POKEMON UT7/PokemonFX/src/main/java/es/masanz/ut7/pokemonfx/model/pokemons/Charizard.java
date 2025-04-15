
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

        Ataque pulsoDragon = new Ataque("Pulso dragón", 80, 100, Tipo.DRAGON, true, 15,1);
        asignarAtaque(pulsoDragon.getNombre(), pulsoDragon);

        Ataque lanzallamas = new Ataque("Lanzallamas", 95, 100, Tipo.FUEGO, true, 10,1);
        asignarAtaque(lanzallamas.getNombre(), lanzallamas);

        Ataque garraUmbria = new Ataque("Garra umbría", 80, 100, Tipo.FANTASMA, false, 15,1);
        asignarAtaque(garraUmbria.getNombre(), garraUmbria);

    }
}