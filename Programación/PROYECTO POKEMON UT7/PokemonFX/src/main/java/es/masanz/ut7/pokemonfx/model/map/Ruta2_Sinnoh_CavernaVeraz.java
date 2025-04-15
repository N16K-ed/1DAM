package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.event.EventoBotiquin;
import es.masanz.ut7.pokemonfx.model.event.EventoCuraPP;
import es.masanz.ut7.pokemonfx.model.event.EventoGalaxia;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import es.masanz.ut7.pokemonfx.model.pokemons.*;

import java.util.ArrayList;

import static es.masanz.ut7.pokemonfx.util.Configuration.*;

public class Ruta2_Sinnoh_CavernaVeraz extends Mapa {



    @Override
    public void cargarPokemonSalvajes(){
        pokemonSalvajes = new ArrayList<>();
        pokemonSalvajes.add(new Golbat(20));
        pokemonSalvajes.add(new Golbat(21));
        pokemonSalvajes.add(new Golbat(22));
        pokemonSalvajes.add(new Golbat(24));
        pokemonSalvajes.add(new Bronzor(26));
        pokemonSalvajes.add(new Bronzor(27));
        pokemonSalvajes.add(new Bibarel(28));



    }@Override
    protected void cargarMapa() {

        int[][] mapaRuta = {
                { 0, 0, 0, 0, 0, 0, 0, 0,17, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,16, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0,10,17, 8, 8, 8, 8,46, 8, 8, 8, 8,16, 9, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0,17, 8,14,10, 6, 6, 6, 6, 6, 6,38,37, 6, 9,13, 8,16, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0,10,17, 8,14, 6, 6, 6, 6, 6, 6,36,35, 6,13, 8,16, 9, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0,17, 8,14,10, 6, 6, 6, 6, 6, 6, 6, 6,36,35, 6, 6, 6, 9,13, 8,16, 0, 0, 0, 0},
                { 0, 0, 0, 0,10,17, 8,14, 6, 6, 6, 6, 6, 6, 6, 6,36,35, 6, 6, 6,13, 8,16, 9, 0, 0, 0, 0},
                { 0, 0,17, 8,14,10, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,36,35, 6, 6, 6, 6, 6, 9,13, 8,16, 0, 0},
                { 0, 0,10,17, 8,14, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,36,35, 6, 6, 6, 6, 6,13, 8,16, 9, 0, 0},
                {17, 8,14,10,38,33,33,33,33,33,33,33,33,33,33,33,43,44,37, 6, 6, 6, 6, 6, 6, 9,13, 8,16},
                {10,17, 8,14,40,34,34,34,34,34,41,45,42,34,34,41,45,45,35, 6, 6, 6, 6, 6, 6,13, 8,16, 9},
                {10,10, 6, 6, 6, 6, 6, 6, 6, 6,36,45,35,38,37,36,45,45,35, 6, 6, 6, 6, 6, 6, 6, 6, 9, 9},
                {10,10, 6, 6,38,33,33,33,33,33,43,45,35,40,39,36,45,45,44,33,33,33,33,33,37, 6, 6, 9, 9},
                {10,10, 6, 6,40,34,34,34,34,34,41,45,44,33,33,43,42,34,34,34,34,34,34,34,39, 6, 6, 9, 9},
                {10,10, 6, 6, 6, 6, 6, 6, 6, 6,36,45,45,45,45,45,35, 6,38,37, 6, 6, 6, 6, 6, 6, 6, 9, 9},
                {10,10, 6, 6,38,33,33,33,33,33,43,45,45,45,45,45,35, 6,40,39, 6, 6, 6, 6, 6, 6, 6, 9, 9},
                {10, 6, 7,12,40,34,34,34,34,34,41,45,45,45,45,45,44,33,33,33,33,33,33,33,37,11, 7, 6, 9},
                { 6, 7,12,10, 6, 6, 6, 6, 6, 6,40,41,42,34,34,34,34,34,34,34,34,34,34,34,39, 9,11, 7, 6},
                { 0, 0,10, 6, 7,12, 6, 6, 6, 6, 6,36,35, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,11, 7, 6, 9, 0, 0},
                { 0, 0, 6, 7,12,10,47, 6, 6, 6, 6,36,35, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 9,11, 7, 6, 0, 0},
                { 0, 0, 0, 0,10, 6, 7,12, 6, 6, 6,36,35, 6, 6, 6, 6, 6, 6, 6, 6,11, 7, 6, 9, 0, 0, 0, 0},
                { 0, 0, 0, 0, 6, 7,12,10, 6, 6, 6,36,35, 6, 6, 6, 6, 6, 6, 6, 6, 9,11, 7, 6, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0,10, 6, 7,12, 6,40,39, 6, 6, 6, 6, 6, 6,11, 7, 6, 9, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 6, 7,12,10, 6, 6, 6, 6,48, 6, 6, 6, 6, 9,11, 7, 6, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0,10, 6, 7, 7,12, 6, 6, 6,11, 7, 7, 6, 9, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0, 6, 7, 7,12,10, 6, 6, 6, 9,11, 7, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,10,10, 6, 6, 6, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,10,10, 6, 6, 6, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,10,10, 6, 6, 6, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,10,10, 6, 6, 6, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,10,10, 6, 6, 6, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,10, 6, 7,28, 7, 6, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 7, 7, 7, 7, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},

                };

        this.inicioX = 14;
        this.inicioY = 29;

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;
        this.nombre = "Caverna Veraz";

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();

        // teleportMap[3][9] = "Ruta 1";

        Entrenador galaxia1 = new Entrenador();
        galaxia1.incluirPokemonParaCombatir(0, new Bronzor(33));
        galaxia1.incluirPokemonParaCombatir(1, new Bronzor(34));

        Entrenador galaxia2 = new Entrenador();
        galaxia2.incluirPokemonParaCombatir(0, new Bronzor(36));
        galaxia2.incluirPokemonParaCombatir(1, new Bronzong(37));
        galaxia2.incluirPokemonParaCombatir(2, new Golbat(35));

        Entrenador galaxia3 = new Entrenador();
        galaxia3.incluirPokemonParaCombatir(0, new Golbat(38));

        Entrenador galaxia4 = new Entrenador();
        galaxia4.incluirPokemonParaCombatir(0, new Bronzong(37));
        galaxia4.incluirPokemonParaCombatir(1, new Golbat(34));

        npcs.add(new NPC(13, 22, DERECHA,6, galaxia1));
        npcs.add(new NPC(14, 2, ABAJO,6, galaxia2));
        npcs.add(new NPC(12, 15, DERECHA,6, galaxia3));
        npcs.add(new NPC(16, 7, IZQUIERDA,6, galaxia4));


        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < anchura; x++) {
                switch (mapaRuta[y][x]) {
                    case 0:
                        mapData[y][x] = TileType.NEGRO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
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
                        mapData[y][x] = TileType.CUEVA_SALVAJE.ordinal();
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
                    case 16:
                        mapData[y][x] = TileType.MONTE_ESQUINA_INTERIOR_DER.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 17:
                        mapData[y][x] = TileType.MONTE_ESQUINA_INTERIOR_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 20: //BORDE DEL AGUA DER
                        mapData[y][x] = TileType.AGUA_BORDE_DER.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 21: //BORDE DEL AGUA IZD
                        mapData[y][x] = TileType.AGUA_BORDE_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 22: //BORDE DEL AGUA ABAJO
                        mapData[y][x] = TileType.AGUA_BORDE_ABAJO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 23: //BORDE DEL AGUA ARRIBA
                        mapData[y][x] = TileType.AGUA_BORDE_ARRIBA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 24: //ESQUINA DEL BORDE DEL AGUA ARRIBA-DER
                        mapData[y][x] = TileType.AGUA_ESQUINA_ARRIBA_DER.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 25: //ESQUINA DEL BORDE DEL AGUA ARRIBA-IZD
                        mapData[y][x] = TileType.AGUA_ESQUINA_ARRIBA_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 26: //ESQUINA DEL BORDE DEL AGUA ABAJO-DER
                        mapData[y][x] = TileType.AGUA_ESQUINA_ABAJO_DER.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 27: //ESQUINA DEL BORDE DEL AGUA ABAJO-IZD
                        mapData[y][x] = TileType.AGUA_ESQUINA_ABAJO_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 28: //PUERTA DE CUEVA
                        mapData[y][x] = TileType.PUERTA_CUEVA_AL_REVES.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        teleportMap[y][x] = "Lago Veraz";
                        break;
                    case 29: //GIRO AGUA ARRIBA-DER
                        mapData[y][x] = TileType.GIRO_BORDE_AGUA_ARRIBA_DER.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 30: //GIRO AGUA ARRIBA-IZD
                        mapData[y][x] = TileType.GIRO_BORDE_AGUA_ARRIBA_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 31: //GIRO AGUA ABAJO-DER
                        mapData[y][x] = TileType.GIRO_BORDE_AGUA_ABAJO_DER.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 32: //GIRO AGUA ABAJO-IZD
                        mapData[y][x] = TileType.GIRO_BORDE_AGUA_ABAJO_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 33:
                        mapData[y][x] = TileType.AGUA_CUEVA_ABAJO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 34:
                        mapData[y][x] = TileType.AGUA_CUEVA_ARRIBA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 35:
                        mapData[y][x] = TileType.AGUA_CUEVA_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 36:
                        mapData[y][x] = TileType.AGUA_CUEVA_DER.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 37:
                        mapData[y][x] = TileType.AGUA_CUEVA_ESQUINA_ARRIBA_DER.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 38:
                        mapData[y][x] = TileType.AGUA_CUEVA_ESQUINA_ARRIBA_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 39:
                        mapData[y][x] = TileType.AGUA_CUEVA_ESQUINA_ABAJO_DER.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 40:
                        mapData[y][x] = TileType.AGUA_CUEVA_ESQUINA_ABAJO_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 41:
                        mapData[y][x] = TileType.AGUA_CUEVA_ESQUINA_REVERSE_ARRIBA_DER.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 42:
                        mapData[y][x] = TileType.AGUA_CUEVA_ESQUINA_REVERSE_ARRIBA_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 43:
                        mapData[y][x] = TileType.AGUA_CUEVA_ESQUINA_REVERSE_ABAJO_DER.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 44:
                        mapData[y][x] = TileType.AGUA_CUEVA_ESQUINA_REVERSE_ABAJO_IZD.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 45:
                        mapData[y][x] = TileType.AGUA_CUEVA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 46:
                        mapData[y][x] = TileType.PUERTA_CUEVA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        teleportMap[y][x] = "Mundo Distorsión";
                        break;
                    case 47:
                        mapData[y][x] = TileType.MONTE_CENTRO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        eventsMap[y][x] = new EventoCuraPP();
                        break;
                    case 48:
                        mapData[y][x] = TileType.MONTE_CENTRO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        eventsMap[y][x] = new EventoGalaxia();
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
