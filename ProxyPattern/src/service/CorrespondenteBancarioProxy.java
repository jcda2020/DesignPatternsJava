package service;

import model.UserSaqueBrasil;

public class CorrespondenteBancarioProxy implements AuxilioBrasil{

	private AuxilioBrasil auxilio;
	
	public CorrespondenteBancarioProxy(AuxilioBrasil auxilio) {
		
		this.auxilio =  auxilio;
		 
		
		
	}	
	@Override
	public void saque(int codigo) {
		// TODO Auto-generated method stub	
		
		
		if (verificaCodigo(codigo)) {
			
		
		
		((UserSaqueBrasil) auxilio).saque(codigo);
		
		System.out.println( "Conferência do CPF: "  +  ((UserSaqueBrasil) auxilio).getCpf() + "\n");
		
		
	}else {
		System.out.println("O código não confere!");
	}

	
		
	}
	
	
	public boolean verificaCodigo(int codigo) {
		boolean match = false;		
		
		
		
		if(((UserSaqueBrasil) auxilio).getCodigo() == codigo) {
		
			match = true;
		
		}
		return match;	
	}
}
