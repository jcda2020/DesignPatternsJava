package factoryjedai;

public abstract class FactoryAbstractJedi implements JediOrder {

	public void startJedi() {
		
		JediOrder jediOrder = createNewJedi();
		
	}
	
	protected abstract JediOrder createNewJedi();
	
	
}
