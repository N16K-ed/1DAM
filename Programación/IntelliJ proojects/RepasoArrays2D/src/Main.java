import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7 con esteroides: \n");
        Estudiante[][] CIMAS = new Estudiante[99][99];
        for (int rellenarFilas = 0; rellenarFilas < CIMAS.length; rellenarFilas++){
            for (int rellenarColumnas = 0; rellenarColumnas < CIMAS[rellenarFilas].length; rellenarColumnas++){
                CIMAS[rellenarFilas][rellenarColumnas] = new Estudiante();
            }
        }
        System.out.print("|----------------------------|");
        for(int cabecera = 0; cabecera < CIMAS[0].length; cabecera++){
            System.out.print("|----------------------------|");
        }
        for (int i = 0; i < CIMAS.length; i++){
            System.out.println();
            if (i+1 >= 10){
                System.out.print("| Curso: " + (i+1)+ "                  |");
            }else{
                System.out.print("| Curso: " + (i+1)+ "                   |");
            }
            for (int j = 0; j < CIMAS[i].length; j++){
                if ((j+1) >= 10){
                    System.out.print("| Nombre: " + CIMAS[i][j].getNombre() + " " + (j+1)+ "      |");
                }else{
                    System.out.print("| Nombre: " + CIMAS[i][j].getNombre() + " " + (j+1)+ "       |");
                }
            }
            System.out.println();
            System.out.print("|                            |");
            for (int j = 0; j < CIMAS[i].length; j++) {
                if (CIMAS[i][j].getCalificacion() >= 10) {
                    System.out.print("| Calificación: " + CIMAS[i][j].getCalificacion() + "           |");
                } else {
                    System.out.print("| Calificación: " + CIMAS[i][j].getCalificacion() + "            |");
                }
            }
            System.out.println();
            for(int cabecera = 0; cabecera < CIMAS[0].length; cabecera++){
                System.out.print("|----------------------------|");
            }
            System.out.print("|----------------------------|");
        }

        System.out.println("\n\nEjercicio 8: ");
        Scanner teclado = new Scanner(System.in);
        //Transposición de una matriz --> Filas = columnas y columnas = filas
        int[][] matrizOriginal = new int [3][3];
        int[][] matrizTranspuesta = new int [3][3];
        System.out.println("\nA continuación, introduzca los numeros enteros según se le indique: \n");
        for (int i = 0; i < matrizOriginal.length; i++){
            for (int j = 0; j < matrizOriginal[i].length; j++){
                System.out.print("Introduzca el valor de a(" + (i+1) + "," + (j+1) + ") = ");
                matrizOriginal[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < matrizTranspuesta.length; i++){
            for (int j = 0; j < matrizTranspuesta[i].length; j++){
                matrizTranspuesta[i][j] = matrizOriginal[j][i];
            }
        }
        System.out.println("\nLa matriz original es: ");
        for (int i = 0; i < matrizOriginal.length; i++){
            System.out.println();
            for (int j = 0; j < matrizOriginal[i].length; j++){
                System.out.print(matrizOriginal[i][j] + "  ");
            }
        }
        System.out.println("\n\nLa matriz transpuesta es: ");
        for (int i = 0; i < matrizTranspuesta.length; i++){
            System.out.println();
            for (int j = 0; j < matrizTranspuesta[i].length; j++){
                System.out.print(matrizTranspuesta[i][j] + "  ");
            }
        }
        System.out.println("\n\nEjercicio 9: ");

        int[][] matrizA = new int [2][2];
        int[][] matrizB = new int [2][2];
        int[][] resultado = new int [2][2];

        System.out.println("\nIntroduzca los valores de las matrices: \n");
        System.out.println("MATRIZ A:");
        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizB[i].length; j++){
                System.out.print("Introduzca el valor de a(" + (i+1) + "," + (j+1) + ") = ");
                matrizA[i][j] = teclado.nextInt();
            }
        }
        System.out.println();
        System.out.println("MATRIZ B:");
        for (int i = 0; i < matrizB.length; i++){
            for (int j = 0; j < matrizB[i].length; j++){
                System.out.print("Introduzca el valor de b(" + (i+1) + "," + (j+1) + ") = ");
                matrizB[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < resultado.length; i++){
            for (int j = 0; j < resultado[i].length; j++){
                resultado[i][j] = 0;
                for (int k = 0; k < resultado.length; k++){
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        System.out.println("\n\nLa matriz que resulta de multiplicar las Matrices A y B es: ");
        for (int i = 0; i < resultado.length; i++){
            System.out.println();
            for (int j = 0; j < resultado[i].length; j++){
                System.out.print(resultado[i][j] + "  ");
            }
        }







    }
}