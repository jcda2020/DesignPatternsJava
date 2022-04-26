package model;



import java.util.Random;

import service.AuxilioBrasil;

public class UserSaqueBrasil  implements AuxilioBrasil{

	private String cpf;
	private Integer codigo;

	public UserSaqueBrasil() {
		
		
	}
	
	public UserSaqueBrasil(String cpf) {
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "SaqueBrasil [cpf=" + cpf + ", codigo=" + codigo + "]";
	}

	@Override
	public void saque(int codigo) {
		// TODO Auto-generated method stub		
		System.out.println("Permissão gerada com sucesso. Saque liberado!");			
		
	}


	public int generateCode() {		
		
		int cod = 0;
		Random random = new Random(); 
		
		
		
		for (int i = 1; i < 100; i = i + 2) {			
				
				cod =  random.nextInt(10000) + 15 * i;
			
		}
		
		setCodigo(cod);
		System.out.println("Código gerado com sucesso!");
		return cod;		
		
	}
	
	

	
	
}
