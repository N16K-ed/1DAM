package clases;

public class AnimalOmnivoro extends Animal {

	public AnimalOmnivoro(double tamano, double edad, double energia) {
		super(tamano, edad, energia);
	}

	public void comer(Comida comida) {
		this.tamano = this.tamano + comida.tamano;
	}
	
	@Override
	public void hablar() {
		System.out.println("Soy un animal omnívoro!");
	}
	
}
