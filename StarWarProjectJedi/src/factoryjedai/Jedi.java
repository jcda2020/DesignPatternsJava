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
	
	private double velocity;
	
	
	public String getJediClothing() {
		return jediClothing;
	}


	public void setJediClothing(String jediClothing) {
		this.jediClothing = jediClothing;
	}


	public boolean getBraid() {
		return braid;
	}


	public void setBraid(boolean braid) {
		this.braid = braid;
	}


	public String getLightSaberColor() {
		return lightSaberColor;
	}


	public void setLightSaberColor(String lightSaberColor) {
		this.lightSaberColor = lightSaberColor;
	}


	public String getHomePlanet() {
		return homePlanet;
	}


	public void setHomePlanet(String homePlanet) {
		this.homePlanet = homePlanet;
	}


	public double getVelocity() {
		return velocity;
	}


	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}


	@Override
	public void jediPresence(JediOrder anyJedi) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "Jedi [jediClothing=" + jediClothing + ", braid=" + braid + ", lightSaberColor=" + lightSaberColor
				+ ", homePlanet=" + homePlanet + "]";
	}


	@Override
	public void selfControl() {
		// TODO Auto-generated method stub
		System.out.println("Sabre de luz horizontalmente, à frente do corpo,\n com o punho do sabre logo abaixo do queixo");
	}



	@Override
	public void jediAttack() {
		// TODO Auto-generated method stub
		
		jediAttack();
		
	}
	
	
	
	
	
}
