package model;

import services.ServiceFreteStrategy;

public class Correios {

	public double calcPeso(double comprimento, double largura, double altura) {
		
		double peso = (comprimento * largura) * altura / 6000;
		
		return peso;
		
	}
	
	private double calculaPrecoEntrega(double peso) {
			
		double pesoCubico = 15.00;
		double valor = 0;
		double percentualPeso = (peso / pesoCubico) ;
		
		if (pesoCubico == 1) {
			valor = pesoCubico;
			
		}else {			
			valor = percentualPeso * pesoCubico;	
			
		}
		
		return valor;
	}
	
	double calculoRemessa(ServiceFreteStrategy concretStrategy, double peso) {
		
	double valor = 0;	
		
		if (concretStrategy instanceof Sedex) {
			
			valor = calculaPrecoEntrega(peso) + 12;
			
		}
	
	
   if (concretStrategy instanceof Pac) {
			
			valor = calculaPrecoEntrega(peso) + 35;
			
		}
		
	
		return valor;
	}
	
}
