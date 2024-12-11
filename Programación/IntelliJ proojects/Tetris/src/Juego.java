public class Juego {
    private Tablero tablero;
    private Marcador marcador;

    public Juego(Tablero tablero, Marcador marcador){
        this.tablero = tablero;
        this.marcador = marcador;
    }

    public Tablero getTablero(){
        return this.tablero;
    }
    public void setTablero(Tablero nuevoTablero){
        this.tablero = nuevoTablero;
    }

    public Marcador getMarcador(){
        return this.marcador;
    }

    public void setMarcador(Marcador nuevoMarcador){
        this.marcador = nuevoMarcador;
    }


}
