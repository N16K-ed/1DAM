package es.masanz.ut7.pokemonfx.app;

import es.masanz.ut7.pokemonfx.controller.MapController;
import es.masanz.ut7.pokemonfx.model.pokemons.*;
import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import javafx.application.Application;
import javafx.stage.Stage;

public class GameApp extends Application {

    // SPRITES OBTENIDOS DE (ENTRE OTROS) https://www.spriters-resource.com/game_boy_gbc/pokemongoldsilver/

    public static Entrenador jugador;

    @Override
    public void start(Stage primaryStage) {
        MapController.load(primaryStage);
    }

    public static void main(String[] args) {
        // TODO 00: AQUI DEFINIR VUESTRO ENTRENADOR INICIAL
        jugador = new Entrenador();

        //Pokemon en el equipo

        //Dar iniciales.
        jugador.incluirPokemonParaCombatir(0, new Bulbasaur(16));
        jugador.incluirPokemonParaCombatir(1, new Charmander(16));
        jugador.incluirPokemonParaCombatir(2, new Squirtle(16));
        jugador.incluirPokemonParaCombatir(3, new Ivysaur(36));
        jugador.incluirPokemonParaCombatir(4, new Charmeleon(36));
        jugador.incluirPokemonParaCombatir(5, new Wartortle(36));


        // Pokemon en el PC
        jugador.getPokemonesCapturados().add(new Squirtle(25));
        jugador.getPokemonesCapturados().add(new Charmander(35));
        launch(args);
    }
}
