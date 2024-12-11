public class Jugador {
    public String nombre;
    public String equipo;
    public int puntuacion;


    public Jugador(String nombre, String equipo, int puntuacion){
        this.nombre = nombre;
        this.equipo = equipo;
        this.puntuacion = puntuacion;
    }

    public void incrementarPuntuacion(int incremento){
        puntuacion = puntuacion + incremento;
    }

    public void decrementarPuntuaion(int decremento){
        puntuacion = puntuacion - decremento;
    }

    public void puntuacionCero(){
        puntuacion = 0;
    }

    public int mostrarPuntuacion(){
        return puntuacion;
    }

}
