public class ActividadPolideportivo extends Actividad{

    private String polideportivo;

    public ActividadPolideportivo (String nombre, String polideportivo, int duracion){

        super(nombre, duracion);
        this.polideportivo = polideportivo;
    }

    public String toString(){
        return "ActividadPolidepor";
    }
}
