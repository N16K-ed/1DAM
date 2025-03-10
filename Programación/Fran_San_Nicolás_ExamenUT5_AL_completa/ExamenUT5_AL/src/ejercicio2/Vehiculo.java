package ejercicio2;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String propietario;


    public Vehiculo(String matricula, String marca, String propietario) {
        this.matricula = matricula;
        this.marca = marca;
        this.propietario = propietario;
    }



    public String getMatricula() {
        return matricula;
    }



    public String getMarca() {
        return marca;
    }



    public String getPropietario() {
        return propietario;
    }




    @Override
    public String toString() {
        return "Marca: " + marca + ", Matrícula: " + matricula + ", Propietario: " + propietario;
    }
}

