package cofrinhoDeMoedas;

public class Real extends Moeda{

	public Real(double valorInicial) {
		this.valor = valorInicial;
	}
	
	
	// Método para informar valor do real
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor; 
	}

	//Método para remover a moeda
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()){
			return false;
		}
		
	    Real objetoDeReal = (Real) objeto;	
		
		if (this.valor != objetoDeReal.valor) {
			return false;
		}
	
	   	return true;
	}
	 
    
}
