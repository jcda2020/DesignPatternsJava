package observers;

public class Friends implements Observer{

	@Override
	public void update(boolean status) {
		// TODO Auto-generated method stub
		
		if (status) {
			
			sendGrif();
			
		} else {
			
			System.out.println("Silence, he did not arrive");
		}
		
	}

	private void sendGrif() {
		// TODO Auto-generated method stub
		System.out.println("Happy birthday to you. Here's your gift!");
	}

}
