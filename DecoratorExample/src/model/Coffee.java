package model;

public interface Coffee {
	//faz a bebida
	void make();
	// retorna o pre�o
	Double getPrice();
	
	public default void addMilk() {}
}
