package factoryjedai;

public abstract class FactoryAbstractJedi {

	public void startJedi() {
		
		JediOrder jediOrder = createNewJedi();
		
	}
	
	protected abstract JediOrder createNewJedi();
	
	
}
