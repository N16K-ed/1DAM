import java.util.ArrayList;

public class Historial {
    private  ArrayList<String> historial;

    public void addHistorial(String resultado){
        String resultadoPartida = "Partida " + (historial.size() -1) + ": " + resultado;
        historial.add(resultadoPartida);
    }
}
