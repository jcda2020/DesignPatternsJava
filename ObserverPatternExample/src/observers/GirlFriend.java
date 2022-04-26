package observers;

public class GirlFriend  implements Observer{

		
	
	@Override
	public void update(boolean status) {
		// TODO Auto-generated method stub
		
		if(status) {
			
			partyTime();
		}
		else {
			
			System.out.println("He did not arrive");
		}
		
	}

	private void partyTime() {
		// TODO Auto-generated method stub
		System.out.println("Let's start the party!");
	}

}
