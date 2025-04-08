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
        //NUEVO
        Ataque bombaLodo = new Ataque("Bomba Lodo", 90,100, Tipo.VENENO,true, 10,1);
        asignarAtaque(bombaLodo.getNombre(), bombaLodo);
    }
}