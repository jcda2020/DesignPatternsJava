package model;

import services.ServiceFreteStrategy;

public class Sedex implements ServiceFreteStrategy{
			
	Correios correios = new Correios();
	@Override
	public double shippingPrice(double peso) {
		// TODO Auto-generated method stub
		
		
		
		double valor = correios.calculoRemessa(new Sedex(), peso);
				
							
		return valor;
	}
	
	public double getPeso(double comprimento, double largura, double altura) {
		
		double peso = correios.calcPeso(comprimento, largura,altura);
		return peso;
		
		
	}

}
