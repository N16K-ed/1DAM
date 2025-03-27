package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.pokemons.Bulbasaur;
import es.masanz.ut7.pokemonfx.model.pokemons.Charmander;

import java.util.ArrayList;

public class Ruta2_Sinnoh_CavernaVeraz extends Mapa {



    @Override
    public void cargarPokemonSalvajes(){
        pokemonSalvajes = new ArrayList<>();
        pokemonSalvajes.add(new Charmander(1));


    }

    @Override
    protected void cargarMapa() {

    }
}
