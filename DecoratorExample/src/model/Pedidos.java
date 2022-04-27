package model;

public interface Pedidos {

	void order(String nome, Coffee coffee) throws InterruptedException;
	void showOrder(String title, Coffee coffee);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* public default void order(String nome, Coffee coffee) throws InterruptedException {
		
		System.out.println("Preparando seu café: " + nome);
		coffee.make();
		System.out.println("Preço: " + coffee.getPrice());
		
	

	
	System.out.println("\u2615 \u2615 \u2615 --- CoffeeShop  --- \u2615 \u2615 \u2615  \n");
	System.out.println(" ");
	}*/
	
}
