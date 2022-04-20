package aula14.br.ufpe.cin.dados;

import aula14.br.ufpe.cin.banco.ContaAbstrata;

/**
 * Defina a interface aula14.br.ufpe.cin.dados.RepositorioContas com os metodos 
 *   -> inserir   - recebe uma ContaAbstrata e insere no repositorio
 *   -> procurar  - recebe um numero e retorna a conta se estiver no repositorio
 *   -> remover   - recebe um numero para remover a conta do repositorio
 *   -> atualizar - recebe uma ContaAbstrata para atualizar no repositorio
 *   -> existe    - recebe um numero e informa se existe uma conta com este numero no repositorio 
 *
 */
public interface RepositorioContas {
	  void inserir(ContaAbstrata conta);
	  ContaAbstrata procurar(String numero);
	  void remover(String numero);
	  void atualizar(ContaAbstrata conta);
	  boolean existe(String numero);

}
