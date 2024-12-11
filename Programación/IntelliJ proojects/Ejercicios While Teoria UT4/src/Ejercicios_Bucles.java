import java.util.Scanner;

public class Ejercicios_Bucles {
    public static void main(String[] args) {
        Ejercicio7();
    }

    public static void Ejercicio1(){
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Inserte un número entero:");
        int numero = teclado1.nextInt();
        int numdiv = 1;
        for (int i= 1; i<=numero; i = i + 1){
            if(numero % i == 0 && i != numero && i != 1){
                System.out.println("Divisor de " + numero + " nº " + numdiv + ": " + i);
                numdiv = numdiv + 1;
            }
        }
    }

    public static void Ejercicio2(){
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Inserte un número entero:");
        int numero = teclado2.nextInt();
        boolean esPrimo = false;
        int divisores = 0;
        for (int i= 1; i<=numero; i = i + 1){
           if (numero % i == 0){
           divisores = divisores + 1;
           }
        }
        if (divisores == 2){
            esPrimo = true;
        }else{
            esPrimo = false;
        }
        if (esPrimo){
            System.out.println("El número: " + numero + " insertado es primo.");
        }else{
            System.out.println("El número: " + numero + " insertado no es primo.");
        }
    }

    public static void Ejercicio3(){
        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Inserte un número entero:");
        int numero = teclado3.nextInt();
        int numdiv = 1;
        for (int i= 1; i<=numero; i = i + 1){
            if(numero % i == 0 && i % 2 == 0){
                System.out.println("Divisor par de " + numero + " nº " + numdiv + ": " + i);
                numdiv = numdiv + 1;
            }
        }
    }

    public static void Ejercicio4(){
        Scanner teclado4 = new Scanner(System.in);
        System.out.println("Inserte un número entero:");
        int numero = teclado4.nextInt();
        int sumatotal = 0;
        for (int i= 1; i<=numero; i = i + 1){
            if (numero % i == 0){
                sumatotal = sumatotal + i;
            }
        }
        System.out.println("La suma total de los divisores es: " + sumatotal);
    }

    public static void Ejercicio5(){
        Scanner teclado4 = new Scanner(System.in);
        System.out.println("Inserte un número 'n' (entero):");
        int numero = teclado4.nextInt();
        int fab1 = 0;
        int fab2 = 1;
        int resultado = 0;
        if (numero == 1){
            System.out.println(fab1);
        } else if (numero == 2){
            System.out.println(fab2);
        }else {
            for (int i = 3; i <= numero; i++) {
                resultado = fab1 + fab2;
                fab1 = fab2;
                fab2 = resultado;

            }
            System.out.println("El valor de la Serie de Fibonacci con la " + numero + "ª posición es: " + resultado);
        }
    }

    public static void Ejercicio6(){
        int numero = -1;
        int sumaPAREStotal = 0;
        int media = 0;
        int divisor = 0;
        int sumaTotal = 0;
        int maximo = 0;

        do{
            numero = (int) (Math.random() * 101);
            sumaTotal = sumaTotal + numero;
            divisor++;
            if (numero % 2 == 0){
                sumaPAREStotal = sumaPAREStotal + numero;
            }else{
                if (maximo < numero){
                    maximo = numero;
                }
            }
        }while (numero != 0);
        media = sumaTotal / divisor ;
        System.out.println("La media de todos los números generados aleatoriamente es: " + media + ".");
        System.out.println("La suma de todos los números pares generados aleatoriamente es: " + sumaPAREStotal + ".");
        System.out.println("El valor máximo de todos los números impares generados aleatoriamente es: " + maximo + ".");
    }

    public static void Ejercicio7(){
        int numero;
        for (int i = 1; i <=20; i++){
            numero = (int) (Math.random() * 31) + 5;
            System.out.print(numero + ": ");
            if (numero % 3 == 0 && numero % 5 == 0) {
                 for (int c = 1; c <= numero; c++) {
                     System.out.print("*");
                 }System.out.println();
             }else if (numero % 3 == 0){
                for(int a = 1; a <= numero; a++){
                    System.out.print("+");
                }System.out.println();
            }else if (numero % 5 == 0){
                for (int b = 1; b <= numero; b++){
                    System.out.print("-");
                }System.out.println();
            } else {
               for (int d = 1; d  <= numero; d++){
                   System.out.print("#");
               }System.out.println();
            }
        }
    }
}

