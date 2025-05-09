package franciscoJavierSanNicolás;

public class Animal {
	private String nombre;
	private String especie;
	private int n_patas;
	private int edad;
		
	public Animal() {
		super();
	}

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Animal(String nombre, String especie, int n_patas, int edad) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.n_patas = n_patas;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getN_patas() {
		return n_patas;
	}

	public void setN_patas(int n_patas) {
		this.n_patas = n_patas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "El animal " + nombre + " de especie " + especie + " tiene " + n_patas + " patas  y " + edad + " años de edad.";
	}
	
	
}
