package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Dragon;
import es.masanz.ut7.pokemonfx.model.type.Fantasma;

public class Giratina extends Pokemon implements Dragon, Fantasma {


    public Giratina(int nivel){
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

        Ataque garraDragon = new Ataque("Garra Dragón", 100, 100, Tipo.DRAGON, false, 10,1);
        asignarAtaque(garraDragon.getNombre(), garraDragon);


        Ataque triturar = new Ataque("Triturar", 80, 100, Tipo.SINIESTRO, false, 10,1);
        asignarAtaque(triturar.getNombre(), triturar);


        Ataque golpeUmbrio = new Ataque("Golpe Umbrío", 100, 100, Tipo.FANTASMA, false, 10,1);
        asignarAtaque(golpeUmbrio.getNombre(), golpeUmbrio);


    Ataque esferaAural = new Ataque("Esfera Aural", 80, 100, Tipo.LUCHA, true, 20,2);
        asignarAtaque(esferaAural.getNombre(), esferaAural);

    }
}
