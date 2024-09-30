package ar.edu.unlp.objetos.uno.ejercicio9;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta() {
		this.saldo = 0;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	protected void setSaldo(double monto) {  // Consultar visibilidad de este metodo
		this.saldo = monto;
	}

	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	protected void extraerSinControlar(double monto) {
		this.saldo -= monto;
	}
	
	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	protected abstract boolean puedeExtraer(double monto);
	
}
