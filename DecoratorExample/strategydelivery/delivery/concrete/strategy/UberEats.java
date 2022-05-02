package delivery.concrete.strategy;

import deliveryservicestrategy.ShippingPriceServiceStrategy;

public class UberEats implements ShippingPriceServiceStrategy{

	@Override
	public double priceDelivery() {
		// TODO Auto-generated method stub
		//taxa m�nima de cobran�a		
				double basePrice = 2.5;
				// honor�rios (fee) do entregador
				double deliveryServiceFee = basePrice * 0.25;
				//f�rmula do pre�o final da entrega
				double deliveryPrice = basePrice + deliveryServiceFee;
				
				
				return deliveryPrice;
	}

}
