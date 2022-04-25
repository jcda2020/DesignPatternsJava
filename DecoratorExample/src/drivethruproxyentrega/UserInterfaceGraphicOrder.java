package drivethruproxyentrega;


import java.util.Scanner;

import model.Expresso;

public class UserInterfaceGraphicOrder {	
	
	public static void main(String[] args) {
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
		
		
			
			System.out.println("Gerando um código para fazer a retirada do seu pedido");
			  code =   user1.generateCode();
			
		
		
		
		
		 System.out.println();
		 
		 System.out.println("Agora solicite a retirada através do seu código");
		 
		 PostoColetaProxy retirada1 = new PostoColetaProxy(user1);		 
		 retirada1.retiraPedido(code);
		
		
		
	}
}
