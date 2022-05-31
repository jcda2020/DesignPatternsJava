package factoryjedai;

import decoratorjedai.DecoratorAbstractJedi;

public class FactoryConcreteJedi extends FactoryAbstractJedi{

	
	@Override	
	protected JediOrder createNewJedi() {


		return new Jedi();
	}

	@Override
	public void selfControl() {
		// TODO Auto-generated method stub
		new Jedi().selfControl();
	}

	@Override
	public void telecinese() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jediPresence(JediOrder anyJedi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jediAttack() {
		// TODO Auto-generated method stub
		new Jedi().jediAttack();
	}

}
