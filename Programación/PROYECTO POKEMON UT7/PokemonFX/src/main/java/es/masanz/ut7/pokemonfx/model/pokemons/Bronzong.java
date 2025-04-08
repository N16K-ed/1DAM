package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Acero;
import es.masanz.ut7.pokemonfx.model.type.Psiquico;

public class Bronzong extends Pokemon implements Acero, Psiquico {

    public Bronzong(int nivel) {
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
        Ataque cabezaHierro = new Ataque("Cabezahierro", 80, 100, Tipo.ACERO, false, 10,1);
        asignarAtaque(cabezaHierro.getNombre(), cabezaHierro);

        Ataque Psiquico = new Ataque("Psíquico", 90, 100, Tipo.PSIQUICO, true, 15,1);
        asignarAtaque(Psiquico.getNombre(), Psiquico);


        Ataque bofetonLodo = new Ataque("Bofetón Lodo", 20, 100, Tipo.TIERRA, true, 10,1);
        asignarAtaque(bofetonLodo.getNombre(), bofetonLodo);

        Ataque focoresplandor = new Ataque("Foco Resplandor", 80, 100, Tipo.ACERO, true, 10,1);
        asignarAtaque(focoresplandor.getNombre(), focoresplandor);

        Ataque psicorrayo = new Ataque("Psicorrayo", 60, 100, Tipo.PSIQUICO, true, 15,1);
        asignarAtaque(psicorrayo.getNombre(), psicorrayo);
    }

}