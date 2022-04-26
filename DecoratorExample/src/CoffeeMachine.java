import java.util.Scanner;

//import decorators.Cappuccino;
import decorators.DoubleCoffee;
import decorators.WithMilk;
//import decorators.WithMilk;
import model.Americano;
import model.Coffee;
import model.Expresso;
import model.Pedidos;

public class CoffeeMachine implements Pedidos{

	public  void order(String nome, Coffee coffee) {
		
		coffee.make();
		showOrder(nome, coffee);
		
	}
	
	
	public void showOrder(String title, Coffee coffee) {
		System.out.println("Preparando seu café: " + title);
		System.out.println("Preço: " + coffee.getPrice());
		
		System.out.println("\u2615 \u2615 \u2615 --- CoffeeShop  --- \u2615 \u2615 \u2615  \n");
		System.out.println(" ");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner leiaOpcao = new Scanner(System.in);
		
		System.out.println("Digite: \n  p - para pedir  \n  x - para finalizar a aplicação");
		char op = leiaOpcao.next().charAt(0);		
		
	
		
		if(op == 'x') {
			
			
			System.out.println("Tudo bem, respeitamos sua decisão. Até a próxima! See you later!");
		}
		
		while(op != 'x' ) {
		
				if (op == 'p') {
				 CoffeeMachine drinkCoffee = 	new CoffeeMachine();
				Coffee coffee = null;
				System.out.println("Opções: \n escolha entre o expresso e americano: ");	
				String optionCoffee = leiaOpcao.next();	
				
				if (optionCoffee.equalsIgnoreCase("expresso")){					
					coffee = new Expresso();
					
				}else if(optionCoffee.equalsIgnoreCase("americano")) {
					coffee = new Americano();
				}
				
				
				System.out.println("Digite uma das opções para adicionar: \n 1 - sem adição \n 2 - duplo  \n 3 - café com leite \n 4 - duplo e com leite");
						byte decorator = leiaOpcao.nextByte();
						if (decorator == 1) {							
							System.out.println("Ah entendi sem adição. Tudo bem! ");
							
							if(coffee instanceof Expresso) {
								
								drinkCoffee.order("Expresso", coffee);
							} else if(coffee instanceof Americano) {
								
								drinkCoffee.order("Americano", coffee);
							}
							
						}
						if (decorator == 2) {							
							System.out.println("Ah entendi um duplo. Beleza! ");
							if(coffee instanceof Expresso) {
								
								drinkCoffee.order("Expresso duplo",  new DoubleCoffee(coffee));
							} else if(coffee instanceof Americano) {
								
								drinkCoffee.order("Americano duplo",  new DoubleCoffee(coffee));
							}
							
							
							
						}
				
						if (decorator == 3) {							
							System.out.println("Tranquilo, um letizinho para adoçar a vida! Vamos preparar. ");
							if(coffee instanceof Expresso) {
								
								drinkCoffee.order("Expresso com leite",  new WithMilk(coffee));
							} else if(coffee instanceof Americano) {
								
								drinkCoffee.order("Americano com leite",  new WithMilk(coffee));
							}
							
							
							
						}
						
						
						if (decorator == 4) {							
							System.out.println("Opa! Um duplo com leite na rodada. Blz, vamos lá!");
							if(coffee instanceof Expresso) {
								
								drinkCoffee.order("Expresso duplo leite",  new DoubleCoffee( new WithMilk(coffee)));
							} else if(coffee instanceof Americano) {
								
								drinkCoffee.order("Americano duplo leite",  new DoubleCoffee(new WithMilk(coffee)));
							}
							
							
							
						}
					
				}
			
			
		System.out.println("Digite: \n  p - para pedir \n  x - para finalizar a aplicação");
		op = leiaOpcao.next().charAt(0);		
			
		if(op == 'x') {
			System.out.println("Tudo bem, respeitamos sua decisão. Até a próxima! See you later!");
			
		}
		
		}
		
		
		
		/*CoffeeMachine coffeeExpress = new CoffeeMachine();
		
		coffeeExpress.order("Expresso", new Expresso());
		order("Expresso Duplo", new DoubleCoffee(new Expresso()));
		order("Café com leite", new WithMilk(new Expresso()));
		order("Americano", new Americano());
		order("Americano com leite", new WithMilk(new Americano()));
		order("Duplo Americano com leite", new DoubleCoffee(new WithMilk(new Americano())) );
		order("Capputino", new Cappuccino(new WithMilk(new Expresso())));
		
		*/
		
		
	}

}
