package factoryjedai;

import observernotifyforce.TheForceObserver;
import strategyuseforce.ArtOfwar;

public interface JediOrder extends TheForceObserver, ArtOfwar{

	void selfControl();
	
	default void telecinese() {};
	default void VisionsOfForce() {};
	default void ForceSensitives() {};
	default void StormsOfForce() {};
	default void AbsorbForceStorms() {};
	default void senseDangers() {};
	default void speedOfForce(double speed) {};
	default void telepathy() {};
	default void buildsLightSaber() {};
	default void persuasion() {};
	default void forceLeap() {};
	default void forceBalance() {};
	default void forceCamouflage() {};
	
	
	
	
}
