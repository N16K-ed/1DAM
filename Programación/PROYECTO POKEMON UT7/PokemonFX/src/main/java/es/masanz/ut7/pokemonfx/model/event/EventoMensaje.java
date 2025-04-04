package es.masanz.ut7.pokemonfx.model.event;

import es.masanz.ut7.pokemonfx.controller.MapController;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.application.Platform;
import static es.masanz.ut7.pokemonfx.util.Configuration.*;

public class EventoMensaje implements Evento {

        private String imagenEvento = "/pruebas/cartel_transaparente.png";
        private VBox root = new VBox();
        private Label label;
        private int step = 0; // Para controlar los diferentes estados del mensaje

        @Override
        public void aplicarEfecto() {


                // Crear el Label para mostrar el primer mensaje
                label = new Label("Has encontrado una nota: Haz click para continuar hablando con una persona.");
                label.setFont(Font.font("Arial", FontWeight.BOLD, 12));
                label.setTextFill(Color.BLACK);

                // Configurar el VBox para que ocupe toda la pantalla a lo ancho y un quinto a lo alto
                root.setPrefWidth(VIEW_WIDTH);
                root.setMaxWidth(Double.MAX_VALUE);
                root.setPrefHeight(VIEW_HEIGHT / 5);
                root.setMaxHeight(VIEW_HEIGHT / 5);
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
                                label.setText("Nunca te acostarás sin aprender algo nuevo...");
                                break;
                        case 2:
                                // Eliminar el texto y cerrar la caja de texto
                                Platform.runLater(() -> {
                                        imagenEvento ="";
                                        ((Pane) root.getParent()).getChildren().remove(root);
                                        MapController.setBlockGame(false);
                                });
                                break;
                        default:
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