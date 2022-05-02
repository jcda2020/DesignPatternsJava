package observerdelivery;

public class GuyDelivery  implements ObserverPreparoPedido{

	private String userAccount;	
	
	public GuyDelivery(String userAccount) {
		
		this.userAccount = userAccount;
	}


	public String getUserAccount() {
		return userAccount;
	}


	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	
	@Override
	public void update(boolean status) {
		// TODO Auto-generated method stub
		
		if(status) {
			
			collectOrder();
		}
		
	}
	
	
	private void collectOrder() {
		
		System.out.println("Entregador(a) "+ this.userAccount.toUpperCase() +  " se dirigindo ao estabelecimento para buscar a entrega!");
	}


	

}
