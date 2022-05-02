package delivery.concrete.strategy;

import delivery.context.DeliveryCompany;
import deliveryservicestrategy.ShippingPriceServiceStrategy;

public class NineNineFood implements ShippingPriceServiceStrategy {

	@Override
	public double priceDelivery() {
		// TODO Auto-generated method stub
		//taxa mínima de cobrança		
		double basePrice = 3.5;
		// honorários (fee) do entregador
		double deliveryServiceFee = basePrice * 0.30;
		//fórmula do preço final da entrega
		double deliveryPrice = basePrice + deliveryServiceFee;
		
		
		return deliveryPrice;
	}

	

	
	
	
}
