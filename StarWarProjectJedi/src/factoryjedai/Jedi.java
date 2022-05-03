package factoryjedai;

import observernotifyforce.TheForceObserver;

public class Jedi implements JediOrder{
	//roupa do jedi
	private String jediClothing;
	//trança
	private boolean braid;
	//cor do sabre de luz
	private String lightSaberColor;
	// planeta de origem
	private String homePlanet;
	
	
	@Override
	public void jediPresence(JediOrder anyJedi) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "Jedi [jediClothing=" + jediClothing + ", braid=" + braid + ", lightSaberColor=" + lightSaberColor
				+ ", homePlanet=" + homePlanet + "]";
	}
	
	
	
	
	
}
