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

	@Override
	public void selfControl() {
		// TODO Auto-generated method stub
		jediOrder.selfControl();
	}

	@Override
	public void telecinese() {
		// TODO Auto-generated method stub
		System.out.println("start do treinamento da telecinese");
	}
	
	
	@Override
	public void senseDangers() {
		
		System.out.println("Perigo eminente");
	};
	
	@Override
	public void speedOfForce(double speed) {
		int [] increaseSpeed = {2,3,4,5};
		double faster = 0;
		
			for (int i = 0; i < increaseSpeed.length; i++) {
				faster = speed + speed * increaseSpeed[i];
			}
			
			
			System.out.println(faster + " m/s");
			
	
	
	}

	@Override
	public void jediAttack() {
		// TODO Auto-generated method stub
		jediOrder.jediAttack();
	};
	
	
	
	
	

}
