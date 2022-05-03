package observernotifyforce;

import java.util.ArrayList;
import java.util.List;

import factoryjedai.JediOrder;

public abstract class CosmosEnergyField {

	private List<JediOrder>	sensitiveList = new ArrayList<>();
	
	public void addPerson(JediOrder anyJedi) {
		
		sensitiveList.add(anyJedi);
	}
	
 public void remove(JediOrder anyJedi) {
		
		sensitiveList.remove(anyJedi);
	}
 
 public void notifyOfForce(JediOrder anyJedi) {
	 anyJedi.jediPresence(anyJedi);
	 
 }
	
}
