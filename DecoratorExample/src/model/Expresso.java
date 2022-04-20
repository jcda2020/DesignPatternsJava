package model;

public class Expresso implements Coffee{

	@Override
	public void make() {
		// TODO Auto-generated method stub
		
		System.out.println("35 ml do mais puro café com água quente, sob alta pressão pelo café moído ");
		
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 4.5;
	}

}
