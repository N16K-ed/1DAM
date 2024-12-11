import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**************************************");
        System.out.println("1 = Primavera");
        System.out.println("2 = Verano");
        System.out.println("3 = Otoño");
        System.out.println("4 = Invierno");
        System.out.println("**************************************");
        System.out.println("Seleccione una estación:");
        int estacion = scanner.nextInt();

        if (estacion == 1) {
            System.out.println("Has seleccionado la estación: Primavera");
        } else if (estacion == 2) {
            System.out.println("Has seleccionado la estación: Verano");
        } else if (estacion == 3) {
            System.out.println("Has seleccionado la estación: Otoño");
        } else if (estacion == 4) {
            System.out.println("Has seleccionado la estación: Invierno");
        } else {
            System.out.println("Error");

        }
        System.out.println("**************************************");

        System.out.println("Introduce una temperatura:");
        int temperatura = scanner.nextInt();

        if ((temperatura < -50) && (estacion == 1)) {
            System.out.println("Error");
        } else if ((temperatura > 100) && (estacion == 1)) {
            System.out.println("Error");
        } else if ((temperatura < 20) && (estacion == 1)) {
            System.out.println("Hace frío en la habitación.");
            System.out.println("Es recomendable encender la calefacción.");
        } else if (((temperatura > 30) && (temperatura < 100)) && (estacion == 1)) {
            System.out.println("Hace demasiado calor en la habitación.");
            System.out.println("Es recomendable apagar la calefacción.");
        } else if ((temperatura >= 20) && (estacion == 1)) {
            System.out.println("La temperatura es la adecuada.");
        } else if ((temperatura < 0) && (estacion == 2)) {
            System.out.println("Error");
        } else if ((temperatura < 24) && (estacion == 2)) {
            System.out.println("Hace frío en la habitación.");
        } else if (((temperatura >=24) && (temperatura <= 30)) && (estacion == 2)) {
            System.out.println("La temperatura es la adecuada.");
        } else if ((temperatura > 100) && (estacion == 2)) {
            System.out.println("Error");
        } else if ((temperatura >= 30) && (estacion == 2)) {
            System.out.println("Hace calor en la habitación.");
            System.out.println("Es recomendable encender el aire acondicionado.");
        } else if ((temperatura < -50) && (estacion == 3)) {
            System.out.println("Error");
        } else if ((temperatura > 100) && (estacion == 3)) {
            System.out.println("Error");
        } else if ((temperatura < 20) && (estacion == 3)) {
            System.out.println("Hace frío en la habitación.");
            System.out.println("Es recomendable encender la calefacción.");
        } else if (((temperatura > 30) && (temperatura < 100)) && (estacion == 3)) {
            System.out.println("Hace demasiado calor en la habitación.");
            System.out.println("Es recomendable apagar la calefacción y ventilar la habitación.");
        } else if ((temperatura >= 20) && (estacion == 3)) {
            System.out.println("La temperatura es la adecuada.");
        } else if ((temperatura < -100) && (estacion == 4)) {
            System.out.println("Error");
        } else if (((temperatura >= 20) && (temperatura < 30)) && (estacion == 4)) {
            System.out.println("La temperatura es la adecuada.");
        } else if ((temperatura <20) && (estacion == 4)) {
            System.out.println("Hace frío en la habitación.");
            System.out.println("Es recomendable encender la calefacción.");
        } else if ((temperatura > 100) && (estacion == 4)) {
            System.out.println("Error");
        } else if ((temperatura >= 32) && (estacion == 4)) {
            System.out.println("Hace calor en la habitación.");
            System.out.println("Es recomendable apagar la calefacción y ventilar la habitación.");
        } else {
            System.out.println("Error");
        }
    }
}
//
//Temperaturas adecuadas en Primavera 20ºC - 30ªC incluidos , temperaturas menores a -50 y mayores a 100 dan error
//Temperaturas adecuadas en Verano 24ºC - 30ºC incluidos, temperaturas menores a 0 y mayores a 100 dan error
//Temperaturas adecuadas en Otoño 20ºC - 30ªC incluidos , temperaturas menores a -50 y mayores a 100 dan error
//Temperaturas adecuadas en Invierno 20º - 32ºC, temperaturas menores a -100 y mayores a 100 dan error
//