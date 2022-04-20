package factorymethod;

public class Corridas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transporte transporte = null;
		
		String pedido = "uber moto";
		
		if (pedido.equalsIgnoreCase("uber carro")) {
			
			transporte = new CarroTransporte();
		}
		else if(pedido.equalsIgnoreCase("uber moto")) {
			
			transporte = new MotoclicetaTransporte();
		}
		
		if (transporte != null) {
			
			transporte.startTransport();
		}
		
	}

}
