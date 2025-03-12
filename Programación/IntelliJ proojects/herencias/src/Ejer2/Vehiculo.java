package Ejer2;

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
    public Vehiculo(String color, String matricula){
        tipo = "Vehículo";
        this.color = color;
        this.matricula = matricula;
        tarifa =  1;
    }
    public Vehiculo(String color, String matricula, String tipo, double tarifa){
        this.tipo = tipo;
        this.color = color;
        this.matricula = matricula;
        this.tarifa =  tarifa;
    }

    protected void pagarPeaje (){
    }
}

