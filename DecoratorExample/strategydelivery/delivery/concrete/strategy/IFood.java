package delivery.concrete.strategy;

import deliveryservicestrategy.ShippingPriceServiceStrategy;

public class IFood implements ShippingPriceServiceStrategy{

	@Override
	public double priceDelivery() {
		// TODO Auto-generated method stub
		//taxa m�nima de cobran�a		
				double basePrice = 3;
				// honor�rios (fee) do entregador
				double deliveryServiceFee = basePrice * 0.28;
				//f�rmula do pre�o final da entrega
				double deliveryPrice = basePrice + deliveryServiceFee;
				
				
				return deliveryPrice;
	}

}
