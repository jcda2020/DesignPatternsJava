package delivery.concrete.strategy;

import delivery.context.DeliveryCompany;
import deliveryservicestrategy.ShippingPriceServiceStrategy;

public class NineNineFood implements ShippingPriceServiceStrategy {

	@Override
	public double priceDelivery() {
		// TODO Auto-generated method stub
		//taxa m�nima de cobran�a		
		double basePrice = 5;
		double priceGuyDelivery = basePrice * 0.35;
		//f�rmula do pre�o final da entrega
		double priceDelivery = basePrice + priceGuyDelivery;
		
		
		return priceDelivery;
	}

	

	
	
	
}
