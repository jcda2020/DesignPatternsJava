package subject;

import java.util.ArrayList;
import java.util.List;

import observers.Observer;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();
	
	public void add(Observer observer) {
		
		observers.add(observer);
	}
	
	 public void remove(Observer observer){
	        observers.remove(observer);
	    }
	
	public void notifyObservers(boolean status) {
		
		for(Observer obj: observers) {
			 obj.update(status);
			
		}
		
		
	}
	
	
}
