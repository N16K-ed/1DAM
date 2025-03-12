package PeajeHerenciaJava;

public class Moto extends Vehiculo {
    public Moto (String color, String matricula){
        tarifa = 3.50;
        this.color = color;
        this.matricula = matricula;
        tipo = "Moto";
    }
    @Override
    protected void pagarPeaje(){
        System.out.println("La " + tipo + " de color " + color + " y con matrícula " + matricula + " ha pagado " + tarifa + "€ al pasar por el peaje.");
    }

}
