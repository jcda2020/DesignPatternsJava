package desafiofactory;

public class FactoryCurso extends Services{

	
	
	@Override
	public PromoterServices createService() {
		// TODO Auto-generated method stub	
		
		
		return new Courses();
	}

	
	
}
