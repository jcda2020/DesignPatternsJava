package factorymethod;

public class MotoclicetaTransporte extends Transporte {

	@Override
	protected Veiculo createTransport() {
		// TODO Auto-generated method stub
		return new Motocicleta();
	}

}
