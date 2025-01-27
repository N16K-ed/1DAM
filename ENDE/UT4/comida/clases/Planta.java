package clases;

public class Planta extends Comida {
	private double edad;
	private double energia;
	
	public Planta(Double tamano, double edad, double energia) {
		this.tamano = tamano;
		this.edad = edad;
		this.energia = energia;
	}

	@Override
	public String toString() {
		return "Planta [edad=" + edad + ", energia=" + energia + ", tamano=" + tamano + "]";
	}
	
	public void hablar() {
		System.out.println("Soy una planta!");
	}
	
	public void fotosintesis() {
		this.tamano = this.tamano + 0.1 * this.tamano;
		this.edad = this.edad + 1.0;
		this.energia = this.energia + 10.0;
		if (this.energia > 100.0) {
			this.energia = 100.0;
		}

	}
	
	
}
