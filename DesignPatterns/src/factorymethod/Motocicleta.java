package factorymethod;

public class Motocicleta implements Veiculo{


	@Override
	public void getCarga() {
		System.out.println("Encomenda entregue ao transportador");
		
	}
	

	@Override
	public void startRoute() {
	System.out.println("Entrega em andamento.");
		getCarga();
	}

}
