package desafiofactory;

import java.util.Scanner;

public class PlatformServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		String tipoService = "curso";
		
		
		Services service = null;
		
		if (tipoService.equalsIgnoreCase("curso")) {
		
			
		service = new FactoryCurso();
		}
		
		
		
		if (service != null) {
		service.runServices();
		}
		
	}

}
