package delivery.concrete.strategy;

import delivery.context.DeliveryCompany;
import deliveryservicestrategy.ShippingPriceServiceStrategy;

public class NineNineFood implements ShippingPriceServiceStrategy {

	@Override
	public double priceDelivery() {
		// TODO Auto-generated method stub
		//taxa mínima de cobrança		
		double basePrice = 5;
		double priceGuyDelivery = basePrice * 0.35;
		//fórmula do preço final da entrega
		double priceDelivery = basePrice + priceGuyDelivery;
		
		
		return priceDelivery;
	}

	

	
	
	
}
