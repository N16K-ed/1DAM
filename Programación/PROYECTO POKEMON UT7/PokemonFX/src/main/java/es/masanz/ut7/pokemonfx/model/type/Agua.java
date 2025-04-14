package es.masanz.ut7.pokemonfx.model.type;

public interface Agua {
    default void crearTormnenta(){
        System.out.println("Baja la Precisión");
    }
}