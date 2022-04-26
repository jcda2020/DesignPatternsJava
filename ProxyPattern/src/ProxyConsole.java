import Solucao2.UserAuxilioProxy;
import model.UserSaqueBrasil;
import service.AuxilioBrasil;
import service.CorrespondenteBancarioProxy;

public class ProxyConsole {
	
	
	public static void main(String[] args) {
		
		AuxilioBrasil user = new UserSaqueBrasil("22222222221");
	
		AuxilioBrasil user2 = new UserSaqueBrasil("32323244404");
		
		int codigo =((UserSaqueBrasil) user).generateCode();	
			
		
		
		System.out.println("Código gerado: "+ codigo);
		System.out.println(((UserSaqueBrasil) user).getCodigo());
		System.out.println("CPF do beneficiado que solicitou: " + ((UserSaqueBrasil) user).getCpf());
	
	   AuxilioBrasil auxilio  = new CorrespondenteBancarioProxy(user);
	   auxilio.saque(codigo);
	   System.out.println("---Nova solicação----");
	   System.out.println("CPF do beneficiado que solicitou: " + ((UserSaqueBrasil) user).getCpf());
	   auxilio.saque(codigo + 5);
	  System.out.println("----------------------------------------------------");
	   
	   int codigo2 =((UserSaqueBrasil) user2).generateCode();	
	   
	   System.out.println("Código 2 gerado: "+ codigo2);
		System.out.println(((UserSaqueBrasil) user2).getCodigo());
		System.out.println("CPF do beneficiado que solicitou: " + ((UserSaqueBrasil) user2).getCpf());
	   AuxilioBrasil auxilio2  = new CorrespondenteBancarioProxy ( user2);
	   
	   
	   auxilio2.saque(codigo2);
	   
	   
	   
	   AuxilioBrasil user3 = new UserSaqueBrasil("44455555512");
	   int cod3 = ((UserSaqueBrasil)user3).generateCode();
	   
	   AuxilioBrasil auxilioi3 = new UserAuxilioProxy((UserSaqueBrasil) user3);
	   System.out.println("CPF do beneficiado que solicitou: " + ((UserSaqueBrasil) user3).getCpf());
	   auxilioi3.saque(cod3);
	 	   
	   //----------------------------------------------------------------
	   UserSaqueBrasil user5 = new UserSaqueBrasil("70558944402");
	   int code = user5.generateCode();
	   
	   AuxilioBrasil beneficioEmergencial = new UserAuxilioProxy(user5);
	   System.out.println("CPF do solicitante: " + user5.getCpf());
	   beneficioEmergencial.saque(code);  
	   
	   
		
	}

}
