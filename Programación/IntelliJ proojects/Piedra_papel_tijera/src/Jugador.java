public class Jugador {
    private String nombreJugador;
    private int puntuacion;
    private String simbolo;

    public Jugador(String nombreJugador){
        this.nombreJugador = nombreJugador;
        this.puntuacion = 0;
        this.simbolo = "";
    }

    public Jugador (){
        this.nombreJugador = "máquina";
        this.puntuacion = 0;
        this.simbolo = "";
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
