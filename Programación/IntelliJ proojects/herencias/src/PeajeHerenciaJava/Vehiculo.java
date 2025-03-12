package PeajeHerenciaJava;

public class Vehiculo {
    protected String tipo;
    protected String color;
    protected String matricula;
    protected double tarifa;

    public Vehiculo(){
        tipo = "Vehículo";
        color = "negro";
        matricula = "WIWI123";
        tarifa =  1;
    }

    protected void pagarPeaje (){
    }
}

