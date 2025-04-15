package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;

public class Blastoise extends Pokemon implements Agua {
    public Blastoise(int nivel){
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

        // Nivel 20: Mordisco
        Ataque triturar = new Ataque("Triturar", 80, 90, Tipo.SINIESTRO, false, 25,1);
        asignarAtaque(triturar.getNombre(), triturar);

        // Nivel 31: Hidropulso
        Ataque hidropulso = new Ataque("Hidropulso", 60, 100, Tipo.AGUA, true, 20,1);
        asignarAtaque(hidropulso.getNombre(), hidropulso);

        // Nivel 37: Cabezazo
        Ataque cabezazo = new Ataque("Cabezazo", 70, 90, Tipo.NORMAL, false, 15,1);
        asignarAtaque(cabezazo.getNombre(), cabezazo);

        // Nivel 43: Hidrobomba
        Ataque hidrobomba = new Ataque("Hidrobomba", 110, 80, Tipo.AGUA, true, 5,1);
        asignarAtaque(hidrobomba.getNombre(), hidrobomba);

    }
}