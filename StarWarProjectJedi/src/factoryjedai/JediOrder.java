package factoryjedai;

import observernotifyforce.TheForceObserver;

public interface JediOrder extends TheForceObserver{

	void selfControl();
	void telecinese();
	
	default void VisionsOfForce() {};
	default void ForceSensitives() {};
	default void StormsOfForce() {};
	default void AbsorbForceStorms() {};
	default void senseDangers() {};
	default void speedOfForce() {};
	default void telepathy() {};
	default void buildsLightSaber() {};
	default void persuasion() {};
	default void forceLeap() {};
	default void forceBalance() {};
	default void forceCamouflage() {};
	
	
	
	
}
