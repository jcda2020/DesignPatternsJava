package decoratorjedai;

import factoryjedai.JediOrder;

public class PadawanDecorator extends DecoratorAbstractJedi{

	public PadawanDecorator(JediOrder jediOrder) {
		super(jediOrder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jediPresence(JediOrder anyJedi) {
		// TODO Auto-generated method stub
		System.out.println(anyJedi + "presente no local!");
	}

}
