package delivery.context;

import delivery.concrete.strategy.NineNineFood;
import deliveryservicestrategy.ShippingPriceServiceStrategy;

public class DeliveryCompany {

	
	private ShippingPriceServiceStrategy serviceStrategy;

	public DeliveryCompany(ShippingPriceServiceStrategy serviceStrategy) {
		
		this.setServiceStrategy(serviceStrategy);
	}

	public void setServiceStrategy(ShippingPriceServiceStrategy serviceStrategy) {
		this.serviceStrategy = serviceStrategy;
	}
		
	public double priceDeliveryCompany() {
		
		double price = 0;
		
		if(serviceStrategy instanceof NineNineFood ) {
			
			serviceStrategy = new NineNineFood();
			price = serviceStrategy.priceDelivery();
		}	
		
		
		return price;
		
		
	}
	
}
