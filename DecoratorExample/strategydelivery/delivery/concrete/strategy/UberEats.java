package delivery.concrete.strategy;

import deliveryservicestrategy.ShippingPriceServiceStrategy;

public class UberEats implements ShippingPriceServiceStrategy{

	@Override
	public double priceDelivery() {
		// TODO Auto-generated method stub
		//taxa mínima de cobrança		
				double basePrice = 2.5;
				// honorários (fee) do entregador
				double deliveryServiceFee = basePrice * 0.25;
				//fórmula do preço final da entrega
				double deliveryPrice = basePrice + deliveryServiceFee;
				
				
				return deliveryPrice;
	}

}
