package model;

public class Americano implements Coffee{

	@Override
	public void make() {
		// TODO Auto-generated method stub
		System.out.println("de 25 a 45 ml do mais puro caf� com �gua quente, adi��o de caf� variando a partir do ml de �gua ");
		
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 6.5;
	}

}
