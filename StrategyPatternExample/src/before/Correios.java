package before;

public class Correios {

	public double calculaRemessa(String servico, double peso) {
		// TODO Auto-generated method stub		
		
		if (servico.equalsIgnoreCase("Sedex")) {
			
			return 40;
			
		} else if(servico.equalsIgnoreCase("Pac")) {
			
			return  20 ;
		}
		
		
		return 0;
		
	
	}

}
