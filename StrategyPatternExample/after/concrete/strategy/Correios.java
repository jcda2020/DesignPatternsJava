package concrete.strategy;

import service.strategy.FreteServiceStrategy;

public class Correios  implements FreteServiceStrategy{

	private FreteServiceStrategy concreteStrategy;
	
	
	public Correios(FreteServiceStrategy concreteStrategy) {
		
		this.concreteStrategy = concreteStrategy;
	}


	@Override
	public double calcula(double peso) {
		// TODO Auto-generated method stub
    double valor = 0;
		
		if (concreteStrategy instanceof Sedex) {
			
			valor = concreteStrategy.calcula(peso); 
			
		} 
			else if(concreteStrategy instanceof Pac) {
			
				valor = concreteStrategy.calcula(peso); 
		}
		
		
		return valor;
	}

}
