package drivethruproxyentrega;

import java.util.Random;

import model.Coffee;
import model.Pedidos;

public class UserDelivery implements EntregaPedido, Pedidos{

	private String cpf;
	private Integer codigo;
	
	
public UserDelivery (String cpf) {
		this.cpf = cpf;
		
	}
	

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	
	
	
	@Override
	public void retiraPedido(int codigo) {
		// TODO Auto-generated method stub
		
		System.out.println("CPF: " + this.cpf);
		System.out.println("Seu pedido foi retirado com sucesso!");
		
	}

	public int generateCode() {		
		
		int cod = 0;
		Random random = new Random(); 
		
		
		
		for (int i = 1; i < 100; i = i + 2) {			
				
				cod =  random.nextInt(10000) + 15 * i;
			
		}
		
		setCodigo(cod);
		System.out.println("Seu código foi gerado com sucesso!");
		return cod;		
		
		
	}
	
	@Override
	public void order(String nome, Coffee coffee) throws InterruptedException {
		System.out.println("Preparando seu café: " + nome);			
		
				for (int i = 5; i > 0; i--) {
			
					Thread.sleep(2000);
					System.out.print( ". ");
			
					}
				
				coffee.make();
				showOrder( nome, coffee);
		
	}
	
	@Override
	public void showOrder(String title, Coffee coffee) {
		
		System.out.println("Preço: " + coffee.getPrice());
		
		System.out.println("\u2615 \u2615 \u2615 --- CoffeeShop  --- \u2615 \u2615 \u2615  \n");
		System.out.println(" ");
	}
	
}
