package UT7Ejer3Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Personaje> listado = new ArrayList<>();
        int random;
        for (int i = 0; i < 20; i++){
            random = (int)(Math.random()*2+1);
            switch (random){
                case 1:
                    listado.add(new Mago());
                    break;
                case 2:
                    listado.add(new Guerrero());
                    break;
            }
        }
        for(Personaje personaje : listado){
            personaje.atacar();
            personaje.defender();
            System.out.println();
        }
    }
}
/*
Respuesta a la reflexión: Se añaden más personaje creando nuevas clases que
implementen la interfáz y se añaden habilidades nuevas (para todos) en la
propia interfaz. Si algún personaje requiriese alguna habilidad propia se puede
definir en su clase. Existe la opción de definir métodos directamente en la interfaz
(desde Java 8) con las palabras reservadas static y default.
 */