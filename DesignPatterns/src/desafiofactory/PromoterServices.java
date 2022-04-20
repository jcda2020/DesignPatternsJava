package desafiofactory;

import java.util.ArrayList;

public interface PromoterServices {

	 ArrayList<String> itens();
	
	 void cargaHoraria();
	 
	 default void showServices() {
		
		 ArrayList<String> modulos = new ArrayList<>();
		 
		  modulos.addAll(itens());
		  
		  modulos.forEach(m -> System.out.println(m));	
		 
		 
	 }
	
	
	
}
