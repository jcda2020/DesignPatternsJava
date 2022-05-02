package drivethruproxyentrega;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import decorators.*;
import delivery.concrete.strategy.*;
import delivery.context.DeliveryCompany;
import deliveryservicestrategy.ShippingPriceServiceStrategy;
import model.*;

import observerdelivery.GuyDelivery;


public class UserInterfaceGraphicOrder  {		
	  

	
	static List<ShippingPriceServiceStrategy> getCompanies(){
		List<ShippingPriceServiceStrategy> companies = new ArrayList<>();
		  companies.add(new UberEats());
		  companies.add(new NineNineFood());
		  companies.add(new IFood());
		  companies.add(new YourSelfDelivery());
		
		  
		  return companies;
		
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		UserDelivery user1 = new UserDelivery("83279246482");	
		
		String minhaRetirada ;
		int code = 0;	
		double price = 0;
		double priceDelivery = 0;
		double totalPrice = 0;
		
		@SuppressWarnings("resource")
		Scanner leiaOpcao = new Scanner(System.in);
		
		System.out.println("Digite: \n  p - para pedir  \n  x - para finalizar a aplica��o");
		char op = leiaOpcao.next().charAt(0);		
		
	
		
		if(op == 'x') {
			
			
			System.out.println("Tudo bem, respeitamos sua decis�o. At� a pr�xima! See you later!");
		}
		
		while(op != 'x' ) {
		
				if (op == 'p') {
				
				Coffee coffee = null;
				System.out.println("Op��es: \n escolha entre o expresso e americano: ");	
				String optionCoffee = leiaOpcao.next();	
				
				if (optionCoffee.equalsIgnoreCase("expresso")){					
					coffee = new Expresso();
					
				}else if(optionCoffee.equalsIgnoreCase("americano")) {
					coffee = new Americano();
				}
				
				
System.out.println("Digite uma das op��es para adicionar:"
		+ " \n 1 - sem adi��o \n 2 - duplo  \n 3 - caf� com leite"
		+ " \n 4 - duplo e com leite \n 5 - para cappuccino");
						

            	 

						byte decorator = leiaOpcao.nextByte();
						if (decorator == 1) {							
							System.out.println("Ah entendi sem adi��o. Tudo bem! ");
							Expresso expresso = new  Expresso();
							if(coffee instanceof Expresso) {
								try {
									user1.order("Expresso", expresso);
									price = expresso.getPrice();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
							} else if(coffee instanceof Americano) {
								try {
									Americano americano = new  Americano();
									
									user1.order("Americano", americano);
									
									price = americano.getPrice();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
							}
							
						}
						if (decorator == 2) {							
							System.out.println("Ah entendi, um duplo. Beleza! ");
							DoubleCoffee doubleCoffee = new DoubleCoffee(coffee);
							if(coffee instanceof Expresso) {
								
								try {
									user1.order("Expresso duplo",  doubleCoffee);
									price = doubleCoffee.getPrice();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} else if(coffee instanceof Americano) {
								
								try {
									user1.order("Americano duplo",  doubleCoffee);
									price = doubleCoffee.getPrice();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
							
							
						}
				
						if (decorator == 3) {							
							System.out.println("Tranquilo, um letizinho para ado�ar a vida! Vamos preparar. ");
							System.out.println("Mexe mexe mexe ...");
							WithMilk milk = new WithMilk(coffee);
							if(coffee instanceof Expresso) {								
								try {
									user1.order("Expresso com leite",  new WithMilk(coffee));
									price = milk.getPrice();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} else if(coffee instanceof Americano) {
								
								try {
									user1.order("Americano com leite",  new WithMilk(coffee));
									price = milk.getPrice();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}				
							
							
						}
						
						
						if (decorator == 4) {							
							System.out.println("Opa! Um duplo com leite na rodada. Blz, vamos l�!");
							
							DoubleCoffee coffeeDoubleMilk = new DoubleCoffee( new WithMilk(coffee));
							
							if(coffee instanceof Expresso) {
								
								try {
									user1.order("Expresso duplo leite",  new DoubleCoffee(new WithMilk(coffee)));
									price = coffeeDoubleMilk.getPrice();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} else if(coffee instanceof Americano) {
								
								try {
									user1.order("Americano duplo leite",  new DoubleCoffee(new WithMilk(coffee)));
									price = coffeeDoubleMilk.getPrice();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}		
							
							
						}
						if (decorator == 5) {							
							System.out.println("Que legal! Cappuccino no palco! Eh! eh!");
							
							Cappuccino cappuccino = new Cappuccino( coffee);
							if(coffee instanceof Expresso) {
								
								try {
									user1.order("Cappuccino",  new Cappuccino( coffee));
									price = cappuccino.getPrice();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} else if(coffee instanceof Americano) {
								
								try {
									user1.order("Cappuccino americano", new Cappuccino( coffee));
									price = cappuccino.getPrice();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
							
							
						}
						
						
						
					
				}// fim do if da op��o de pedido
				
				
				//Antes de apresentar as op��es de menu novamente
				
				PostoColetaProxy entrega1 = new PostoColetaProxy(user1);	
				 //adiciona o cliente na lista de observadores a serem notificados 
				entrega1.add(user1);
				  
				//Lista de entregadores para nossa simula��o
			List <GuyDelivery> guyOrGirlDeliver = new ArrayList<>();
					guyOrGirlDeliver.add(new GuyDelivery("@mary"));
					guyOrGirlDeliver.add(new GuyDelivery("@rui"));
					guyOrGirlDeliver.add(new GuyDelivery("@carlos"));
					guyOrGirlDeliver.add(new GuyDelivery("@rebeca"));				
				  
				  Random indice = new Random();
				 //gerar valores aleat�rios entre 0 e a �ltima posi��o do ArrayList dos entregadores  				  
				 int indexGuyDelivery = indice.nextInt((guyOrGirlDeliver.size()- 1));
					
				 GuyDelivery guyDeliveries = guyOrGirlDeliver.get(indexGuyDelivery);				  
				  //adiciona o entregador na lista de observadores a serem notificados
				  entrega1.add(guyDeliveries);
				  
				  boolean done = false;
				
				  
				  if (price != 0) {
						
						done = true;
						
					}
					  
					  if(done) {
					  // onde come�a o start notifica��o
					  entrega1.setStatus(done);
					  
					
					  List <ShippingPriceServiceStrategy> companiesFood = new ArrayList<>();
					  companiesFood.addAll(getCompanies());							  
									  
					  int indexCompany = 0;
					 
					  //gerar valores aleat�rios entre 0 e a �ltima posi��o do ArrayList das empresas (company)
					  indexCompany = indice.nextInt(companiesFood.size() - 1);
					
					  ShippingPriceServiceStrategy companyDeliveresFood = companiesFood.get(indexCompany);
					  
					  DeliveryCompany company = new DeliveryCompany(companyDeliveresFood);				  	
					  
						priceDelivery = company.priceDeliveryCompany();
						 
						System.out.println("Pre�o da taxa de entrega: " + priceDelivery);
						
					       totalPrice = price + priceDelivery;
					
						System.out.println("Pre�o total do pedido com frete: " + totalPrice);
					  		
						
						 code = user1.getCodigo();
						  entrega1.retiraPedido(code);		  				  
					
					  } // end if (done)
					  
					  else {
						  
						  System.out.println("Seu pedido ainda n�o est� pronto! :( ");
						  System.out.println("Mas, aguarde um pouquinho mais :)");
					  }			
			
			
		System.out.println("Digite: \n  p - para pedir \n  x - para finalizar a aplica��o");
		op = leiaOpcao.next().charAt(0);		
			
		if(op == 'x') {
			System.out.println("Tudo bem, respeitamos sua decis�o. At� a pr�xima! See you later!");
			
		}
		
		}
		
		
		
		System.out.println("---------------------------------Pr�ximo pedido--------------------------------------------");
		// c�digo abaixo sem uso do Observer e sem estrat�gias
		
		
		UserDelivery user2 = new UserDelivery("35223106083");
		
		try {
			user2.order("Expresso com leite", new WithMilk(new Expresso()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		System.out.println("Vai retirar agora? sim ou n�o?");		
		
		minhaRetirada = leia.next();	
		
		
		if(minhaRetirada.equalsIgnoreCase("sim")){
			
			System.out.println("Gerando um c�digo para fazer a retirada do seu pedido");
			  code =   user2.generateCode();
			  PostoColetaProxy retirada2 = new PostoColetaProxy(user2);		 
				 retirada2.retiraPedido(code);
				
				 //comando para encerra a aplica��o como um todo
				 System.exit(1);
	} else  if (minhaRetirada.equalsIgnoreCase("n�o")){
		
		System.out.println("Tudo bem, quando decidi � s� nos avisar!");
	}	
		
		
	}
}
