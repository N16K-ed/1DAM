package es.masanz.ut7.pokemonfx.model.event;

import es.masanz.ut7.pokemonfx.controller.MapController;
import es.masanz.ut7.pokemonfx.model.base.Evento;
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

public class EventoHelio implements Evento {

    private String imagenEvento = "/pruebas/tierra_distorsion.png";
    private VBox root = new VBox();
    private Label label;
    private int step = 0; // Para controlar los diferentes estados del mensaje

    @Override
    public void aplicarEfecto() {
        // Crear el Label para mostrar el primer mensaje
        label = new Label("Helio: ¡NO DES NI UN PASO MÁS!");
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
                label.setText("Helio: Estoy a punto de conseguir el poder absoluto.");
                break;
            case 2:
                label.setText("Helio: Al fin. GIRATINA será mío.");
                break;
            case 3:
                label.setText("Helio: y no dejaré que nadie se interponga en mi camino...");
                break;
            case 4:
                label.setText("Helio: Da otro paso más y te las verás conmigo.");
                break;
            case 5:
                label.setText("Helio: Pero te lo advierto, no hay nada que un niñato como tú pueda hacer para detenerme...");
                break;
            case 6:
                label.setText("Helio: ¡Ahora vete por donde has venido y no me hagas perder más tiempo!");
                break;
            default:
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
