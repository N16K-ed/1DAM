package es.masanz.ut7.pokemonfx.model.enums;

import es.masanz.ut7.pokemonfx.controller.MapController;
import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import javafx.scene.image.Image;

public enum TrainerType {

    JUGADOR("/pruebas/dawn.png"),
    ENTRENADOR_1("/pruebas/entrenador1.png"),
    ENTRENADOR_2("/pruebas/entrenador2.png"),
    ENTRENADOR_3("/pruebas/entrenador3.png"),
    ENTRENADOR_4("/pruebas/entrenador4.png"),
    ENTRENADOR_5("/pruebas/entrenador5.png"),
    ENTRENADOR_6("/pruebas/entrenador6.png"),
    ENTRENADOR_7("/pruebas/entrenador8.png");

    public final Image imagen;

    TrainerType(String rutaImagen){
        imagen = new Image(MapController.class.getResource(rutaImagen).toExternalForm());
    }

}
