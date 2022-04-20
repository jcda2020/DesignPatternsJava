package construturaAbstrata;

public abstract class Imoveis {

	private boolean escritura;
	private String registro, endereco;
	private  int quantidadeAmbientes;
	protected double valorImovel;
	protected double metroQuadrado;
	
	public Imoveis() {
		
		this.registro = "Registro em atualização";
		this.endereco = "A definir";
	}
	
	
	public Imoveis (String registro, double metro) {
		
		this.registro = registro;
		this.metroQuadrado = metro;
	}
	
	public Imoveis(boolean escritura, String registro, String endereco, int quantidadeAmbientes, double valorImovel,
			double metroQuadrado) {
		super();
		this.escritura = escritura;
		this.registro = registro;
		this.endereco = endereco;
		this.quantidadeAmbientes = quantidadeAmbientes;
		this.valorImovel = valorImovel;
		this.metroQuadrado = metroQuadrado;
	}
	public boolean getEscritura() {
		return escritura;
	}
	public void setEscritura(boolean escritura) {
		this.escritura = escritura;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getQuantidadeAmbientes() {
		return quantidadeAmbientes;
	}
	public void setQuantidadeAmbientes(int quantidadeAmbientes) {
		this.quantidadeAmbientes = quantidadeAmbientes;
	}
	public double getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}
	public double getMetroQuadrado() {
		return metroQuadrado;
	}
	public void setMetroQuadrado(double metroQuadrado) {
		this.metroQuadrado = metroQuadrado;
	}
	
	
	// método abstrato
	public abstract double precoMetroQuadradoImovel(double valor);
	
	
	
	// métodos concretos
	public double aplicaDesconto (Imoveis imovel) {
		double desconto = 0;
		
		if (imovel instanceof Casas) {
			
			desconto = 500;
		}
		
		if (imovel instanceof Apartamentos) {
			
			desconto = 2000;
		}
		
		
		this.valorImovel = this.valorImovel - desconto;
		
		return desconto;
		
	}
	
	
	
}
