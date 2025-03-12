package Ejer2;

public class Camion extends Vehiculo{
    public Camion(){
        super();
    }
    public Camion(String color,String matricula){
        super(color, matricula);
    }
    public Camion(String color,String matricula, String tipo, float tarifa){
        super(color, matricula, tipo, tarifa);
    }

    @Override
    public String toString() {
        return "Color = " + color + "\nMatricula = " + matricula + "\nTipo = " + tipo + "\nTarifa = " + tarifa + "\n";
    }
}
