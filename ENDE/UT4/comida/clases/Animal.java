package clases;

public class Animal extends Comida {
	private double edad;
	private double energia;
	
	public Animal(double tamano, double edad, double energia) {
		this.tamano = tamano;
		this.edad = edad;
		this.energia = energia;
	}

	@Override
	public String toString() {
		return "Animal [edad=" + edad + ", energia=" + energia + ", tamano=" + tamano + "]";
	}

	public void hablar() {
		System.out.println("Soy un animal!");
	}
	
	public void dormir(int dias) {
		this.edad = this.edad + dias/365;
		this.energia = 0.1*dias;
		if (this.energia > 100.0) {
			this.energia = 100.0;
		}
	}
	
	public void correr(int distancia) {
		if (this.energia >= distancia) {
			this.energia = this.energia - distancia;
			System.out.println("He corrido "+ distancia + " kms");
		} else {
			System.out.println("He corrido "+ this.energia + " kms");
			this.energia = 0.0;
		}
	}	
	
}
