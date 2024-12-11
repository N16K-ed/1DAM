public class Tablero {
    private int alto;
    private int ancho;

    public Tablero(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public Tablero(){
        this.alto = 120;
        this.ancho = 50;
    }

    public int getAlto(){
        return this.alto;
    }

    public void setAlto(int nuevoAlto){
        this.alto = nuevoAlto;
    }

    public int ancho(){
        return this.ancho;
    }

    public void setAncho(int nuevoAncho){
        this.ancho = nuevoAncho;
    }

    public Figura crearFigura(String color, String forma){
        return new Figura(color, forma);
    }
}
