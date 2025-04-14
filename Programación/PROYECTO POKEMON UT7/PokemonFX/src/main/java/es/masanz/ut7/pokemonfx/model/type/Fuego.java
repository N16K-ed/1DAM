package es.masanz.ut7.pokemonfx.model.type;

public interface Fuego {
    default void quemadura(){
        System.out.println("El pokémon enemigo ha sido quemado y sufre daño adicional");
    }
}
