package factorymethod;

public class CarroTransporte extends Transporte{

	@Override
	protected Veiculo createTransport() {
		// TODO Auto-generated method stub
		return new Carro();
	}

}
