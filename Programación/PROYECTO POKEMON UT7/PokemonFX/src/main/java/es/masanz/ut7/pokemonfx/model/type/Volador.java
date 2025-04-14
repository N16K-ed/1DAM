package es.masanz.ut7.pokemonfx.model.type;

public interface Volador {
    default void alasVendaval(){
        System.out.println("El pokemon se mueve primero y deja confundido al enemigo");
    }
}
