package observers;

public class GirlFriend  implements Observer{

		
	
	@Override
	public void update(boolean status) {
		// TODO Auto-generated method stub
		
		if(status) {
			
			partyTime();
		}
		else {
			
			System.out.println("Ele ainda não chegou!");
		}
		
	}

	private void partyTime() {
		// TODO Auto-generated method stub
		System.out.println("Vamos começar a festa!");
	}

}
