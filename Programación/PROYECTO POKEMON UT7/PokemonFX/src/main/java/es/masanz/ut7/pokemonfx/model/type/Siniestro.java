package es.masanz.ut7.pokemonfx.model.type;

public interface Siniestro {
    default void emboscada(){
        System.out.println("El pokemon ha atacado primero");
    }
}
