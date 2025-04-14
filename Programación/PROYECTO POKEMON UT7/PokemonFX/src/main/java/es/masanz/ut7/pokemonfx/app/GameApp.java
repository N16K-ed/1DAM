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

        jugador.incluirPokemonParaCombatir(0,new Bidoof(1));
        jugador.incluirPokemonParaCombatir(1,new Bronzor(33));
        jugador.incluirPokemonParaCombatir(2,new Bronzong(36));
        jugador.incluirPokemonParaCombatir(3,new Charmeleon(7));
        // Pokemon en el PC
        jugador.getPokemonesCapturados().add(new Bulbasaur(16));
        jugador.getPokemonesCapturados().add(new Charmander(16));
        jugador.getPokemonesCapturados().add(new Squirtle(16));
        jugador.getPokemonesCapturados().add(new Ivysaur(36));
        jugador.getPokemonesCapturados().add(new Charmeleon(36));
        jugador.getPokemonesCapturados().add(new Wartortle(36));

        launch(args);
    }
}
