package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.event.EventoBotiquin;
import es.masanz.ut7.pokemonfx.model.event.EventoHelio;
import es.masanz.ut7.pokemonfx.model.event.EventoHelioCombate;
import es.masanz.ut7.pokemonfx.model.event.EventoMensaje;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import es.masanz.ut7.pokemonfx.model.pokemons.Bronzong;
import es.masanz.ut7.pokemonfx.model.pokemons.Bulbasaur;

import java.util.ArrayList;

import static es.masanz.ut7.pokemonfx.util.Configuration.ABAJO;

public class MundoDistorsion extends Mapa {
    @Override
    protected void cargarMapa() {

        int[][] mapaRuta = {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,20,19,19,18, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,16,12,11,17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,16,10, 9,17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,15,14,14,13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1,20, 3,18, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,20,19,18, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1,15,14,13, 1,20,19,19,19, 3,19,18, 1, 1,16, 7,17, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1,16, 7, 3, 2, 2, 7,17, 1, 1,16, 6,17, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1,16, 6, 2, 2, 2, 4,17, 1, 1,16, 4,17, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1,16, 4, 2, 2, 2, 8,17, 1, 1,15,14,13, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1,15,14,21,25,22,14,13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,16,24,17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,16, 2, 2,18, 1,20,19,18, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,16, 2, 8,17, 1,16, 8,17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1,20,18, 1, 1,16, 2,22,13, 1,15,14,13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1,15,13, 1, 1,16,23,17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,16, 2,17,20, 3,19,19,18, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,16, 2, 2, 2, 2, 7, 8, 2,18, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,16, 2, 2, 8, 2, 2, 2, 2,17, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,15,21, 2, 2, 2,22,14,14,13, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1,20,18, 1,15,14,14,14,13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1,15,13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,20,19,19,18, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,16,12,11,17, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,16,10, 9,17, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,15,14,14,13, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}

        };

        this.inicioX = 18;
        this.inicioY = 20;

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;
        this.nombre = "Mundo Distorsión";

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();

        teleportMap[3][9] = "Caverna Veraz";

        Entrenador helio = new Entrenador();
        helio.incluirPokemonParaCombatir(0, new Bronzong(40));

        npcs.add(new NPC(12, 10, ABAJO, 5, helio));

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < anchura; x++) {
                switch (mapaRuta[y][x]) {
                    case 1:
                        mapData[y][x] = TileType.VACIO_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 2:
                        mapData[y][x] = TileType.TIERRA_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 3:
                        mapData[y][x] = TileType.ROCA_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 4:
                        mapData[y][x] = TileType.PALMERA_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 5:
                        mapData[y][x] = TileType.TELEPORT_RED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        teleportMap[y][x] = "Ruta 1";
                        break;
                    case 6:
                        mapData[y][x] = TileType.PALMERA_MEDIO_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 7:
                        mapData[y][x] = TileType.PALMERA_ARRIBA_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 8:
                        mapData[y][x] = TileType.BOQUETE_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 9:
                        mapData[y][x] = TileType.GIRO_ABJ_DER_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 10:
                        mapData[y][x] = TileType.GIRO_ABJ_IZD_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 11:
                        mapData[y][x] = TileType.GIRO_ARR_DER_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 12:
                        mapData[y][x] = TileType.GIRO_ARR_IZD_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 13:
                        mapData[y][x] = TileType.ESQUINA_ABAJO_DER_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 14:
                        mapData[y][x] = TileType.ESQUINA_ABAJO_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 15:
                        mapData[y][x] = TileType.ESQUINA_ABAJO_IZD_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 16:
                        mapData[y][x] = TileType.ESQUINA_IZD_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 17:
                        mapData[y][x] = TileType.ESQUINA_DER_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 18:
                        mapData[y][x] = TileType.ESQUINA_ARRIBA_DER_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 19:
                        mapData[y][x] = TileType.ESQUINA_ARRIBA_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 20:
                        mapData[y][x] = TileType.ESQUINA_ARRIBA_IZD_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 21:
                        mapData[y][x] = TileType.INTERNO_DER_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 22:
                        mapData[y][x] = TileType.INTERNO_IZD_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 23:
                        mapData[y][x] = TileType.TIERRA_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        eventsMap[y][x] = new EventoBotiquin();
                        break;
                    case 24:
                        mapData[y][x] = TileType.TIERRA_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        eventsMap[y][x] = new EventoHelio();
                        break;
                    case 25:
                        mapData[y][x] = TileType.TIERRA_DISTORSION.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        eventsMap[y][x] = new EventoHelioCombate();
                        break;
                    default:
                        mapData[y][x] = TileType.CAMINO_BLANCO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                }
            }
        }
    }

    @Override
    public void cargarPokemonSalvajes() {

    }
}