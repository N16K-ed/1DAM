import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("Introduce un número del 1 al 7:");
        System.out.println("******************************************");
        int dia = scanner.nextInt();
        switch (dia){
            case 1:
                System.out.println("El dia es: Lunes");
                break;
            case 2:
                System.out.println("El dia es: Martes");
                break;
            case 3:
                System.out.println("El dia es: Miercoles");
                break;
            case 4:
                System.out.println("El dia es: Jueves");
                break;
            case 5:
                System.out.println("El dia es: Viernes");
                break;
            case 6:
                System.out.println("El dia es: Sabado");
                break;
            case 7:
                System.out.println("El dia es: Domingo");
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.println("******************************************");

        System.out.println("Introduce una clasificación del 1 al 5:");
        System.out.println("******************************************");
        int nota = scanner.nextInt();
        switch (nota){
            case 1:
                System.out.println("Calificación: Muy Deficiente");
                break;
            case 2:
                System.out.println("Calificación: Insuficiente");
                break;
            case 3:
                System.out.println("Calificación: Suficiente");
                break;
            case 4:
                System.out.println("Calificación: Notable");
                break;
            case 5:
                System.out.println("Calificación: Sobresaliente");
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.println("******************************************");

        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("******************************************");

        int opcion = scanner.nextInt();
        System.out.println("Introduce el primer número:");
        System.out.println("******************************************");
        double num1 = scanner.nextDouble();
        System.out.println("Introduce el segundo número:");
        System.out.println("******************************************");
        double num2 = scanner.nextDouble();
        double resultado;
        switch (opcion){
            case 1: resultado = num1 + num2;
                System.out.println("El resultado es: "+ resultado);
                break;
            case 2: resultado = num1 - num2;
                System.out.println("El resultado es: "+ resultado);
                break;
            case 3: resultado = num1 * num2;
                System.out.println("El resultado es: "+ resultado);
                break;
            case 4: resultado = num1 / num2;
                System.out.println("El resultado es: "+ resultado);
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.println("******************************************");

        System.out.println("Introduce un número del 1 al 12:");
        int mes = scanner.nextInt();
        switch (mes){
            case 1: System.out.println("El mes es: Enero");
                break;
            case 2: System.out.println("El mes es: Febrero");
                break;
            case 3: System.out.println("El mes es: Marzo");
                break;
            case 4: System.out.println("El mes es: Abril");
                break;
            case 5: System.out.println("El mes es: Mayo");
                break;
            case 6: System.out.println("El mes es: Junio");
                break;
            case 7: System.out.println("El mes es: Julio");
                break;
            case 8: System.out.println("El mes es: Agosto");
                break;
            case 9: System.out.println("El mes es: Septiembre");
                break;
            case 10: System.out.println("El mes es: Octubre");
                break;
            case 11: System.out.println("El mes es: Noviembre");
                break;
            case 12: System.out.println("El mes es: Diciembre");
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.println("******************************************");

        System.out.println("Seleccione una bebida:");
        System.out.println("1. Agua");
        System.out.println("2. Jugo");
        System.out.println("3. Refresco");
        System.out.println("******************************************");
        int bebida = scanner.nextInt();
        switch (bebida){
            case 1:
                System.out.println("Has seleccionado: Agua");
                break;
            case 2:
                System.out.println("Has seleccionado: Jugo");
                break;
            case 3:
                System.out.println("Has seleccionado: Refresco");
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.println("******************************************");


    }
}