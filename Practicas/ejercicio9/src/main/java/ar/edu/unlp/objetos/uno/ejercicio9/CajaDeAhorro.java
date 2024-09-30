package ar.edu.unlp.objetos.uno.ejercicio9;

public class CajaDeAhorro extends Cuenta{

	protected boolean puedeExtraer(double monto) {
			return monto <= (this.getSaldo() * 1.02);
	}
	
	@Override
	public void depositar(double monto) { 
		super.depositar(monto * 0.98);
	}
	
	@Override
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto * 1.02);
	}
	
}
