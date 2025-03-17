package UT7Ejer4BatallaPokemon;

import UT7Ejer4BatallaPokemon.Fuego;

public class Charmander implements Pokemon, Fuego {
    private String nombre = "Charmander";
    private int vida = 100;

    public void atacar(Pokemon enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.getNombre());
        enemigo.recibirAtaque(this, 20);
    }

    public void recibirAtaque(Pokemon agresor, int danoBase) {
        int danoFinal = aplicarResistencia(agresor, danoBase);
        vida -= danoFinal;
        System.out.println(nombre + " recibe " + danoFinal + " de daño. Vida restante: " + vida);
    }

    public String getNombre() {
        return nombre;
    }
}