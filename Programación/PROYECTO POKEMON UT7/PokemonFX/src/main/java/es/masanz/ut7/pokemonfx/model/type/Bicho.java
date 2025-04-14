package es.masanz.ut7.pokemonfx.model.type;

public interface Bicho {
    default void enjambre(){
        System.out.println("Tiene ayuda de sus compañeros");
    }
}
