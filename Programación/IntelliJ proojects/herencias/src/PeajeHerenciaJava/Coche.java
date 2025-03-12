package PeajeHerenciaJava;

public class Coche extends Vehiculo {
    public Coche (String color, String matricula){
        tarifa = 5.00;
        this.color = color;
        this.matricula = matricula;
        tipo = "Coche";
    }
    @Override
    protected void pagarPeaje(){
        System.out.println("El " + tipo + " de color " + color + " y con matrícula " + matricula + " ha pagado " + tarifa + "€ al pasar por el peaje.");
    }

}
