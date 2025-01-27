package clases;

public class Empleado extends Persona {
	private double sueldo;
	
	public Empleado(String nombre, String nif, double sueldo) {
		super(nombre, nif);
		this.sueldo = sueldo;
	}

	public void cancelarCuenta(Cuenta cuenta) {
		cuenta.setSaldo(0.0);
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
