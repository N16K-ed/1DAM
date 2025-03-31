package es.masanz.ut7.pokemonfx.model.enums;

import es.masanz.ut7.pokemonfx.controller.MapController;
import javafx.scene.image.Image;

public enum TileType {

    // TODO 09: Incluir nuevos tipos de sprites. Las dimensiones deben ser 16x16px
    CAMINO_BLANCO("/pruebas/camino_blanco.png"),
    PARED_BLANCA("/pruebas/pared_blanca.png"),
    CESPED("/pruebas/cesped.png"),
    CESPED_ARBUSTO("/pruebas/cesped_arbusto.png"),
    CESPED_HIERBA("/pruebas/cesped_hierba.png"),
    MONTE_CENTRO("/pruebas/monte_centro.png"),
    MONTE_BORDE_SUPERIOR("/pruebas/monte_borde_superior.png"),
    MONTE_BORDE_INFERIOR("/pruebas/monte_borde_inferior.png"),
    MONTE_BORDE_IZQUIERDA("/pruebas/monte_borde_izquierda.png"),
    MONTE_BORDE_DERECHA("/pruebas/monte_borde_derecha.png"),
    MONTE_ESQUINA_SUPERIOR_IZQUIERDA("/pruebas/monte_esquina_superior_izquierda.png"),
    MONTE_ESQUINA_SUPERIOR_DERECHA("/pruebas/monte_esquina_superior_derecha.png"),
    MONTE_ESQUINA_INFERIOR_IZQUIERDA("/pruebas/monte_esquina_inferior_izquierda.png"),
    MONTE_ESQUINA_INFERIOR_DERECHA("/pruebas/monte_esquina_inferior_derecha.png"),
    TELEPORT_RED("/pruebas/teleport_red.png"),
    AGUA1("/pruebas/agua1.png"),
    AGUA2("/pruebas/agua2.png"),
    AGUA3("/pruebas/agua3.png"),
    AGUA4("/pruebas/agua4.png"),
    AGUA5("/pruebas/agua5.png"),
    AGUA6("/pruebas/agua6.png"),
    AGUA7("/pruebas/agua7.png"),
    ARBOL_ARRIBA_DER("/pruebas/arbol_arriba_der.png"),
    ARBOL_ARRIBA_IZD("/pruebas/arbol_arriba_izd.png"),
    ARBOL_ABAJO_DER("/pruebas/arbol_abajo_der.png"),
    ARBOL_ABAJO_IZD("/pruebas/arbol_abajo_izd.png"),
    AGUA_BORDE_DER("/pruebas/agua_bordes_der.png"),
    AGUA_BORDE_IZD("/pruebas/agua_bordes_izd.png"),
    AGUA_BORDE_ABAJO("/pruebas/agua_bordes_abajo.png"),
    AGUA_BORDE_ARRIBA("/pruebas/agua_bordes_arriba.png"),
    AGUA_ESQUINA_ARRIBA_DER("/pruebas/agua_esquina_der.png"),
    AGUA_ESQUINA_ARRIBA_IZD("/pruebas/agua_esquina_izd.png"),
    AGUA_ESQUINA_ABAJO_DER("/pruebas/agua_esquina_abajo_der.png"),
    AGUA_ESQUINA_ABAJO_IZD("/pruebas/agua_esquina_abajo_izd.png"),
    GIRO_BORDE_AGUA_ARRIBA_DER("/pruebas/agua_giros_arriba_der.png"),
    GIRO_BORDE_AGUA_ARRIBA_IZD("/pruebas/agua_giros_arriba_izd.png"),
    GIRO_BORDE_AGUA_ABAJO_DER("/pruebas/agua_giros_abajo_der.png"),
    GIRO_BORDE_AGUA_ABAJO_IZD("/pruebas/agua_giros_abajo_izd.png"),
    PUERTA_CUEVA("/pruebas/puerta_cueva.png"),
    PUERTA_CUEVA_AL_REVES("/pruebas/puerta_cueva_al_reves.png"),
    AGUA_CUEVA_ABAJO("/pruebas/agua_cueva_en_abajo.png"),
    AGUA_CUEVA_ARRIBA("/pruebas/agua_cueva_en_arriba.png"),
    AGUA_CUEVA_IZD("/pruebas/agua_cueva_en_izd.png"),
    AGUA_CUEVA_DER("/pruebas/agua_cueva_en_der.png"),
    AGUA_CUEVA_ESQUINA_ARRIBA_DER("/pruebas/agua_cueva_esquina_der.png"),
    AGUA_CUEVA_ESQUINA_ARRIBA_IZD("/pruebas/agua_cueva_esquina_izd.png"),
    AGUA_CUEVA_ESQUINA_ABAJO_DER("/pruebas/agua_cueva_esquina_inferior_der.png"),
    AGUA_CUEVA_ESQUINA_ABAJO_IZD("/pruebas/agua_cueva_esquina_inferior_izd.png"),
    AGUA_CUEVA_ESQUINA_REVERSE_ARRIBA_DER("/pruebas/agua_cueva_giro_arriba_der.png"),
    AGUA_CUEVA_ESQUINA_REVERSE_ARRIBA_IZD("/pruebas/agua_cueva_giro_arriba_izd.png"),
    AGUA_CUEVA_ESQUINA_REVERSE_ABAJO_DER("/pruebas/agua_cueva_giro_abajo_der.png"),
    AGUA_CUEVA_ESQUINA_REVERSE_ABAJO_IZD("/pruebas/agua_cueva_giro_abajo_izd.png"),
    AGUA_CUEVA("/pruebas/agua_cueva_limpio.png"),
    MONTE_ESQUINA_INTERIOR_DER("/pruebas/monte_esquina_interior_arriba_der.png"),
    MONTE_ESQUINA_INTERIOR_IZD("/pruebas/monte_esquina_interior_arriba izda.png"),
    NEGRO("/pruebas/negro.png"),
    CUEVA_SALVAJE("/pruebas/monte_centro.png");



    ;




    public final Image imagen;

    TileType(String rutaImagen){
        imagen = new Image(MapController.class.getResource(rutaImagen).toExternalForm());
    }

}
