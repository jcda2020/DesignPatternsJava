package construturaAbstrata;

public class LancamentosImoveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Casas casa  = new Casas("RC-4560", 40);
		
		Apartamentos apt = new Apartamentos ("AP-5679", 60);
		
		casa.precoMetroQuadradoImovel(1000);
		
		System.out.println("valor inicial da casa: " +casa.getValorImovel());
		
		double desconto = 0;
		
		
		
		
		System.out.println("Desconto inicial: " + desconto);
		desconto = casa.aplicaDesconto(casa);
		System.out.println("Desconto da casa: " + desconto);
		
		System.out.println("Valor da casa: " + casa.getValorImovel());
		
		apt.precoMetroQuadradoImovel(5000);
		
		desconto = apt.aplicaDesconto(apt);
		System.out.println("Desconto do apartamento: " + desconto);
		System.out.println("Valor do apartamento: " + apt.getValorImovel());
		
		
		
		
		
		
	}

}
