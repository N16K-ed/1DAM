public class Perro {
    public String nombre;
    public String raza;
    public int edad;

    public Perro (String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public int edadHumana(){
        return edad * 7;
    }
}
