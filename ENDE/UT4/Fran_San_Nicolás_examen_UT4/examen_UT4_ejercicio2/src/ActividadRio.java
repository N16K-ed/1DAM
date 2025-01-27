public class ActividadRio extends Actividad{

    private String rio;

    public ActividadRio(String nombre, String rio, int duracion){

        super(nombre, duracion);
        this.rio = rio;
    }

    public String toString(){
        return "Actividad Rio";
    }
}
