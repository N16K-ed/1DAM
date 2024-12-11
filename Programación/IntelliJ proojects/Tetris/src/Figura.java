public class Figura {
    private String forma;
    private String color;
    private Posicion posicion;

    public Figura(String forma, String color, Posicion posicion){
        this.forma = forma;
        this.color = color;
        this.posicion = posicion;
    }

    public Figura(String forma, String color){
        this.forma = forma;
        this.color = color;
        this.posicion = new Posicion();
    }

    public String getForma(){
        return this.forma;
    }

    public void setForma(String nuevaForma){
        this.forma = nuevaForma;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String nuevoColor){
        this.color = nuevoColor;
    }

    public Posicion getPosicion(){
        return this.posicion;
    }

    public void setPosicion(Posicion nuevaPosicion){
        this.posicion = nuevaPosicion;
    }

    public void moverIzda(int izda) {
       int Xnuevo = this.posicion.getPosX() - izda;
       this.posicion.setPosX(Xnuevo);
    }

    public void moverDer(int dcha){
        int Xnuevo = this.posicion.getPosX() + dcha;
        this.posicion.setPosX(Xnuevo);
    }

    public void bajar(int moverAbajo){
        int Ynuevo = this.posicion.getPosY() - moverAbajo;
        this.posicion.setPosY(Ynuevo);
    }
}
