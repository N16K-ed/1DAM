package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Veneno;
import es.masanz.ut7.pokemonfx.model.type.Volador;

public class Crobat extends Pokemon implements  Veneno, Volador {
    public Crobat(int nivel){
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

        Ataque venenoX = new Ataque("Veneno X", 70, 100, Tipo.VENENO, false, 15,1);
        asignarAtaque(venenoX.getNombre(), venenoX);


        Ataque triturar = new Ataque("Triturar", 80, 100, Tipo.SINIESTRO, false, 25,1);
        asignarAtaque(triturar.getNombre(), triturar);


        Ataque ataqueAla = new Ataque("Ataque ala", 60, 100, Tipo.VOLADOR, false, 35,1);
        asignarAtaque(ataqueAla.getNombre(), ataqueAla);


        Ataque tajoAereo = new Ataque("Tajo aéreo", 75, 95, Tipo.NORMAL, true, 15,1);
        asignarAtaque(tajoAereo.getNombre(), tajoAereo);

    }
}