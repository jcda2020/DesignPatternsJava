package desafiofactory;

import java.util.ArrayList;

public abstract class Services {

	public abstract PromoterServices createService();
	
	public void runServices() {
		
		PromoterServices promotora = createService();			
		promotora.showServices();
		promotora.cargaHoraria();	
	}
	
	
	public void showTitle(PromoterServices service) {
		
		if (service instanceof Courses) {
			
			System.out.println("Serviço: " + ((Courses) service).getTitulo());  
		}
	}
	
}
