package es.masanz.ut7.pokemonfx.model.type;

public interface Planta {
    default void enredaderas(){
        System.out.println("Se reduce la velocidad del rival");
    }
}
