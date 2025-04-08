package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Acero;
import es.masanz.ut7.pokemonfx.model.type.Psiquico;

public class Bronzor extends Pokemon implements Acero, Psiquico {

    public Bronzor(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 33;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Bronzong(this.nivel);
        pokemon.setApodo(this.apodo);
        pokemon.setIVs(this.getIvs());
        pokemon.setHpActual(pokemon.getMaxHP());
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {
        Ataque cabezaHierro = new Ataque("Cabeza de Hierro", 80, 100, Tipo.ACERO, false, 10,1);
        asignarAtaque(cabezaHierro.getNombre(), cabezaHierro);

        Ataque psicorrayo = new Ataque("Psicorrayo", 60, 100, Tipo.PSIQUICO, true, 15,1);
        asignarAtaque(psicorrayo.getNombre(), psicorrayo);

        Ataque bombasonica = new Ataque("Bomba Sónica", 0, 100, Tipo.NORMAL, false, 20,1, 20);
        asignarAtaque(bombasonica.getNombre(), bombasonica);

        Ataque focoresplandor = new Ataque("Foco Resplandor", 80, 100, Tipo.ACERO, true, 10,1);
        asignarAtaque(focoresplandor.getNombre(), focoresplandor);

        Ataque bofetonLodo = new Ataque("Bofetón Lodo", 20, 100, Tipo.TIERRA, true, 10,1);
        asignarAtaque(bofetonLodo.getNombre(), bofetonLodo);
    }

}