package drivethruproxyentrega;

import java.util.Random;
import model.Coffee;
import model.Pedidos;
import observerdelivery.ObserverPreparoPedido;

public class UserDelivery implements EntregaPedido, Pedidos, ObserverPreparoPedido{

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
			
					Thread.sleep(1500);
					
					System.out.print( " ^_^ ");
					
			
					}
				System.out.println();			
				coffee.make();
				
				showOrder( nome, coffee);
		
	}
	
	
	
	@Override
	public void showOrder(String title, Coffee coffee) {
		
		System.out.println(" -------------> Preço do café: " + coffee.getPrice() +" <-------------");	
		System.out.println("Verifica abaixo se tem taxa de entrega!");
		System.out.println("c(__)c(__)c(__)c(__) Mais detalhes logo abaixo c(__)c(__)c(__)c(__)");
		
	}


	@Override
	public void update(boolean status) {
		// TODO Auto-generated method stub
		if(status) {			
			generateCode();
		}
	}
	
}

