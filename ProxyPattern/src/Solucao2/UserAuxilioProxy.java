package Solucao2;

import model.UserSaqueBrasil;
import service.AuxilioBrasil;

public class UserAuxilioProxy  implements AuxilioBrasil{

	UserSaqueBrasil user;

	public UserAuxilioProxy(UserSaqueBrasil user) {
		
		this.user = user;
	}

	@Override
	public void saque(int codigo) {
		// TODO Auto-generated method stub
		
		
		if (verificaCodigo(codigo)) {
			
			
			
			user.saque(codigo);
			
			System.out.println( "Conferência do CPF: "  +  user.getCpf() + "\n");
			
			
		}else {
			System.out.println("O código não confere!");
		}
		
	}
	
	public boolean verificaCodigo(int codigo) {
		boolean match = false;		
		
		
		
		if(user.getCodigo() == codigo) {
		
			match = true;
		
		}
		return match;	
	}
	
	
	
	
}
