package decorators;

import model.Coffee;
import model.Americano;

public class DoubleCoffee extends CoffeeDecorator{

	public DoubleCoffee(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		coffee.make();
		coffee.make();
		
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 2 * coffee.getPrice();
		
	}

	
	
	
}
