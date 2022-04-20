package factorymethod;

public abstract class Transporte {

	public void startTransport()
    {

        Veiculo veiculo = createTransport();
        veiculo.startRoute();

    }

    protected abstract Veiculo createTransport();


	
	
}
