package drivethruproxyentrega;


import java.util.Scanner;

import decorators.Cappuccino;
import decorators.DoubleCoffee;
import decorators.WithMilk;
import model.Americano;
import model.Coffee;
import model.Expresso;


public class UserInterfaceGraphicOrder  {	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		UserDelivery user1 = new UserDelivery("83279246482");	
		
		String minhaRetirada ;
		int code = 0;	
		 double price = 0;
		
		@SuppressWarnings("resource")
		Scanner leiaOpcao = new Scanner(System.in);
		
		System.out.println("Digite: \n  p - para pedir  \n  x - para finalizar a aplicação");
		char op = leiaOpcao.next().charAt(0);		
		
	
		
		if(op == 'x') {
			
			
			System.out.println("Tudo bem, respeitamos sua decisão. Até a próxima! See you later!");
		}
		
		while(op != 'x' ) {
		
				if (op == 'p') {
				
				Coffee coffee = null;
				System.out.println("Opções: \n escolha entre o expresso e americano: ");	
				String optionCoffee = leiaOpcao.next();	
				
				if (optionCoffee.equalsIgnoreCase("expresso")){					
					coffee = new Expresso();
					
				}else if(optionCoffee.equalsIgnoreCase("americano")) {
					coffee = new Americano();
				}
				
				
System.out.println("Digite uma das opções para adicionar:"
		+ " \n 1 - sem adição \n 2 - duplo  \n 3 - café com leite"
		+ " \n 4 - duplo e com leite \n 5 - para cappuccino");
						byte decorator = leiaOpcao.nextByte();
						if (decorator == 1) {							
							System.out.println("Ah entendi sem adição. Tudo bem! ");
							
							if(coffee instanceof Expresso) {
								try {
									user1.order("Expresso", new  Expresso());
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
							} else if(coffee instanceof Americano) {
								try {
									user1.order("Americano", new  Americano());
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
							}
							
						}
						if (decorator == 2) {							
							System.out.println("Ah entendi, um duplo. Beleza! ");
							if(coffee instanceof Expresso) {
								
								try {
									user1.order("Expresso duplo",  new DoubleCoffee(coffee));
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} else if(coffee instanceof Americano) {
								
								try {
									user1.order("Americano duplo",  new DoubleCoffee(coffee));
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
							
							
						}
				
						if (decorator == 3) {							
							System.out.println("Tranquilo, um letizinho para adoçar a vida! Vamos preparar. ");
							System.out.println("Mexe mexe mexe ...");
							if(coffee instanceof Expresso) {
								
								try {
									user1.order("Expresso com leite",  new WithMilk(coffee));
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} else if(coffee instanceof Americano) {
								
								try {
									user1.order("Americano com leite",  new WithMilk(coffee));
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}				
							
							
						}
						
						
						if (decorator == 4) {							
							System.out.println("Opa! Um duplo com leite na rodada. Blz, vamos lá!");
							if(coffee instanceof Expresso) {
								
								try {
									user1.order("Expresso duplo leite",  new DoubleCoffee( new WithMilk(coffee)));
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} else if(coffee instanceof Americano) {
								
								try {
									user1.order("Americano duplo leite",  new DoubleCoffee(new WithMilk(coffee)));
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}		
							
							
						}
						if (decorator == 5) {							
							System.out.println("Que legal! Cappuccino no palco! Eh! eh!");
							if(coffee instanceof Expresso) {
								
								try {
									user1.order("Cappuccino",  new Cappuccino( coffee));
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} else if(coffee instanceof Americano) {
								
								try {
									user1.order("Cappuccino americano", new Cappuccino( coffee));
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
							
							
						}
						
						 price = coffee.getPrice() ;
					
				}// fim do if da opção de pedido
				
				
				//Antes de apresentar as opções de menu novamente
				
				
				System.out.println("Vai retirar agora? sim ou não?");				
				
				minhaRetirada = leia.next();				
					
					
				if(minhaRetirada.equalsIgnoreCase("sim")){
				
					//System.out.println("Gerando um código para fazer a retirada do seu pedido");
					 
					  PostoColetaProxy pedido1 = new PostoColetaProxy(user1);	
					  pedido1.add(user1);
					  boolean done = false;
					  
					if (price != 0) {
						
						done = true;
						
					}
					  
					  if(done) {
					  
					  pedido1.setStatus(done);
					  
					  code = user1.getCodigo();
					  pedido1.retiraPedido(code);
						 
					  }
					  
					  else {
						  
						  System.out.println("Seu pedido ainda não está pronto! Aguarda mais um pouco");
					  }
						
			} else  if (minhaRetirada.equalsIgnoreCase("não")){
				
				System.out.println("Tudo bem, quando decidi é só nos avisar!");
			}
				
				
			
			
		System.out.println("Digite: \n  p - para pedir \n  x - para finalizar a aplicação");
		op = leiaOpcao.next().charAt(0);		
			
		if(op == 'x') {
			System.out.println("Tudo bem, respeitamos sua decisão. Até a próxima! See you later!");
			
		}
		
		}
		
		
		/* código anteriro: 
		 * try {
			user1.order("Expresso", new  Expresso());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		*/
		
		
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
