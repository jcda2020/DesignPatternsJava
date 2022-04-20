import builder.CarroBasicoBuilder;
import builder.CarroBuilder;
import builder.CarroTurbinado1;
import builder.CarroTurbinado2;
import director.DirectorCar;

public class Cliente {

	public static void order(String opcao, CarroBuilder builder) {
		DirectorCar director = new DirectorCar(builder);
		
		System.out.println(opcao);
		director.makeCar();
		System.out.println(director.getMontagem());
		
		System.out.println("<--------------------> \n");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated met;hod stub

		order("Carro básico", new CarroBasicoBuilder());
		
		order("Carro Turbinado 1", new CarroTurbinado1());
		order("Carro Turbinado 2", new CarroTurbinado2());
		
	}

}
