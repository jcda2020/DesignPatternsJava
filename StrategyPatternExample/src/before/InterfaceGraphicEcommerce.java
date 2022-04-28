package before;

public class InterfaceGraphicEcommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frete meuFrete = new Frete();
		
		double valorDoFrete = 0;
		double peso = 10;
		
		valorDoFrete = meuFrete.calculaFrete("Sedex", peso);
		System.out.println("Valor via Sedex: " + valorDoFrete + "\n");
		
		valorDoFrete = meuFrete.calculaFrete("Pac", peso);
		System.out.println("Valor via Pac: " + valorDoFrete + "\n");
		
		valorDoFrete = meuFrete.calculaFrete("FedEx", peso);
		System.out.println("Valor via FedEx: " + valorDoFrete + "\n");
		
		valorDoFrete = meuFrete.calculaFrete("Loggi", peso);
		System.out.println("Valor via Loggi: " + valorDoFrete + "\n");
		
		valorDoFrete = meuFrete.calculaFrete("AliExpress", peso);
		System.out.println("Valor via AliExpress: " + valorDoFrete + "\n");
		
		valorDoFrete = meuFrete.calculaFrete("GearBest", peso);
		System.out.println("Valor via GearBest: " + valorDoFrete + "\n");
		
		
		
		
		
	}

}
