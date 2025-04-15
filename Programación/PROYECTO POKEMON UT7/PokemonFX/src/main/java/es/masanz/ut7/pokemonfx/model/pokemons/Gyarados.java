package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;
import es.masanz.ut7.pokemonfx.model.type.Volador;

public class Gyarados extends Pokemon implements Agua, Volador {

    public Gyarados(int nivel){
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

        Ataque avalancha = new Ataque("Avalancha", 60, 85, Tipo.ROCA, false, 15,1);
        asignarAtaque(avalancha.getNombre(), avalancha);

        Ataque colmilloHielo = new Ataque("Colmillo Hielo", 65, 95, Tipo.HIELO, false, 35,1);
        asignarAtaque(colmilloHielo.getNombre(), colmilloHielo);

        Ataque cascada = new Ataque("Cascada", 80, 100, Tipo.AGUA, true, 15,1);
        asignarAtaque(cascada.getNombre(), cascada);

        Ataque triturar = new Ataque("Triturar", 80, 100, Tipo.SINIESTRO, false, 10,1);
        asignarAtaque(triturar.getNombre(), triturar);
    }
}
