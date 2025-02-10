import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*******************************************************");
        System.out.println("Bienvenido a: Piedra - Papel - Tijera - Lagarto - Spok.");
        System.out.println("*******************************************************");
        System.out.println("Sus opciones son: \n- Piedra (1)\n- Papel (2)\n- Tijera (3)\n- Lagarto (4)\n- Spok (5)");
        System.out.println("*******************************************************");

        System.out.print("Elija una opción: ");
        int eleccionUsuario = teclado.nextInt();

        while (eleccionUsuario >5 || eleccionUsuario < 1){
            System.out.print("Opción no válida, elija una opción valida: ");
            eleccionUsuario = teclado.nextInt();
        }

        Opciones elegidaPorUsuario = null;

        switch (eleccionUsuario){
            case 1:
                elegidaPorUsuario = Opciones.PIEDRA;
                break;
            case 2:
                elegidaPorUsuario = Opciones.PAPEL;
                break;
            case 3:
                elegidaPorUsuario = Opciones.TIJERA;
                break;
            case 4:
                elegidaPorUsuario = Opciones.LAGARTO;
                break;
            case 5:
                elegidaPorUsuario = Opciones.SPOK;
                break;
        }

        int eleccionMaquina = (int) (Math.random()*5+1);

        Opciones elegidaPorMaquina = null;

        switch (eleccionMaquina){
            case 1:
                elegidaPorMaquina = Opciones.PIEDRA;
                break;
            case 2:
                elegidaPorMaquina = Opciones.PAPEL;
                break;
            case 3:
                elegidaPorMaquina = Opciones.TIJERA;
                break;
            case 4:
                elegidaPorMaquina = Opciones.LAGARTO;
                break;
            case 5:
                elegidaPorMaquina = Opciones.SPOK;
                break;
        }

        String resultado;

        if (elegidaPorUsuario == elegidaPorMaquina){
            resultado = "EMPATE";
            System.out.println("*******************************************************\n");
            System.out.println("EMPATE, has elejido lo mismo que la máquina.");
            System.out.println("\n*******************************************************");
        }else if (elegidaPorUsuario == Opciones.PIEDRA && (elegidaPorMaquina == Opciones.LAGARTO || elegidaPorMaquina == Opciones.TIJERA)){
            resultado = "VICTORIA";
            System.out.println("*******************************************************\n");
            System.out.println("¡VICTORIA! Le has ganado a la máquina.");
            System.out.println("\n*******************************************************");
        }else if (elegidaPorUsuario == Opciones.PAPEL && (elegidaPorMaquina == Opciones.SPOK || elegidaPorMaquina == Opciones.PIEDRA)){
            resultado = "VICTORIA";
            System.out.println("*******************************************************\n");
            System.out.println("¡VICTORIA! Le has ganado a la máquina.");
            System.out.println("\n*******************************************************");
        }else if (elegidaPorUsuario == Opciones.TIJERA && (elegidaPorMaquina == Opciones.PAPEL || elegidaPorMaquina == Opciones.LAGARTO)){
            resultado = "VICTORIA";
            System.out.println("*******************************************************\n");
            System.out.println("¡VICTORIA! Le has ganado a la máquina.");
            System.out.println("\n*******************************************************");
        }else if (elegidaPorUsuario == Opciones.LAGARTO && (elegidaPorMaquina == Opciones.SPOK || elegidaPorMaquina == Opciones.PAPEL)){
            resultado = "VICTORIA";
            System.out.println("*******************************************************\n");
            System.out.println("¡VICTORIA! Le has ganado a la máquina.");
            System.out.println("\n*******************************************************");
        }else if (elegidaPorUsuario == Opciones.SPOK && (elegidaPorMaquina == Opciones.TIJERA || elegidaPorMaquina == Opciones.PIEDRA)){
            resultado = "VICTORIA";
            System.out.println("*******************************************************\n");
            System.out.println("¡VICTORIA! Le has ganado a la máquina.");
            System.out.println("\n*******************************************************");
        }else{
            resultado = "DERROTA";
            System.out.println("*******************************************************\n");
            System.out.println("DERROTA... La máquina te ha derrotado...");
            System.out.println("\n*******************************************************");

        }
    }
}