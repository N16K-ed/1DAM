package PeajeHerenciaJava;

public class Camion extends Vehiculo {
    public Camion (String color, String matricula){
        tarifa = 9.75;
        this.color = color;
        this.matricula = matricula;
        tipo = "Camion";
    }
    @Override
    protected void pagarPeaje(){
        System.out.println("El " + tipo + " de color " + color + " y con matrícula " + matricula + " ha pagado " + tarifa + "€ al pasar por el peaje.");
    }
}
