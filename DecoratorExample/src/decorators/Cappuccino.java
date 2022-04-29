package decorators;

import model.Coffee;

public class Cappuccino  extends CoffeeDecorator{

	public Cappuccino(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("1/3 do expresso, 1/3 de leite, 1/3 de espuma de leite com medida de 150 ml");
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		double price = coffee.getPrice() + 1.25 + 1.5 + 3.5;
		
		return  price;
	}

	
	
	
}
