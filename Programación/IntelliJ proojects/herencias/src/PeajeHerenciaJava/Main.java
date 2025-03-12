package PeajeHerenciaJava;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int aleatorio;
        int color;
        int numMatricula = 1;
        String colores = "";
        List <Vehiculo> listado = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            aleatorio = (int)(Math.random()*3+1);
            color = (int)(Math.random()*5+1);
            colores = switch (color){
                case 1 -> "blanco";
                case 2 -> "negro";
                case 3 -> "rojo";
                case 4 -> "azul";
                case 5 -> "gris";
                default -> colores;
            };
            switch (aleatorio){
                case 1:
                    listado.add(new Coche(colores, ("MAT" + numMatricula)));
                    numMatricula++;
                    break;
                case 2:
                    listado.add(new Moto(colores, ("MAT" + numMatricula)));
                    numMatricula++;
                    break;
                case 3:
                    listado.add(new Camion(colores, ("MAT" + numMatricula)));
                    numMatricula++;
                    break;
            }
        }
        for(Vehiculo vehiculo : listado){
            vehiculo.pagarPeaje();
        }
    }
}