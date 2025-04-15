package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Planta;
import es.masanz.ut7.pokemonfx.model.type.Veneno;

public class Venusaur extends Pokemon implements Planta, Veneno {
    public Venusaur(int nivel){
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

        Ataque rayoSolar = new Ataque("Rayo solar", 120, 80, Tipo.PLANTA, true, 10,1);
        asignarAtaque(rayoSolar.getNombre(), rayoSolar);

        Ataque bombaLodo = new Ataque("Bomba Lodo", 90,100, Tipo.VENENO,true, 10,1);
        asignarAtaque(bombaLodo.getNombre(), bombaLodo);

        Ataque rayo = new Ataque("Rayo", 95,100, Tipo.ELECTRICO,true, 10,1);
        asignarAtaque(rayo.getNombre(), rayo);

        Ataque rayoHielo = new Ataque("Rayo Hielo",90,100, Tipo.HIELO, true, 10,1);
        asignarAtaque(rayoHielo.getNombre(), rayoHielo);
    }
}