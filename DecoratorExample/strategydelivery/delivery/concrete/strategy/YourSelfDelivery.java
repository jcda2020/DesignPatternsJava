package delivery.concrete.strategy;

import deliveryservicestrategy.ShippingPriceServiceStrategy;

public class YourSelfDelivery implements ShippingPriceServiceStrategy{

	@Override
	public double priceDelivery() {
		// TODO Auto-generated method stub
		//taxa m�nima de cobran�a		
				double basePrice = 2;
				// honor�rios (fee) do entregador
				double deliveryServiceFee = basePrice * 0.4;
				//f�rmula do pre�o final da entrega
				double deliveryPrice = basePrice + deliveryServiceFee;
				
				
				return deliveryPrice;
	}

}
