public class TrianguloRectangulo {
    private double cateto1;
    private double cateto2;



    public TrianguloRectangulo(double queCateto1, double queCateto2){
        cateto1 = queCateto1;
        cateto2 = queCateto2;
    }

    public double getCateto1(){
        return cateto1;
    }

    public double getCateto2(){
        return cateto2;
    }

    public void setCateto1(double nuevoCateto1){
        cateto1 = nuevoCateto1;
    }

    public void setCateto2(double nuevoCateto2){
        cateto2 = nuevoCateto2;
    }

    public double obtenerHipotenusa(){
        double hipotenusa; //También se puede igualar directamente, incluso en el propio return.
        hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        return hipotenusa;
    }
}
