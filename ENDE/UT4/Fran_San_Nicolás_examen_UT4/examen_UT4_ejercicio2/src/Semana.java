public class Semana {

    private String lunes;
    private String martes;
    private String miercoles;
    private String jueves;
    private String viernes;

    public Semana (Actividad lunes, Actividad martes, Actividad miercoles, Actividad jueves, Actividad viernes){

        this.lunes = lunes.toString();
        this.martes = martes.toString();
        this.miercoles = miercoles.toString();
        this.jueves = jueves.toString();
        this.viernes = viernes.toString();

    }

    public String toString (){
        return "Semana";
    }
}
