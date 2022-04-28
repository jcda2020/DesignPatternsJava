package model;

import services.ServiceFreteStrategy;

public class Frete {

	private  ServiceFreteStrategy service;

	public Frete(ServiceFreteStrategy service) {
		
		this.setService(service);
	}

	public void setService(ServiceFreteStrategy service) {
		this.service = service;
	}
	
	
	public double shippingPrice(double peso) {
		
		double valor = service.shippingPrice( peso);
		
		return valor;
		
	}
	
	
	
}
