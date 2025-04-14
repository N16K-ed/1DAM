package es.masanz.ut7.pokemonfx.model.type;

public interface Electrico {
    default void descargaElectrica(){
        System.out.println("El enemigo se ha paralizado");
    }
}
