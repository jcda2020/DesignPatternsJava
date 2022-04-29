package deliveryservicestrategy;

import delivery.context.DeliveryCompany;
// padroniza o método do preço da entrega 
public interface ShippingPriceServiceStrategy {

	// método(função) que devolverá o preço da entrega por meio das empresas
	double priceDelivery();
}

