public class Marcador {
    private String nombreJugador;
    private int puntuacion;

    public Marcador(String nombreJugador, int puntuacion){
        this.nombreJugador = nombreJugador;
        this.puntuacion = puntuacion;
    }

    public Marcador(String nombreJugador){
        this.nombreJugador = nombreJugador;
        this.puntuacion = 0;
    }

    public String getNombreJugador(){
        return this.nombreJugador;
    }

    public void setNombreJugador(String nuevoNombreJugador){
        this.nombreJugador = nuevoNombreJugador;
    }

    public int getPuntuacion(){
        return this.puntuacion;
    }

    public void setPuntuacion(int nuevaPuntuacion){
        this.puntuacion = nuevaPuntuacion;
    }

    public void aumentarPuntuacion(int masPuntuacion){
        this.puntuacion = this.puntuacion + masPuntuacion;
    }
}
