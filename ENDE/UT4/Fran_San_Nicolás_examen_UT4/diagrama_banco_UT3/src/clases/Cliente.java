package clases;

public class Cliente extends Persona {
	private String numCuenta;

	public Cliente(String nombre, String nif, String numCuenta) {
		super(nombre, nif);
		this.numCuenta = numCuenta;
	}
	
	@Override
	public String toString() {
		return "Cliente [numCuenta=" + numCuenta + "]";
	}
	
	public void meterDinero(Cuenta cuenta, double dinero) {
		cuenta.setSaldo(cuenta.getSaldo() + dinero);
		System.out.println("Saldo actualizado");
	}
	
	public void sacarDinero(Cuenta cuenta, double dinero) {
		if (this.numCuenta.equals(cuenta.numCuenta)) {
			cuenta.setSaldo(cuenta.getSaldo() - dinero);
			System.out.println("Saldo actualizado");
		} else {
			System.out.println("No autorizado.");
		}
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
}
