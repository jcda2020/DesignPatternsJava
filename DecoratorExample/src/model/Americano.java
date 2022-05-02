package model;

public class Americano implements Coffee{

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("      American Coffee! ");
		
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 6.5;
	}

}
