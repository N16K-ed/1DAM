package es.masanz.ut7.pokemonfx.model.type;

public interface Tierra {
    default void terremoto(){
        System.out.println("Todo el equipo rival ha recibido daño por un terremoto");
    }
}
