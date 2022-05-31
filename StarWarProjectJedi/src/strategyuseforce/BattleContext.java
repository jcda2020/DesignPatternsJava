package strategyuseforce;

import factoryjedai.JediOrder;

public class BattleContext {

	private ArtOfwar combat;

	public BattleContext(ArtOfwar combat) {
		
		this.combat = combat;
	}
	
	public void jediSkills() {
		combat.jediAttack();
	}
	
	
	
	
}
