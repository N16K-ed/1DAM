package clases;

public class CuentaCorriente extends Cuenta {
	private double saldoMedio;

	public CuentaCorriente(String numCuenta, double saldo, double saldoMedio) {
		super(numCuenta, saldo);
		this.saldoMedio = saldoMedio;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [saldoMedio=" + saldoMedio + "]";
	}

	public double getSaldoMedio() {
		return saldoMedio;
	}

	public void setSaldoMedio(double saldoMedio) {
		this.saldoMedio = saldoMedio;
	}	
	
}
