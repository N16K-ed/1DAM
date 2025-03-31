public class Persona implements Cloneable{

    String nombre;
    int edad;

    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
