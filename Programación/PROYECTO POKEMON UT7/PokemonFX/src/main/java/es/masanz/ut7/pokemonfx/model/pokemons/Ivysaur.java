<<<<<<< HEAD
package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Planta;
import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Veneno;


public class Ivysaur extends Pokemon implements Planta, Veneno{

        public Ivysaur(int nivel){
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
            Ataque placaje = new Ataque("placaje", 35, 95, Tipo.NORMAL, false, 35);
            asignarAtaque(placaje.getNombre(), placaje);

            // Nivel 10: Látigo Cepa
            Ataque latigoCepa = new Ataque("látigo cepa", 35, 90, Tipo.PLANTA, false, 15);
            asignarAtaque(latigoCepa.getNombre(), latigoCepa);

            // Nivel 20: Hoja Afilada
            Ataque hojaAfilada = new Ataque("hoja afilada", 55, 95, Tipo.PLANTA, false, 25);
            asignarAtaque(hojaAfilada.getNombre(), hojaAfilada);

            // Nivel 25: Doble Filo
            Ataque dobleFilo = new Ataque("doble filo", 120, 80, Tipo.NORMAL, false, 10);
            asignarAtaque(dobleFilo.getNombre(), dobleFilo);

            // Nivel 32: Rayo Solar
            Ataque rayoSolar = new Ataque("rayo solar", 120, 80, Tipo.PLANTA, true, 10);
            asignarAtaque(rayoSolar.getNombre(), rayoSolar);

        }


}
=======
package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Planta;
import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Veneno;


public class Ivysaur extends Pokemon implements Planta, Veneno{

        public Ivysaur(int nivel){
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
            Ataque placaje = new Ataque("placaje", 35, 95, Tipo.NORMAL, false, 35);
            asignarAtaque(placaje.getNombre(), placaje);

            // Nivel 10: Látigo Cepa
            Ataque latigoCepa = new Ataque("látigo cepa", 35, 90, Tipo.PLANTA, false, 15);
            asignarAtaque(latigoCepa.getNombre(), latigoCepa);

            // Nivel 20: Hoja Afilada
            Ataque hojaAfilada = new Ataque("hoja afilada", 55, 95, Tipo.PLANTA, false, 25);
            asignarAtaque(hojaAfilada.getNombre(), hojaAfilada);

            // Nivel 25: Doble Filo
            Ataque dobleFilo = new Ataque("doble filo", 120, 80, Tipo.NORMAL, false, 10);
            asignarAtaque(dobleFilo.getNombre(), dobleFilo);

            // Nivel 32: Rayo Solar
            Ataque rayoSolar = new Ataque("rayo solar", 120, 80, Tipo.PLANTA, true, 10);
            asignarAtaque(rayoSolar.getNombre(), rayoSolar);

        }


}
>>>>>>> 067c080c5e854d987328b2e03df9801a4b453a0e
