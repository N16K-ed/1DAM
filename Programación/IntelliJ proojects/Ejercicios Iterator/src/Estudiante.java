public class Estudiante {

    private String nombre;
    private int edad;
    private double notaMedia;

    public Estudiante(String nombre, int edad, double notaMedia){
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    public Estudiante (){
        nombre = "Estudiante";
        edad = 0;
        notaMedia = 5.0;
    }
    public Estudiante (double notaMedia){
        nombre = "Estudiante";
        edad = 0;
        this.notaMedia = notaMedia;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
