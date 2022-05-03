package factoryjedai;

public class FactoryConcreteJedi extends FactoryAbstractJedi{

	@Override
	protected JediOrder createNewJedi() {


		return new Jedi();
	}

}
