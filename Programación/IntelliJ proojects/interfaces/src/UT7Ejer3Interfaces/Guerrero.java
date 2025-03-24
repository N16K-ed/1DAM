package UT7Ejer3Interfaces;

public class Guerrero implements Personaje{

    @Override
    public void atacar() {
        System.out.println("El guerrero ataca con una espada.");
    }

    @Override
    public void defender() {
        System.out.println("El gurrero se defiende con un escudo.");
    }
}
