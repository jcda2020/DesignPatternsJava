package construturaAbstrata;

public class Apartamentos extends Imoveis{

	
	public Apartamentos(String registro, double metro) {
		super(registro, metro);
		// TODO Auto-generated constructor stub
	}

	public double precoMetroQuadradoImovel(double valor) {
		// TODO Auto-generated method stub
this.valorImovel= (this.metroQuadrado * valor);
		
		return this.valorImovel;
	}

}
