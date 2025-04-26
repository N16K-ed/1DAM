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


        jugador.incluirPokemonParaCombatir(0,new Venusaur(40));        ;
        jugador.incluirPokemonParaCombatir(1,new Charizard(40));
        jugador.incluirPokemonParaCombatir(2,new Blastoise(40));
        jugador.incluirPokemonParaCombatir(3,new Magikarp(40));
        // Pokemon en el PC
            jugador.getPokemonesCapturados().add(new Bulbasaur(15));
            jugador.getPokemonesCapturados().add(new Charmander(15));
            jugador.getPokemonesCapturados().add(new Squirtle(15));
            jugador.getPokemonesCapturados().add(new Ivysaur(31));
            jugador.getPokemonesCapturados().add(new Charmeleon(35));
            jugador.getPokemonesCapturados().add(new Wartortle(35));
            jugador.getPokemonesCapturados().add(new Bronzor(32));
            jugador.getPokemonesCapturados().add(new Bronzong(33));
            jugador.getPokemonesCapturados().add(new Magikarp(19));
            jugador.getPokemonesCapturados().add(new Gyarados(20));
            jugador.getPokemonesCapturados().add(new Golbat(30));
            jugador.getPokemonesCapturados().add(new Crobat(40));
            jugador.getPokemonesCapturados().add(new Bidoof(14));
            jugador.getPokemonesCapturados().add(new Bibarel(15));
            jugador.getPokemonesCapturados().add(new Giratina(1));
            jugador.getPokemonesCapturados().add(new Giratina(100));
        launch(args);
    }
}
