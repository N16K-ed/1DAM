package es.masanz.ut7.pokemonfx.model.type;

public interface Veneno {
    default void nubeToxica(){
        System.out.println("El pokemon enemigo recibe daño por veneno");
    }
}
