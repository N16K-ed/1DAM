public class Estudiante {

    private String nombre;
    private int calificacion;

    public Estudiante(){
        nombre = "Estudiante";
        calificacion = (int)(Math.random()*11);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
