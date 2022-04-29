package deliveryservicestrategy;

import delivery.context.DeliveryCompany;
// padroniza o m�todo do pre�o da entrega 
public interface ShippingPriceServiceStrategy {

	// m�todo(fun��o) que devolver� o pre�o da entrega por meio das empresas
	double priceDelivery();
}

