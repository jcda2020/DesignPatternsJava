import decorators.Cappuccino;
import decorators.DoubleCoffee;
import decorators.WithMilk;
import model.Americano;
import model.Coffee;
import model.Expresso;

public class CoffeeMachine {

	public static void order(String nome, Coffee coffee) {
		System.out.println("Preparando seu café: " + nome);
		coffee.make();
		System.out.println("Preço: " + coffee.getPrice());
		
	

	
	System.out.println("\u2615 \u2615 \u2615 --- CoffeeShop  --- \u2615 \u2615 \u2615  \n");
	System.out.println(" ");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		order("Expresso", new Expresso());
		order("Expresso Duplo", new DoubleCoffee(new Expresso()));
		order("Café com leite", new WithMilk(new Expresso()));
		order("Americano", new Americano());
		order("Americano com leite", new WithMilk(new Americano()));
		order("Duplo Americano com leite", new DoubleCoffee(new WithMilk(new Americano())) );
		order("Capputino", new Cappuccino(new WithMilk(new Expresso())));
		
		
		
		
	}

}
