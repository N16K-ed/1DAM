public class Posicion {
    private int posX;
    private int posY;

    public Posicion (int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public Posicion (){
        this.posX = 0;
        this.posY = 0;
    }

    public int getPosX(){
        return this.posX;
    }

    public void setPosX(int nuevaPosX){
        this.posX = nuevaPosX;
    }

    public int getPosY(){
        return this.posY;
    }

    public void setPosY(int nuevaPosY){
        this.posY = nuevaPosY;
    }
}
