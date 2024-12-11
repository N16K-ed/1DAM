public class Punto{
    public String nombre;
    public int posX;
    public int posY;


    public Punto(String nombre, int posX, int posY) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }
    public void moverX( int movX){
       posX = posX + movX;

    }
    public void moverY( int movY){
        posY = posY + movY;
    }
    public int posicionX(){
        return posX;
    }
    public int posicionY(){
        return posY;
    }

}
