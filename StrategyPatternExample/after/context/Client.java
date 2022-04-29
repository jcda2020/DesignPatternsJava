package context;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import concrete.strategy.*;

import service.strategy.FreteServiceStrategy;

public class Client {
	//simulação de uma base de dados da família de algoritmos
	static List<FreteServiceStrategy> getServiceProviders(){
		
		List<FreteServiceStrategy> serviceProviders  = new ArrayList<>();
		
		serviceProviders.add(new Loggi());
		serviceProviders.add(new FedEx());
		serviceProviders.add(new GearBest());
		serviceProviders.add(new Aliexpress());
		
		
		
		return serviceProviders;	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// versão 1.0
		
				double peso = 10;
				
				double priceService = 0;
				
				Frete frete;
				
				frete = new Frete(new FedEx());
				
				 priceService =  frete.calcula(peso);
				 
				 
				 System.out.println("Valor do frete do FedEx: " + priceService);
				 
				 frete = new Frete(new Correios(new Sedex()));
				 
				 priceService = frete.calcula(peso);
				 
				 System.out.println("Valor do frete dos Correios via sedex: " + priceService);
				 
		
		//versão 1.1		
		
		Frete entrega;
		// ArrayList na aplicação client para carregar da base de dados
		List<FreteServiceStrategy> providers  = new ArrayList<>();
		
 // trazendo a lista de provedores para o contexto do cliente
			providers.addAll(getServiceProviders()) ;			
		
 // pense numa forma de fazer uma busca providers.forEach(p -> System.out.println(p));			
		
		Scanner opcao = new Scanner(System.in);
		
		double valorDaEntrega = 0;
		String escolha;		
		
		System.out.println("Escolha um empresa parceira para seu frete: ");
		System.out.println(" Loggi,\n FedEx,\n GearBest,\n AliExpress");
				
		escolha = opcao.next();
		
			if ( escolha.equalsIgnoreCase("Loggi")) {
				//instaciação da classe Frete
				entrega = new Frete(providers.get(0));
				 valorDaEntrega = entrega.calcula(peso);
			}
			
			if ( escolha.equalsIgnoreCase("FedEx")) {
				
				entrega = new Frete(providers.get(1));
				 valorDaEntrega =   entrega.calcula(peso);
			}
				
			if ( escolha.equalsIgnoreCase("GearBeste")) {
				
				entrega = new Frete(providers.get(2));
				 valorDaEntrega =   entrega.calcula(peso);
			}
			
			if ( escolha.equalsIgnoreCase("Aliexpress")) {
				
				entrega = new Frete(providers.get(3));
				 valorDaEntrega =   entrega.calcula(peso);
			}
			
			
			
		System.out.println("Valor da entrega do prestador " + escolha + ": " + valorDaEntrega);
		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		
	}

}
