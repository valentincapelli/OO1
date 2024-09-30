package ar.edu.unlp.objetos.uno.ejercicio9;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(200);
		cc.depositar(300);
		System.out.println("Saldo cuenta corriente: " + cc.getSaldo() + " Descubierto: "+ cc.getDescubierto());
		
		CajaDeAhorro cda = new CajaDeAhorro();
		cda.depositar(500);
		System.out.println("Saldo caja de ahorro: " + cda.getSaldo());
		
		// Transfiero de una caja de ahorro a una cuenta corriente
		
		cc.transferirACuenta(100, cda);
		System.out.println("Transferencia realizada.");
		
		System.out.println("Saldo cuenta corriente: " + cc.getSaldo() + " Descubierto: "+ cc.getDescubierto());
		System.out.println("Saldo caja de ahorro: " + cda.getSaldo());

		cda.transferirACuenta(100, cc);
		System.out.println("Transferencia realizada.");
		
		System.out.println("Saldo cuenta corriente: " + cc.getSaldo() + " Descubierto: "+ cc.getDescubierto());
		System.out.println("Saldo caja de ahorro: " + cda.getSaldo());
		
	}

}
