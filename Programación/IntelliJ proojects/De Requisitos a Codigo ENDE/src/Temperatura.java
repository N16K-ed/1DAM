import java.util.Scanner;

public class Temperatura {
    private int estacion;
    private int temperatura;

    public Temperatura() {
        estacion = 1;
        this.temperatura = 0;

    }

    public int getEstacion() {
        return estacion;
    }

    public int getTemperatura() {
        return temperatura;
    }


    public void recomendaciones() {


        if (estacion == 1) {
            System.out.println("Has seleccionado la estación: Primavera");
        } else if (estacion == 2) {
            System.out.println("Has seleccionado la estación: Verano");
        } else if (estacion == 3) {
            System.out.println("Has seleccionado la estación: Otoño");
        } else if (estacion == 4) {
            System.out.println("Has seleccionado la estación: Invierno");
        }

    }
}
