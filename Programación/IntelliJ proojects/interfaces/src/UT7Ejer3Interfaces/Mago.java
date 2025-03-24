package UT7Ejer3Interfaces;

public class Mago implements Personaje{

    @Override
    public void atacar() {
        System.out.println("El mago ataca con un hechizo.");
    }

    @Override
    public void defender() {
        System.out.println("El mago se defiende con un campo de fuerza.");
    }
}
