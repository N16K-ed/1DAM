package es.masanz.ut7.pokemonfx.model.type;

public interface Fantasma {
    default void desaparecer(){
        System.out.println("El pokémon ha desaparecido y es inmune a los ataques");
    }
}
