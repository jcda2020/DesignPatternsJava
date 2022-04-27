package subject;

public class Doorman extends Subject{

	private boolean status = false;

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
		
		notifyObservers(status);
		
	}
	
	
	
	
	
}
