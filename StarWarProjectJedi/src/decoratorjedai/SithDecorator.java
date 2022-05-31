package decoratorjedai;

import factoryjedai.JediOrder;

public class SithDecorator extends DecoratorAbstractJedi{

	public SithDecorator(JediOrder jediOrder) {
		super(jediOrder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void selfControl() {
		// TODO Auto-generated method stub
		System.out.println("Raiva, ódio e vigança levam a desenvolver habilidades mais profundas da força!");
	}

	@Override
	public void jediPresence(JediOrder anyJedi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jediAttack() {
		// TODO Auto-generated method stub
		jediOrder.jediAttack();
		
	}
	
	
	@Override
	public void speedOfForce(double speed) {
		int [] increaseSpeed = {2,3,4,5};
		double faster = 0;
		
			for (int i = 0; i < increaseSpeed.length; i++) {
				faster = speed + speed * increaseSpeed[i];
			}
			
			
			System.out.println(faster + " m/s");
			
	
	
	}
	

}
