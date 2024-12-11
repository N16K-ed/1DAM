import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecladoMain = new Scanner(System.in);
        System.out.println("Inserte su nombre:");
        String nombre = tecladoMain.next();
        System.out.println("Creando partida");
        Partida partida = new Partida(nombre);
        boolean hayGanador = false;
        Jugador ganador = null;
        while (!hayGanador){
           partida.ronda();
           partida.mostrarPuntuacion();
           if(partida.getJugador1().getPuntuacion() == 3 || partida.getMaquina().getPuntuacion() ==3){
               hayGanador = true;
               if (partida.getJugador1().getPuntuacion() == 3){
                   ganador = partida.getJugador1();
               }else if (partida.getMaquina().getPuntuacion() == 3){
                   ganador = partida.getMaquina();
               }System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
               System.out.println("Fin de la partida...");
               System.out.println("Jugador ganador: " + ganador.getNombreJugador());
               System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
           }
        }
    }
}