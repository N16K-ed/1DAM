package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Planta;
import es.masanz.ut7.pokemonfx.model.type.Veneno;

public class Bulbasaur extends Pokemon implements Planta, Veneno {

    public Bulbasaur(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 16;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Ivysaur(this.nivel);
        pokemon.setApodo(this.apodo);
        pokemon.setIVs(this.getIvs());
        pokemon.setHpActual(pokemon.getMaxHP());
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {
        // Nivel 1: Placaje
        Ataque placaje = new Ataque("Placaje", 35, 95, Tipo.NORMAL, false, 35,1);
        asignarAtaque(placaje.getNombre(), placaje);

        // Nivel 10: Látigo Cepa
        Ataque latigoCepa = new Ataque("Látigo cepa", 35, 90, Tipo.PLANTA, false, 15,1);
        asignarAtaque(latigoCepa.getNombre(), latigoCepa);

        // Nivel 20: Hoja Afilada
        Ataque hojaAfilada = new Ataque("Hoja afilada", 55, 95, Tipo.PLANTA, false, 25,1);
        asignarAtaque(hojaAfilada.getNombre(), hojaAfilada);

        // Nivel 25: Doble Filo
        Ataque dobleFilo = new Ataque("Doble filo", 120, 80, Tipo.NORMAL, false, 10,1);
        asignarAtaque(dobleFilo.getNombre(), dobleFilo);

        // Nivel 32: Rayo Solar
        Ataque rayoSolar = new Ataque("Rayo solar", 120, 80, Tipo.PLANTA, true, 10,1);
        asignarAtaque(rayoSolar.getNombre(), rayoSolar);

    }

}