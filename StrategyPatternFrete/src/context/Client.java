package context;

import model.Frete;
import model.Sedex;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sedex sedex = new Sedex();
		
		double peso = sedex.getPeso(20, 10, 15);
		
		
		Frete frete = new Frete(sedex);
		
		 System.out.println( frete.shippingPrice(peso));


		
		
	}

}
