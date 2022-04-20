package factorymethod;

public class Carro implements Veiculo{

	@Override
	public void getCarga() {
		System.out.println("Passageiro embarcado");
		
	}
	

	@Override
	public void startRoute() {
	System.out.println("Corrida em andamento.");
		getCarga();
	}

}
