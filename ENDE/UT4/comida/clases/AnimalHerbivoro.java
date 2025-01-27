package clases;

public class AnimalHerbivoro extends Animal {
	
	public AnimalHerbivoro(double tamano, double edad, double energia) {
		super(tamano, edad, energia);
	}

	public void comer(Planta comida) {
		this.tamano = this.tamano + comida.tamano;
	}

	@Override
	public void hablar() {
		System.out.println("Soy un animal Herbívoro!");
	}
}
