package aula14.br.ufpe.cin.banco;

import aula14.br.ufpe.cin.dados.RepositorioContas;

/**
 * Modifique a classe Banco para utilizar a interface
 * definida (receba a implementacao da interface no construtor).
 * Perceba que a classe Banco compila apenas com a interface. 
 * Ja a classe Programa precisa de uma implementacao para executar.
 * 
 */
public class Banco {

	private RepositorioContas contas;
	
	private final double TAXA = 0.008;

	public Banco(RepositorioContas rep) {
		this.contas = rep;
	}

	public void cadastrar(ContaAbstrata conta) {
		String numero = conta.getNumero();
		if (contas.existe(numero)) {
			throw new RuntimeException("Conta j‡ cadastrada");
		} else {
			contas.inserir(conta);
		}
	}

	public void creditar(String numero, double valor) {
		ContaAbstrata c = contas.procurar(numero);
		c.creditar(valor);
	}

	public void debitar(String numero, double valor) {
		ContaAbstrata c = contas.procurar(numero);
		c.debitar(valor);
	}

	public double getSaldo(String numero) {
		ContaAbstrata c = contas.procurar(numero);
		return c.getSaldo();
	}

	public void transferir(String de, String para, double valor) {
		ContaAbstrata origem = contas.procurar(de);
		ContaAbstrata destino = contas.procurar(para);
		origem.debitar(valor);
		destino.creditar(valor);
	}
	
	public void renderJuros(String numero) {
		ContaAbstrata c = contas.procurar(numero);
		if (c instanceof Poupanca) {
			((Poupanca) c).renderJuros(TAXA);
		} 
		else {
			throw new RuntimeException("O numero nao eh de Poupanca");
		}
	}

	public void renderBonus(String numero) {
		ContaAbstrata c = contas.procurar(numero);
		if (c instanceof ContaEspecial) {
			((ContaEspecial) c).renderBonus();
		} 
		else {
			throw new RuntimeException("O numero nao eh de ContaEspecial");
		}
	}

}