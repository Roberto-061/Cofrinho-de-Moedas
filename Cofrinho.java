package cofrinhoDeMoedas;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	// Metódo para adicionar moeda
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	// Metódo para remover moeda
	public boolean remover(Moeda moeda) {
		return this.listaMoedas.remove(moeda);
	}
	// Metódo para listar moeda
	public void listarMoedas() {
		
		if(this.listaMoedas.isEmpty()) {
			System.out.println("Não existe nennhuma moeda no Cofrinho");
		    return;
		}
		
		for(Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}
	// Metódo para total Convertido em reais
	public double totalConvertido() {
		
		if (this.listaMoedas.isEmpty()) {
			return 0;
	
		}
		
		double valorAcumulado = 0;
		
		for(Moeda moeda : this.listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
		
		return valorAcumulado;
	}
	
}
