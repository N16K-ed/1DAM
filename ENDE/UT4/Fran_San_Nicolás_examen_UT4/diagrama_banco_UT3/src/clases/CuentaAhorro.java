package clases;

public class CuentaAhorro extends Cuenta {
	private double interés;

	public CuentaAhorro(String numCuenta, double saldo, double interés) {
		super(numCuenta, saldo);
		this.interés = interés;
	}
	
	public double calculaBeneficio(int años) {
		double saldoCalculado = this.getSaldo();
		for(int i = 0; i<años; i++) {
			saldoCalculado += saldoCalculado * this.interés / 100.0;
		}		
		return (saldoCalculado - this.getSaldo());
	}

	@Override
	public String toString() {
		return "CuentaAhorro [interés=" + interés + "]";
	}

	public double getInterés() {
		return interés;
	}

	public void setInterés(double interés) {
		this.interés = interés;
	}
	
}
