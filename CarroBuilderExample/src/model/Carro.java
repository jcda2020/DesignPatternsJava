package model;

public class Carro {
	private boolean arCondicionado;
	private String direcao;
	private int quantidadeAirbags;
	private String retrovisor;
	private String painel;
	private String controleDoAr;
	private boolean multimidia;
	private boolean comandoVoz;
	
	
	public boolean getArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public String getDirecao() {
		return direcao;
	}
	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}
	public int getQuantidadeAirbags() {
		return quantidadeAirbags;
	}
	public void setQuantidadeAirbags(int quantidadeAirbags) {
		this.quantidadeAirbags = quantidadeAirbags;
	}
	public String getRetrovisor() {
		return retrovisor;
	}
	public void setRetrovisor(String retrovisor) {
		this.retrovisor = retrovisor;
	}
	public String getPainel() {
		return painel;
	}
	public void setPainel(String painel) {
		this.painel = painel;
	}
	public String getControleDoAr() {
		return controleDoAr;
	}
	public void setControleDoAr(String controleDoAr) {
		this.controleDoAr = controleDoAr;
	}
	public boolean isMultimidia() {
		return multimidia;
	}
	public void setMultimidia(boolean multimidia) {
		this.multimidia = multimidia;
	}
	public boolean isComandoVoz() {
		return comandoVoz;
	}
	public void setComandoVoz(boolean comandoVoz) {
		this.comandoVoz = comandoVoz;
	}
	@Override
	public String toString() {
		return "Carro [arCondicionado=" + arCondicionado + ", direcao=" + direcao + ", quantidadeAirbags="
				+ quantidadeAirbags + ", retrovisor=" + retrovisor + ", painel=" + painel + ", controleDoAr="
				+ controleDoAr + ", multimidia=" + multimidia + ", comandoVoz=" + comandoVoz + "]";
	}
	
	
	
	
	
	
	
}
