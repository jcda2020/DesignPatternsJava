package observernotifyforce;

import factoryjedai.JediOrder;

public class Force extends CosmosEnergyField implements TheForceObserver{
		
	private JediOrder anyJedi;	
	
	@Override
	public void jediPresence(JediOrder anyJedi) {
		// TODO Auto-generated method stub
		notifyOfForce(anyJedi);
	}

}
