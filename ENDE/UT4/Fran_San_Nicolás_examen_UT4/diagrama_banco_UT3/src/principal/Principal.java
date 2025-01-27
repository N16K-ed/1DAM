package principal;

import clases.*;

public class Principal {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("Pipo", "15423455R", 2500.0);
		CuentaAhorro cuentaPepe = new CuentaAhorro("ES4343257675567", 1500.34, 3.5);
		CuentaCorriente cuentaJuan = new CuentaCorriente("ES4354354534599", 32436.8, 32436.8);
		Cliente pepe = new Cliente("Pepe", "13254677Y", "ES4343257675567");
				
		System.out.println("Bienvenido al cajero automático");	
		System.out.println("Sus peticiones serán gestionadas por nuestro empleado "+empleado.getNombre()+" dni: "+empleado.getNif());
		System.out.println("Su datos actuales son nombre: "+pepe.getNombre()+" dni: "+pepe.getNif());
		System.out.println("Saldo actual: "+ cuentaPepe.getSaldo());
		pepe.meterDinero(cuentaPepe, 100000.0);
		System.out.println("Saldo actual: "+ cuentaPepe.getSaldo());
		System.out.println("Su beneficio en 10 años será "+cuentaPepe.calculaBeneficio(10));
		pepe.sacarDinero(cuentaJuan, 20000.0);		
		empleado.cancelarCuenta(cuentaPepe);
		System.out.println("Su cuenta ha sido cancelada");
		System.out.println("Saldo actual: "+ cuentaPepe.getSaldo());
		System.out.println("Gracias por su visita. Hasta pronto.");
		
	}

}
