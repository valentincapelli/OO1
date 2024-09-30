package ar.edu.unlp.objetos.uno.ejercicio9;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}

	protected boolean puedeExtraer(double monto) {
		if (monto <= (this.getSaldo() * 1.02))
			return true;
		else
			return false;
	}
	
	@Override
	public void depositar(double monto) { 
		this.setSaldo(this.getSaldo() + (monto * 0.98));
	}
	
	@Override
	protected void extraerSinControlar(double monto) {
		this.setSaldo(this.getSaldo() - (monto * 1.02));
	}
	
	// Hago este metodo para que en en la transferencia no tenga un costo adicional
	// de 4%, 2% de la extraccion y 2% del deposito
	// Consultarlo.
	private void extraerSinControlarParaTransferencia(double monto) {  
		this.setSaldo(this.getSaldo() - monto);
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlarParaTransferencia(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
}
