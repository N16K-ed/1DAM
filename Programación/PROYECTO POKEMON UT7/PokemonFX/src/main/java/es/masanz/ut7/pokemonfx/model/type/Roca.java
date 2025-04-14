package es.masanz.ut7.pokemonfx.model.type;

public interface Roca {
    default void lanzarRoca(){
        System.out.println("El enemigo recibe daño adicional y retrocede");
    }
}
