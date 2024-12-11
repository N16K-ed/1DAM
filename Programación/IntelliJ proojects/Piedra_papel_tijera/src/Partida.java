import java.util.Scanner;

public class Partida {
    private Jugador Jugador1;
    private Jugador Maquina;

    public Partida (String nombreJugador){
        this.Jugador1 = new Jugador(nombreJugador);
        this.Maquina = new Jugador();
    }

    public Jugador getJugador1() {
        return Jugador1;
    }

    public Jugador getMaquina() {
        return Maquina;
    }

    public void ronda(){
        System.out.println("Elija piedra papel o tijera");
        System.out.println("1 - PIEDRA");
        System.out.println("2 - PAPEL");
        System.out.println("3 - TIJERA");
        Scanner teclado = new Scanner(System.in);
        System.out.println(this.Jugador1.getNombreJugador() + " muestra " + mapearSimbolo(teclado.nextInt()));
        System.out.println(this.Maquina.getNombreJugador() + " muestra " + mapearSimbolo((int)(Math.random()*3)+1));
        calcularGanador();
    }

    public void calcularGanador(){}

    public String mapearSimbolo(int numeroIntroducido){
        int numeroJugador = numeroIntroducido;
        switch (numeroJugador){
            case 1: return "Piedra";
            case 2: return "Papel";
            case 3: return "Tijera";
            default: return "Valor elegido incorrecto";
        }

    }


}
