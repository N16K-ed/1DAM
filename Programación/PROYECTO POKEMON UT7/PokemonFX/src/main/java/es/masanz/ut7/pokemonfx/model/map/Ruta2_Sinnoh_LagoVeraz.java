package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.event.EventoMensaje;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import es.masanz.ut7.pokemonfx.model.pokemons.Bibarel;
import es.masanz.ut7.pokemonfx.model.pokemons.Bidoof;
import es.masanz.ut7.pokemonfx.model.pokemons.Bulbasaur;
import es.masanz.ut7.pokemonfx.model.pokemons.Squirtle;

import java.util.ArrayList;

import static es.masanz.ut7.pokemonfx.util.Configuration.ABAJO;

public class Ruta2_Sinnoh_LagoVeraz extends Mapa {



    @Override
    public void cargarPokemonSalvajes(){
        pokemonSalvajes = new ArrayList<>();
        pokemonSalvajes.add(new Squirtle(21));
        pokemonSalvajes.add(new Bidoof(19));
        pokemonSalvajes.add(new Bidoof(15));
        pokemonSalvajes.add(new Bibarel(38));
        pokemonSalvajes.add(new Bibarel(39));
    }

    @Override
    protected void cargarMapa() {

        int[][] mapaRuta = {
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,25,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,24,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,25,23,31,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,32,23,24,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,25,23,31,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,32,23,24,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,25,23,31,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,32,23,24,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,25,23,31,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,32,23,24,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,30,22,22,22,22,22,22,22,22,29,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,21,15,15,15,15,15,15,15,15,15,15,15,15,20,11, 9, 7, 7, 7, 7,10,12,21,15,15,15,15,15,15,15,15,15,15,15,15,20,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,20, 9, 9, 6, 6, 6, 6,10,10,21,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,21,15,15,15,15,15,15,15,15,15,15,15,15,20, 9, 9, 6, 6, 6, 6,10,10,21,15,15,15,15,15,15,15,15,15,15,15,15,20,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,20, 9,13, 8, 8, 8, 8,14,10,21,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,21,15,15,15,15,15,15,15,15,15,15,15,15,20,13, 8, 8,28, 8, 8, 8,14,21,15,15,15,15,15,15,15,15,15,15,15,15,20,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,21,15,15,15,15,15,15,15,15,15,15,15,15,20, 6, 6, 6, 6, 6, 6, 6, 6,21,15,15,15,15,15,15,15,15,15,15,15,15,20,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,21,15,15,15,15,15,15,15,15,15,15,15,15,32,24, 6, 6, 6, 6, 6, 6,25,31,15,15,15,15,15,15,15,15,15,15,15,15,20, 2, 4, 4, 4,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,27,22,29,15,15,15,15,15,15,15,15,15,15,15,32,23,24, 2,25,23,23,31,15,15,15,15,15,15,15,15,15,15,15,15,15,20, 3, 2, 2, 4,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,21,15,15,15,15,15,15,15,15,15,15,15,15,15,20, 2,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,30,22,26, 3, 3, 2, 2,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,27,22,29,15,15,15,15,15,15,15,15,30,22,22,26, 2,27,22,22,22,22,22,22,22,22,22,22,22,22,22,22,26, 3, 3, 3, 3, 2, 2,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17, 4, 2, 2, 4,16,17,21,15,15,15,15,15,15,15,15,20, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19, 2, 2, 2, 2,18,19,27,22,22,22,22,22,22,22,22,26, 2,25,23,23,23,23,23,23,23,23,23,23,23,23,23,23,24, 2, 2, 3, 3, 3, 3, 3, 2, 2,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,21,15,15,15,15,15,15,15,15,15,15,15,15,15,30,26, 2, 2, 3, 3, 3, 3, 2,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2,25,23,23,23,23,23,23,31,15,15,15,15,15,15,15,15,15,15,15,15,15,20, 2, 2, 2, 3, 3, 3, 2, 2,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2,16,17,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,30,22,26, 2, 2, 2, 2, 2, 2, 2, 2,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2,18,19,27,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,26, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17, 2, 2, 2, 2, 2, 2,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19, 2, 2, 2, 2, 2, 2,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17, 4, 2, 2, 2, 2, 2,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19, 4, 4, 4,33, 2, 2,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17, 2, 2,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19, 5, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19, 2, 2,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
                {16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17,16,17},
                {18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19,18,19},
        };

        this.inicioX = 45;
        this.inicioY = 45;

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;
        this.nombre = "Lago Veraz";

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();

        teleportMap[3][9] = "Caverna Veraz";

        Entrenador helio = new Entrenador();
        helio.incluirPokemonParaCombatir(0, new Bulbasaur(35));

        npcs.add(new NPC(2, 1, ABAJO, helio));

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < anchura; x++) {
                switch (mapaRuta[y][x]) {
                    case 1:
                        mapData[y][x] = TileType.PARED_BLANCA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 2:
                        mapData[y][x] = TileType.CESPED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 3:
                        mapData[y][x] = TileType.CESPED_HIERBA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 4:
                        mapData[y][x] = TileType.CESPED_ARBUSTO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 5:
                        mapData[y][x] = TileType.TELEPORT_RED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        teleportMap[y][x] = "Ruta 1";
                        break;
                    case 6:
                        mapData[y][x] = TileType.MONTE_CENTRO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 7:
                        mapData[y][x] = TileType.MONTE_BORDE_SUPERIOR.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 8:
                        mapData[y][x] = TileType.MONTE_BORDE_INFERIOR.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 9:
                        mapData[y][x] = TileType.MONTE_BORDE_IZQUIERDA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 10:
                        mapData[y][x] = TileType.MONTE_BORDE_DERECHA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 11:
                        mapData[y][x] = TileType.MONTE_ESQUINA_SUPERIOR_IZQUIERDA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 12:
                        mapData[y][x] = TileType.MONTE_ESQUINA_SUPERIOR_DERECHA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 13:
                        mapData[y][x] = TileType.MONTE_ESQUINA_INFERIOR_IZQUIERDA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 14:
                        mapData[y][x] = TileType.MONTE_ESQUINA_INFERIOR_DERECHA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 15: //AGUA
                        mapData[y][x] = TileType.AGUA1.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal(); //Cambiar si añade función del agua
                        break;
                    case 16: //ARBOL1
                        mapData[y][x] = TileType.ARBOL_ARRIBA_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 17: //ARBOL2
                        mapData[y][x] = TileType.ARBOL_ARRIBA_DER.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 18: //ARBOL 3
                        mapData[y][x] = TileType.ARBOL_ABAJO_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 19: //ARBOL4
                        mapData[y][x] = TileType.ARBOL_ABAJO_DER.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 20: //BORDE DEL AGUA DER
                        mapData[y][x] = TileType.AGUA_BORDE_DER.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 21: //BORDE DEL AGUA IZD
                        mapData[y][x] = TileType.AGUA_BORDE_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 22: //BORDE DEL AGUA ABAJO
                        mapData[y][x] = TileType.AGUA_BORDE_ABAJO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 23: //BORDE DEL AGUA ARRIBA
                        mapData[y][x] = TileType.AGUA_BORDE_ARRIBA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 24: //ESQUINA DEL BORDE DEL AGUA ARRIBA-DER
                        mapData[y][x] = TileType.AGUA_ESQUINA_ARRIBA_DER.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 25: //ESQUINA DEL BORDE DEL AGUA ARRIBA-IZD
                        mapData[y][x] = TileType.AGUA_ESQUINA_ARRIBA_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 26: //ESQUINA DEL BORDE DEL AGUA ABAJO-DER
                        mapData[y][x] = TileType.AGUA_ESQUINA_ABAJO_DER.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 27: //ESQUINA DEL BORDE DEL AGUA ABAJO-IZD
                        mapData[y][x] = TileType.AGUA_ESQUINA_ABAJO_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 28: //PUERTA DE CUEVA
                        mapData[y][x] = TileType.PUERTA_CUEVA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        teleportMap[y][x] = "Caverna Veraz";
                        break;
                    case 29: //GIRO AGUA ARRIBA-DER
                        mapData[y][x] = TileType.GIRO_BORDE_AGUA_ARRIBA_DER.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 30: //GIRO AGUA ARRIBA-IZD
                        mapData[y][x] = TileType.GIRO_BORDE_AGUA_ARRIBA_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 31: //GIRO AGUA ABAJO-DER
                        mapData[y][x] = TileType.GIRO_BORDE_AGUA_ABAJO_DER.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 32: //GIRO AGUA ABAJO-IZD
                        mapData[y][x] = TileType.GIRO_BORDE_AGUA_ABAJO_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 33: //CARTEL
                        mapData[y][x] = TileType.CESPED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        eventsMap[y][x] = new EventoMensaje();
                        break;
                    default:
                        mapData[y][x] = TileType.CAMINO_BLANCO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                }
            }
        }
    }
}
