package context;

import service.strategy.FreteServiceStrategy;

public class Frete {

	
	private FreteServiceStrategy freteServicesStrategy;

	public Frete(FreteServiceStrategy freteServicesStrategy) {
	
		this.setFreteServicesStrategy(freteServicesStrategy);
	}

	public void setFreteServicesStrategy(FreteServiceStrategy freteServicesStrategy) {
		this.freteServicesStrategy = freteServicesStrategy;
	}

	
	public double calcula(double peso) {
		
		double valorFrete = 0;
		
		valorFrete = freteServicesStrategy.calcula(peso);
				
		return valorFrete;
		
		
	}
	
	
	
	
	
	
	
}
