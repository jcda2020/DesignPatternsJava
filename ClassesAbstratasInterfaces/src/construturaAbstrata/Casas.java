package construturaAbstrata;

public class Casas extends Imoveis{

	public Casas (String registro, double metro) {
		
		super(registro, metro);
	}
	
	
	public double precoMetroQuadradoImovel(double valor) {
		// TODO Auto-generated method stub
     this.valorImovel= (this.metroQuadrado * valor);
		
		return this.valorImovel;
		
		
	}

	
	public double aplicaDesconto(Imoveis casa) {
		double desconto = 0;
		desconto = 350;
		
		this.valorImovel = this.valorImovel - desconto;
		
		return desconto;
		
	}
	
	
}
