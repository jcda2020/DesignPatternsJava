package delivery.concrete.strategy;

import delivery.context.DeliveryCompany;
import deliveryservicestrategy.ShippingPriceServiceStrategy;

public class NineNineFood implements ShippingPriceServiceStrategy {

	@Override
	public double priceDelivery() {
		// TODO Auto-generated method stub
		//taxa m�nima de cobran�a		
		double basePrice = 3.5;
		// honor�rios (fee) do entregador
		double deliveryServiceFee = basePrice * 0.30;
		//f�rmula do pre�o final da entrega
		double deliveryPrice = basePrice + deliveryServiceFee;
		
		
		return deliveryPrice;
	}

	

	
	
	
}
