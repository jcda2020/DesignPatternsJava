package concrete.strategy;

import service.strategy.FreteServiceStrategy;

public class Sedex  implements FreteServiceStrategy{

	@Override
	public double calcula(double peso) {
		// TODO Auto-generated method stub
		return 40;
	}

}
