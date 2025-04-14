package es.masanz.ut7.pokemonfx.model.type;

public interface Lucha {
    default void golpeCritico(){
        System.out.println("El pokemon ha sabido donde golpear y ha hecho un golpe crítico");
    }
}
