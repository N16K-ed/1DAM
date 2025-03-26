import java.util.ArrayList;

public class Jugador extends Persona implements Cloneable{

    ArrayList<String> juegosJugados;

    public Jugador (String nombre, int edad){
        super(nombre, edad);
        juegosJugados = new ArrayList<>();
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Jugador copia = (Jugador) super.clone();
        copia.juegosJugados = new ArrayList<>();
        for (String juegos: this.juegosJugados){
            copia.juegosJugados.add(juegos);
        }
        return copia;
    }

}
