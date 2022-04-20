package builder;

import model.Carro;

public abstract class CarroBuilder {

	Carro carro;
	
	public CarroBuilder() {
		carro = new Carro();
	}
	
	public Carro getCarro() {
		
		return carro;
	}
	
	
	public abstract void BuildarCondicionado();
	public abstract void BuildDirecao ();
	public abstract void BuildQuantidadeAirbags();
	public abstract void BuildRetrovisor();
	public abstract void BuildPainel();
	public abstract void BuildControleDoAr();
	public abstract void BuildMultimidia();
	public abstract void BuildcomandoVoz();
	
}
