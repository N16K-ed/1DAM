package es.masanz.ut7.pokemonfx.manager;

import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.pokemons.Bulbasaur;

import java.util.List;

public class PokemonManager {

    // TODO 03: Hacer que, en vez de devolver un pokemon de la ruta, devuelva un clon de ese pokemon.
    public static Pokemon generarPokemonSalvaje(String ruta) throws CloneNotSupportedException {
        Pokemon pokemon = null;
        if(MapManager.mapas.containsKey(ruta)){
            List<Pokemon> pokemonSalvajes = MapManager.mapas.get(ruta).getPokemonSalvajes();
            pokemon =  pokemonSalvajes.get((int) (Math.random() * pokemonSalvajes.size()));
        }
        if(pokemon==null){
            pokemon = new Bulbasaur((int)(Math.random()*4+2));
        }
        Pokemon nuevo = (Pokemon) pokemon.clone();
        nuevo.setHpActual(nuevo.getMaxHP());
        return nuevo;
    }

}
