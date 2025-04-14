package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;
import es.masanz.ut7.pokemonfx.model.type.Normal;

public class Bibarel extends Pokemon implements Normal, Agua {

    public Bibarel(int nivel) {
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

        Ataque aranazo = new Ataque("Arañazo", 40, 100, Tipo.NORMAL, false, 35, 1);
        asignarAtaque(aranazo.getNombre(), aranazo);

        Ataque corte = new Ataque("Corte", 50, 95, Tipo.NORMAL, false, 30,1);
        asignarAtaque(corte.getNombre(), corte);

        Ataque bofetonLodo = new Ataque("Bofetón Lodo", 20, 100, Tipo.TIERRA, true, 10,1);
        asignarAtaque(bofetonLodo.getNombre(), bofetonLodo);

        Ataque cascada = new Ataque("Cascada", 80, 100, Tipo.AGUA, true, 15,1);
        asignarAtaque(cascada.getNombre(), cascada);

        Ataque cuchillada = new Ataque("Cuchillada", 70, 100, Tipo.NORMAL, false, 20,1);
        asignarAtaque(cuchillada.getNombre(), cuchillada);

        Ataque hiperrayo = new Ataque("Hiperrayo", 150, 90, Tipo.NORMAL, true, 5,1);
        asignarAtaque(hiperrayo.getNombre(), hiperrayo);

    }

}