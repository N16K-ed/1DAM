public class Mes {

    private String nombre;
    private Semana semana1;
    private Semana semana2;
    private Semana semana3;
    private Semana semana4;

    public Mes (String nombre,Semana semana1, Semana semana2, Semana semana3, Semana semana4){
        this.nombre = nombre;
        this.semana1 = semana1;
        this.semana2 = semana2;
        this.semana3 = semana3;
        this.semana4 = semana4;

    }

    public String toString (){
        return "Mes";
    }
}
