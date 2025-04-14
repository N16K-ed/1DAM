package es.masanz.ut7.pokemonfx.model.type;

public interface Hielo {
    default void congelar(){
        System.out.println("El enemigo ha sido congelado y no se puede mover");
    }
}
