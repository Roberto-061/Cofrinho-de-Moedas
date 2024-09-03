package cofrinhoDeMoedas;

public class Euro extends Moeda{

	public Euro(double valorInicial) {
		this.valor = valorInicial;
	}
	
	// Método para informar o valor de Euro
	public void info() {
		System.out.println("Euro - " + valor);
		
	}

	// Método para converter o valor em real
	public double converter() {
		return this.valor * 5.5;
	}
	
	//Método para remover a moeda
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()){
			return false;
		}
		
	    Euro objetoDeEuro = (Euro) objeto;	
		
		if (this.valor != objetoDeEuro.valor) {
			return false;
		}
	
	   	return true;
	}
	
}
