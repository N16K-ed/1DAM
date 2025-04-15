package es.masanz.ut7.pokemonfx.model.event;

import es.masanz.ut7.pokemonfx.app.GameApp;
import es.masanz.ut7.pokemonfx.controller.MapController;
import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import static es.masanz.ut7.pokemonfx.util.Configuration.VIEW_HEIGHT;
import static es.masanz.ut7.pokemonfx.util.Configuration.VIEW_WIDTH;

public class EventoCuraPP implements Evento {
    private String imagenEvento = "/pruebas/pokeball_transparente.png";
    private VBox root = new VBox();
    private Label label;
    private int step = 0; // Para controlar los diferentes estados del mensaje

    @Override
    public void aplicarEfecto() {
        // Crear el Label para mostrar el primer mensaje
        label = new Label("¡Has encontrado un botiquín!");
        label.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        label.setTextFill(Color.BLACK);

        // Configurar el VBox para que ocupe toda la pantalla a lo ancho y un quinto a lo alto
        root.setPrefWidth(VIEW_WIDTH);
        root.setMaxWidth(Double.MAX_VALUE);
        root.setPrefHeight(VIEW_HEIGHT / 4);
        root.setMaxHeight(VIEW_HEIGHT / 4);
        root.setStyle("-fx-background-color: white; -fx-alignment: center;");

        VBox.setVgrow(root, Priority.ALWAYS);
        root.setAlignment(Pos.BOTTOM_CENTER);

        // Agregar el Label al root (VBox)
        root.getChildren().add(label);

        root.setOnMouseClicked(event -> {
            step++;
            updateText();
        });
    }

    private void updateText() {
        // Dependiendo del estado (paso), actualizar el texto
        switch (step) {
            case 1:
                label.setText("Aunque parece que solo contiene medicamentos que restauran PP...");
                break;
            case 2:
                label.setText("Todos los Pokémon de tu equípo de combate han recuperado sus PP.");
                break;
            default:
                for (int i =0; i < GameApp.jugador.getPokemonesCombate().length; i++){
                    if (GameApp.jugador.getPokemonesCombate()[i] != null){
                        for(Ataque ataque : GameApp.jugador.getPokemonesCombate()[i].getAtaques().values()){ //recorrer los ataques
                            ataque.setCantidad(ataque.getPp());
                        }
                    }
                }
                // Eliminar el texto y cerrar la caja de texto
                Platform.runLater(() -> {
                    imagenEvento ="";
                    ((Pane) root.getParent()).getChildren().remove(root);
                    MapController.setBlockGame(false);
                });
                break;
        }
    }

    @Override
    public String imagenDelEvento() {
        return imagenEvento;
    }

    public VBox getRoot() {
        return root;
    }

}
