package aula14.br.ufpe.cin.dados;

import aula14.br.ufpe.cin.banco.ContaAbstrata;

/**
 * Defina a classe aula14.br.ufpe.cin.dados.RepositorioContasArray 
 * que implementa a interface RepositorioContas 
 *
 */
public class RepositorioContasArray implements RepositorioContas {

	private ContaAbstrata[] contas;
	private int indice;

	public RepositorioContasArray(int tamanho) {
		contas = new ContaAbstrata[tamanho];
		indice = 0;
	}

	public void inserir(ContaAbstrata conta) {
		contas[indice] = conta;
		indice = indice + 1;
	}

	public ContaAbstrata procurar(String numero) {
		ContaAbstrata resposta = null;
		int i = this.getIndice(numero);
		if (i == this.indice) {
			throw new RuntimeException("Conta nao encontrada");
		} else {
			resposta = this.contas[i];
		}
		return resposta;
	}

	public void remover(String numero) {
		int i = this.getIndice(numero);
		if (i == this.indice) {
			throw new RuntimeException("Conta nao encontrada");
		} else {
			this.indice = this.indice - 1;
			this.contas[i] = this.contas[this.indice];
			this.contas[this.indice] = null;
		}
	}

	public void atualizar(ContaAbstrata conta) {
		int i = this.getIndice(conta.getNumero());
		if (i == this.indice) {
			throw new RuntimeException("Conta nao encontrada");
		} else {
			this.contas[i] = conta;
		}
	}

	public boolean existe(String numero) {
		int i = this.getIndice(numero);
		return (i != this.indice);
	}

	private int getIndice(String numero) {
		String n;
		boolean achou = false;
		int i = 0;
		while ((!achou) && (i < this.indice)) {
			n = contas[i].getNumero();
			if (n.equals(numero)) {
				achou = true;
			} else {
				i = i + 1;
			}
		}
		return i;
	}
}