package ar.edu.unlp.objetos.uno.ejercicio19;

public class ClienteCorporativo extends Cliente{
	private String cuit;
	
	public ClienteCorporativo(String nombre, String direccion, String cuit) {
		super(nombre, direccion);
		this.cuit = cuit;
	}

	public String getCuit() {
		return this.cuit;
	}
	
	
}
