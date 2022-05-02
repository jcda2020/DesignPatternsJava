package observerdelivery;

import java.util.ArrayList;
import java.util.List;


public abstract class SubjectPedidos {

private List<ObserverPreparoPedido> observersClients = new ArrayList<>();
	
	public void add(ObserverPreparoPedido observer) {
		
		observersClients.add(observer);
	}
	
	
public void addAll(List <ObserverPreparoPedido> observer) {
		
		observersClients.addAll(observer);
	}
	
	
	 public void remove(ObserverPreparoPedido observer){
		 observersClients.remove(observer);
	    }
	
	public void notifyObservers(boolean status) {
		
		for(ObserverPreparoPedido obj: observersClients) {
			 obj.update(status);
			
		}
		
		
	}
	
	
}
