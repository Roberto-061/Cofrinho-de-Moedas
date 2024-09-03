package cofrinhoDeMoedas;

public class Dolar extends Moeda{

	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}
	
	// Método para informar o valor do dolar
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}

	// Método para converter o valor em Real
	public double converter() {
		return this.valor * 5.1;
	}

	//Método para remover a moeda
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()){
			return false;
		}
		
	    Dolar objetoDeDolar = (Dolar) objeto;	
		
		if (this.valor != objetoDeDolar.valor) {
			return false;
		}
	
	   	return true;
	}
}
