package decorators;

import model.Coffee;



public class WithMilk extends CoffeeDecorator{

	public WithMilk(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		coffee.make();
		System.out.println("Adição de leite");
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return coffee.getPrice() + 1.25;
	}

	
	
}
