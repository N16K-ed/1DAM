package es.masanz.ut7.pokemonfx.model.type;

public interface Psiquico {
    default void controlMental(){
        System.out.println("El enemigo está confuso y se ataca a sí mismo");
    }
}
