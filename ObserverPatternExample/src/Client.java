import subject.Doorman;
import observers.*;

public class Client {

	public static void main(String[] args) {
		
		//porteiro
		Doorman doorman = new Doorman();
		
		// adicionar na lista quem será notificado
		doorman.add(new GirlFriend());
		doorman.add(new Friends());
		
		System.out.println("Opa, o rapaz chegou!");
		doorman.setStatus(true);
		
		
		
		
	}
	
	
	
	
}
