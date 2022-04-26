package drivethruproxyentrega;


import java.util.Scanner;

import decorators.WithMilk;
import model.Expresso;


public class UserInterfaceGraphicOrder  {	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		UserDelivery user1 = new UserDelivery("83279246482");
		
		try {
			user1.order("Expresso", new  Expresso());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		System.out.println("Vai retirar agora? sim ou não?");
		
		String minhaRetirada ;
		
		minhaRetirada = leia.next();	
		
		int code = 0;		
		
			
		if(minhaRetirada.equalsIgnoreCase("sim")){
		
			System.out.println("Gerando um código para fazer a retirada do seu pedido");
			  code =   user1.generateCode();
			  PostoColetaProxy retirada1 = new PostoColetaProxy(user1);		 
				 retirada1.retiraPedido(code);
				
	} else  if (minhaRetirada.equalsIgnoreCase("não")){
		
		System.out.println("Tudo bem, quando decidi é só nos avisar!");
	}
		
		System.out.println("---------------------------------Próximo pedido--------------------------------------------");
		
		
		
		UserDelivery user2 = new UserDelivery("35223106083");
		
		try {
			user2.order("Expresso com leite", new WithMilk(new Expresso()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		System.out.println("Vai retirar agora? sim ou não?");		
		
		minhaRetirada = leia.next();	
		
		
		if(minhaRetirada.equalsIgnoreCase("sim")){
			
			System.out.println("Gerando um código para fazer a retirada do seu pedido");
			  code =   user2.generateCode();
			  PostoColetaProxy retirada2 = new PostoColetaProxy(user2);		 
				 retirada2.retiraPedido(code);
				
	} else  if (minhaRetirada.equalsIgnoreCase("não")){
		
		System.out.println("Tudo bem, quando decidi é só nos avisar!");
	}
		 
		
		 
		 
		
		
		
	}
}
