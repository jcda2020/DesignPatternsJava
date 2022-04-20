package model;

public interface Coffee {
	//faz a bebida
	void make();
	// retorna o preço
	Double getPrice();
	
	public default void addMilk() {}
}
