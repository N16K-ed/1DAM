package clases;

public class Cuenta {
	protected String numCuenta;
	private double saldo;
	
	protected Cuenta(String numCuenta, double saldo) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
