package drivethruproxyentrega;

import observerdelivery.SubjectPedidos;

public class PostoColetaProxy  extends SubjectPedidos  implements EntregaPedido{

	private UserDelivery user;
	
	private boolean status = false;

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
		
		notifyObservers(status);
		
	}
	
		
	public PostoColetaProxy(UserDelivery user) {	
		this.user = user;
	}

	@Override
	public void retiraPedido(int codigo) {
		// TODO Auto-generated method stub
		
		
		if(confirmaRetirada(codigo)) {
			
			user.retiraPedido(codigo);
			
		}
		
	}
	
	
	public boolean confirmaRetirada(int codigo) {
		
		boolean confirm = false;
		
		

		if(user.getCodigo() == codigo) {
		
			confirm = true;
		
		}else {
			
			System.out.println("Código digitado está errado! ):");
		}
		
		
		return confirm;
		
		
	}

}
