package decoratorjedai;

import factoryjedai.JediOrder;

public abstract class DecoratorAbstractJedi implements JediOrder{

	protected JediOrder jediOrder;

	public DecoratorAbstractJedi(JediOrder jediOrder) {
		
		this.jediOrder = jediOrder;
	}
	
	
	
}
