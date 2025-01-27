package clases;

public class AnimalCarnivoro extends Animal {
	
	public AnimalCarnivoro(double tamano, double edad, double energia) {
		super(tamano, edad, energia);
	}

	public void comer(Animal comida) {
		this.tamano = this.tamano + comida.tamano;
	}
	
	@Override
	public void hablar() {
		System.out.println("Soy un animal carnívoro!");
	}
	
}
