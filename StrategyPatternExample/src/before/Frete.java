package before;

public class Frete {		
	
	
	public double calculaFrete(String servico, double peso) {
		double valorDoServico = 0;	
		Correios correios = new Correios();
		AliExpress aliExpress = new AliExpress();
		GearBest gearBest = new GearBest();
		FedEx fed = new FedEx();
		Loggi loggi = new Loggi();
		
		
		
		if(servico.equalsIgnoreCase("Sedex")) {
			
			valorDoServico = correios.calculaRemessa(servico, peso);
			
		} 
			else if(servico.equalsIgnoreCase("Pac")) {
			
			valorDoServico = correios.calculaRemessa(servico, peso);
		}
			else if(servico.equalsIgnoreCase("Aliexpress")) {
				
				valorDoServico = aliExpress.calculaRemessaAli(peso);
			}
			else if(servico.equalsIgnoreCase("GearBest")) {
				
				valorDoServico = gearBest.calculaRemessa(servico, peso);
			}
				else if(servico.equalsIgnoreCase("FedEx")) {
					
					valorDoServico = fed.calculaRemessaFedEx(peso);
				}

					else if(servico.equalsIgnoreCase("Loggi")) {
					
					valorDoServico = loggi.calculaRemessaLoggi(peso);
				}		
		
		
		return valorDoServico;
		
		
	}
	
	
}
